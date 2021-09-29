/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }




    public static void main(String[] args) throws IOException {

        //    int[][] weeklyMonthTemperatures = {
  //              {66, 64, 58, 65, 71, 57, 60},
  //              {57, 65, 65, 70, 72, 65, 51},
  //              {55, 54, 60, 53, 59, 57, 61},
  //              {65, 56, 55, 52, 55, 62, 57}
  //      };
 //       temp(weeklyMonthTemperatures);
 //       System.out.println(temp(weeklyMonthTemperatures));
//          System.out.println("-------------------------------------");
 //       List<String> votes = new ArrayList<>();
 //       votes.add("Bush");
 //       votes.add("Bush");
 //       votes.add("Bush");
//        votes.add("Hedge");
 //       votes.add("Shrub");
 //       votes.add("Bush");
  //      votes.add("Hedge");
  //      votes.add("Bush");
//
 //       String winner = tally(votes);

  //      System.out.println(winner + " received the most votes!");
  //      System.out.println("----------------------------------------------------");
        String sepFile = File.separator;
        String basePath = new File("").getCanonicalPath();

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Path path1;
        if (sepFile.equals("\\")){
            path1 = Paths.get(basePath+"/lib/src/main/resources/gates.js");
        }else{
            path1 = Paths.get(basePath+"/lib/main/resources/gates.js");
        }
        System.out.println(path1);
        missingSemicolon(path1);
    }

    public static HashMap<String, Integer> missingSemicolon(Path p1){
        int errorNumber = 0;
        int lineNumber = 0;
        try {
            File file = new File(String.valueOf(p1));    //creates a new file instance
            FileReader fileReader = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fileReader);  //creates a buffering character input stream
            StringBuffer strBuffer = new StringBuffer();    //constructs a string buffer with no characters
            String line;

            while ((line = br.readLine()) != null) {
                lineNumber = lineNumber + 1;
                if (!line.contains(";")
                        && !line.endsWith("}")
                        && !line.endsWith("{")
                        && !line.contains("if")
                        && !line.contains("else")
                        && !line.startsWith("//")
                        && !line.isBlank()
                ) {
                    errorNumber = errorNumber + 1;
                    System.out.println("In Line " + lineNumber + ": Missing semicolon.");
                }
                strBuffer.append(line);      //appends line to string buffer
                strBuffer.append("\n");     //line feed
            }
            fileReader.close();    //closes the stream and release the resources

        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap<String, Integer> lines= new HashMap<>();

        lines.put("ErrorCount", errorNumber);
        lines.put("LineCount", lineNumber);

        return lines;
    }
}

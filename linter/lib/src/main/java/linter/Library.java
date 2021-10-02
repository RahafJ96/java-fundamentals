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
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void ReadFile(String path){
        Scanner scnr = null;
        String response = "";
        int lineNumber = 1;

        try {
            scnr = new Scanner(new BufferedReader(new FileReader("./lib/src/main/resources/" + path)));
            String lines;
            while (scnr.hasNextLine()) {
                lines = scnr.nextLine();
                response += errorChecker(lines, lineNumber);
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        } finally {
            if (scnr != null) {
                scnr.close();
            }
        }
        if (response.equals("")) System.out.println("The file has no missing semicolons");
        else System.out.println(response);
    }


    private static String errorChecker(String line, int lineNumber) {
        char openCurly = '{';
        char closeCurly = '}';
        char semi = ';';
        char last = ' ';
        boolean ifCheck = line.contains("if");
        boolean elseCheck = line.contains("else");
        boolean singleQuoteCheck=line.contains("'");
        StringBuilder response = new StringBuilder();

        if (line.length() != 0) {
            last = line.charAt(line.length() - 1);
        }

        if (!ifCheck && !elseCheck && last != openCurly && last != closeCurly && line.length() != 0 && last != semi) {
            response.append("Line ").append(lineNumber).append(": Missing semicolon").append("\n");
        }
        if(!singleQuoteCheck){
            response.append(("Line")).append(lineNumber).append(": has double quotes").append("\n");
        }
        return response.toString();

    }
    public static void main(String[] args) throws FileNotFoundException {
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
        //      System.out.println("+++++++");

        Scanner input = new Scanner(new File(args[0]));
        while(input.hasNext()){
            ReadFile(input.nextLine());

        }

        System.out.println();
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

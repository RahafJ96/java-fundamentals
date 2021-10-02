/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    static int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };
    //Case 1
    public static int[] roll(int n){
        int rolls [] =new int[n];
        for(int i=0;i<rolls.length;i++){
            int randomRolls=(int)Math.ceil(Math.random() * 6);
            rolls[i]=randomRolls;
        }
        return rolls;

    }

    public static boolean containsDuplicates(int [] array){
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("the duplicated value is => "+ array[j]);
                    return true;

                }

            }

        }
        return false;
    }

    public static double average(int [] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static int[] arrayOfArray(int [] [] matrix){
        int rowSum=0;
        int total=0;
        int[]rowAvg=new int[matrix.length];
        for(int row=0;row<matrix.length;row++){
            rowSum=0;
            for (int column=0;column<matrix[row].length;column++){
                rowSum+=matrix[row][column];
                //total += matrix[row][column];
            }
            rowAvg[row]=rowSum/matrix[row].length;

        }
        return rowAvg;
    }

    //    Method to analyze given weather data as an array of arrays
//    prints the minimum and maximum values
//    prints the temperatures between minimum and maximum data that hasn't showed up
    public static void lowestAndHighestAvg(int[]temp){
        int min=temp[0];
        int max=temp[0];
        for(int i=1;i<temp.length;i++){
            if(temp[i]<min){
                min=temp[i];
            }
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i]>max){
                max=temp[i];
            }
        }
        System.out.println("lowest temp  => "+min);
        System.out.println("highest temp  => "+max);
    }

    // lab 02

    public static void  weatherData(int [][] weatherMatrix){
        int maxNum = weatherMatrix[0][0];
        int minNum = weatherMatrix[0][0];
        for (int i = 0; i < weatherMatrix.length; i++) {
            for (int j = 0; j < weatherMatrix[i].length; j++) {
                if(maxNum < weatherMatrix[i][j]){
                    maxNum = weatherMatrix[i][j];
                }else if(minNum > weatherMatrix[i][j]){
                    minNum = weatherMatrix[i][j];
                }
            }
        }

        System.out.println("max temp: "+maxNum);
        System.out.println(" min temp: " + minNum);
        findNotSeenTemp(maxNum,minNum,weatherMatrix);
    }
    public static void findNotSeenTemp(int max,int min,int[][] matrix){
        Set<Integer> setOfTemp=new HashSet();

        for(int j=0;j<matrix.length;j++){
            for(int x=0;x<matrix[j].length;x++){
                setOfTemp.add(matrix[j][x]);
            }
        }
        //System.out.println("full matrix "+ setOfTemp);

        for (int i = min; i < max; i++) {
            if (!setOfTemp.contains(i)){
                System.out.println ("Never saw temperature: " + i);
            }
        }
    }

    public static String tally(List <String> votes){
        Map<String, Integer> NameAndVotes= new HashMap<String, Integer>();
        String winner="";
        for(String s: votes){
            NameAndVotes.put(s,Collections.frequency(votes,s));
        }
        System.out.println(NameAndVotes);
        int winnerNoVotes = (Collections.max(NameAndVotes.values()));
        for (Map.Entry<String, Integer> entry : NameAndVotes.entrySet()){
            if (entry.getValue() == winnerNoVotes) {
                winner= entry.getKey();
            }
        }
        System.out.println(winner);

        return winner;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(roll(5)));
        int[] myArray = new int[]{1,2,3,3,5,10};

        System.out.println(containsDuplicates(myArray));
        System.out.println(average(myArray));
        lowestAndHighestAvg((arrayOfArray(weeklyMonthTemperatures)));
        weatherData(weeklyMonthTemperatures);


        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");

    }
}

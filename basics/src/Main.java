import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize( dogCount ,"dog") + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize( catCount ,"cat") + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize( turtleCount, "turtle") + ".");
        //flipNHeads(10);
        clock();

    }

    public static String pluralize(int animeNumber, String animalName){
        if(animeNumber == 0 || animeNumber > 1) {
            return animalName + 's';
        }
        else{
            return animalName;
        }

    }

    public static void flipNHeads(int flipNum){

        Random numOfFlips = new Random();
        float headOrTail ;
        int headNum = 0;
        int trial = 0;

        while(headNum != flipNum){

            headOrTail = numOfFlips.nextFloat();


            if(headOrTail > 0.5){
                System.out.println("heads");
                headNum += 1;
                trial += 1;

            } else {
                System.out.println("tails");
                headNum = 0;
                trial += 1;
            }

        }

        System.out.println(" It took " + trial + " " + pluralize(trial, "flip") + " to flip  " + headNum + " head  in a row");
    }

    public static void clock(){

        while (true){
            float speed = 0f;
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            while (second == LocalDateTime.now().getSecond()){
                speed += 1;
            }
            System.out.println( time + " " + speed/1000000 + "MHz");
        }

    }
}
public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize( dogCount ,"dog") + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize( catCount ,"cat") + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize( turtleCount, "turtle") + ".");
        // flipNHeads(10);

    }

    public static String pluralize(int animeNumber, String animalName){
        if(animeNumber == 0 || animeNumber > 1) {
            return animalName + 's';
        }
        else{
            return animalName;
        }

    }

}
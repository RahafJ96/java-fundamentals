package inheritance;

import java.util.*;
import java.util.List;

public class Theater extends Review implements AddReview{

    String name;
    List<String> movies = new ArrayList<>();
    List <Review> reviews=new ArrayList<>();

    int starsSum=0;
    int revCounter=0;
    public Theater(String name, List<String> movies) {
        this.name = name;
        this.movies = movies;
    }
    @Override
    public void addReview(double rate,String body,String author){
        if (rate>0&&rate<=5){
            Review rev=new Review(rate,body,author);
            this.starsSum+= rev.getRate();
            this.revCounter+=1;

            rev.rate=this.starsSum/this.revCounter;
            this.reviews.add(rev);
        }else {
            System.out.println("Please add number between 0 and 5");
            return;
        }

    }

    public void addReview(String movieName,double rate,String body,String author){
        if(this.movies.contains(movieName)){
            if (rate>0&&rate<=5){
                Review rev=new Review(body,author,rate,movieName);
                this.starsSum+= rev.getRate();
                this.revCounter+=1;

                rev.rate=this.starsSum/this.revCounter;
                this.reviews.add(rev);
            }else {
                System.out.println("Please add number between 0 and 5");
                return;
            }
        }
        else{
            System.out.println("The movie is not here");
            if (rate>0&&rate<=5){
                Review rev=new Review(body,author,rate,movieName);
                this.starsSum+= rev.getRate();
                this.revCounter+=1;

                rev.rate=this.starsSum/this.revCounter;
                this.reviews.add(rev);
            }else {
                System.out.println("Please add number between 0 and 5");
                return;
            }
            addMovie(movieName);
        }


    }
    public void addMovie(String movieName){
        if(this.movies.contains(movieName)){
            System.out.println("this movie already on our movies table, thank you ^^");
        }
        else {
            this.movies.add(movieName);
        }
    }
    public void deleteMovie(String movieName){
        if(this.movies.contains(movieName)){
            this.movies.remove(movies.indexOf(movieName));

        }
        else {
            System.out.println("sorry, :( we don't have this movie on our movies table, have a nice day!");
        }

    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
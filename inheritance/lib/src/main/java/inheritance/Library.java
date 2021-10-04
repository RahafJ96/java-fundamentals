package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        Restaurant restaurantReview=new Restaurant("Eater's","JD");

        restaurantReview.addReview(5,"I really liked the burger","Rahaf");
        restaurantReview.addReview(2.5,"The food was cold, but liked the view :(","Ola");
        restaurantReview.addReview(4.5,"Recommended, will try it again ","Roaa");
        restaurantReview.addReview(2,"I didn't enjoy the food","Abdalla");


        Shop shopReview= new Shop("H&M","clothes shop",4);
        shopReview.addReview(2.5,"The Shop need more care","Rahaf");
        shopReview.addReview(5,"I enjoyed in the shop","Roaa");
        shopReview.addReview(1.5,"Too Pricey!","Ola");
        shopReview.addReview(4,"The shop has a good quality clothes","Yousef");


        List<String> movies= new ArrayList<>();
        movies.add("Invisible Guest");
        movies.add("Cruella");
        movies.add("Don't Breath");
        movies.add("I care alot");

        Theater theater= new Theater("Taj Cinemas",movies);
        theater.addReview(5,"loved it","Rahaf");
        theater.addReview(1.5,"Didn't like the place","Abdalla");


        theater.addMovie(("Attack on Titnes"));
        theater.deleteMovie(("I care alot"));



        User user=new User();
        user.searchReviews(theater.reviews,"Rahaf");
        System.out.println(theater+"\n"+theater.reviews);
        System.out.println("All the Reviews: "+restaurantReview.reviews);

        System.out.println(restaurantReview +"\n"+restaurantReview.reviews);
        //User user=new User();
        System.out.println(restaurantReview.reviews);

        //user.findReviews(restaurantReview.reviews,"Yousef");
        System.out.println(restaurantReview.reviews);




    }
}
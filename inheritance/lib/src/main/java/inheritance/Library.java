package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        Restaurant restaurantReview=new Restaurant("Eater's (Burger Joint)","JD");

        restaurantReview.addReview(5,"I really liked the burger","Rahaf");
        restaurantReview.addReview(2.5,"The food was cold, but liked the view :(","Ola");
        restaurantReview.addReview(4.5,"Recommended, will try it again ","Roaa");
        restaurantReview.addReview(2,"I didn't enjoy the food","Abdalla");

        System.out.println("All the Reviews: "+restaurantReview);

        System.out.println(restaurantReview +"\n"+restaurantReview.reviews);
        //User user=new User();
        System.out.println(restaurantReview.reviews);

        //user.findReviews(restaurantReview.reviews,"Yousef");
        System.out.println(restaurantReview.reviews);




    }
}
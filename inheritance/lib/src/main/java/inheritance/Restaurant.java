package inheritance;
import java.util.ArrayList;

public class Restaurant extends Review {
    // Each Restaurant should have a name, the rate out of 5 and a price category ($,JD).

    String name;
    double stars;
    String currency="JD";

    //
    private int rateSum=0;
    private int reviewNumber=0;
    //
    public ArrayList<Review> reviews=new ArrayList<>();

    public Restaurant(String name, String currency) {
        this.name = name;
        this.currency = currency;
    }

    public void addReview(double rate,String body,String author){
        if (rate>0&&rate<=5){
            Review reviews=new Review(rate,body,author);
            this.rateSum+= reviews.getRate();
            this.reviewNumber+=1;
            this.rate=this.rateSum/this.reviewNumber;
            this.reviews.add(reviews);
        }else {
            System.out.println("Please add number between 0 and 5");
            return;
        }

    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + rate +
                ", priceCat='" + currency + '\'' +
                "}\n "+ "all reviews: "+" \n"+reviews;
    }
}

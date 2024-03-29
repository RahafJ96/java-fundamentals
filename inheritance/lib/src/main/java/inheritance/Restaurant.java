package inheritance;
import java.util.ArrayList;

public class Restaurant extends Review {

    String name;
    double stars;
    String priceCat="$";

    //
    private int rateSum=0;
    private int reviewNumber=0;
    //
    public ArrayList<Review> reviews=new ArrayList<>();

    public Restaurant(String name, String pricCat) {
        this.name = name;
        this.priceCat = pricCat;
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
                ", priceCat='" + priceCat + '\'' +
                "}\n "+ "all reviews: "+" \n"+reviews;
    }
}

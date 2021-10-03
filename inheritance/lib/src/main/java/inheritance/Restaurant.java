package inheritance;
import java.util.ArrayList;

public class Restaurant extends Review {

    /*
     * Each Restaurant should have a name,
     * a number of stars between 0 and 5,
     * and a price category (i.e. number of dollar signs).
     * */

    String name;
    double stars;
    String priceCat="JD";

    //
    private int starsSum=0;
    private int revCounter=0;
    //
    protected ArrayList<Review> reviews=new ArrayList<>();


    public Restaurant(String name, String priceCat) {
        this.name = name;
        this.priceCat = priceCat;
    }

    public void addReview(double rate,String body,String author){
        if (rate>0&&rate<=5){
            Review rev=new Review(rate,body,author);
            this.starsSum+= rev.getRate();
            this.revCounter+=1;
            this.rate=this.starsSum/this.revCounter;
            this.reviews.add(rev);
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

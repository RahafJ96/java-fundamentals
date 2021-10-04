package inheritance;


import java.util.ArrayList;
import java.util.List;

public class Shop extends  Review implements AddReview {
    /*
     *  a Shop should have a name,
     *  description,
     * and number of dollar signs.
     *
     * */
    String shopName;
    String shopDescription;

    int numberOfDollarSigns;

    int starsSum=0;
    int revCounter=0;

    List <Review> reviews=new ArrayList<>();
    public Shop(String shopName, String shopDescription, int numberOfDollarSigns) {
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.numberOfDollarSigns = numberOfDollarSigns;
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
            System.out.println("Please add number beteen 0 and 5");
            return;
        }

    }
    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", shopDescription='" + shopDescription + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                '}';
    }
}
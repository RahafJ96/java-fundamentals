package inheritance;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void checkRestaurantName() {
        Restaurant res=new Restaurant("Dabouq Cottage","$$");
        assertEquals("Restaurant{name='Dabouq Cottage', stars=0.0, priceCat='$$'}\n" +
                " all reviews:  \n"+ "[]",res.toString());
    }
    @Test void checkRestaurantReview() {
        Review rest=new Review(5,"I really liked the burger","Rahaf");
        assertEquals("Review {rate=5.0, body='I really liked the burger', author='Rahaf'}",rest.toString());
    }
    @Test void addMultiplexer(){
        Restaurant res=new Restaurant("KFC","$");

        res.addReview(3,"Will try again","Ibrahim");
        res.addReview(5,"Delicious :D","Noor");
        res.addReview(4,"Loved it !!","Sara");
        assertEquals("Restaurant{name='KFC', stars=4.0, priceCat='$'}\n" +
                " all reviews:  \n" +"[Review {rate=3.0, body='Will try again', author='Ibrahim'}, Review {rate=5.0, body='Delicious :D', author='Noor'}, Review {rate=4.0, body='Loved it !!', author='Sara'}]",res.toString());
    }
    @Test void checkShopName() {
        Shop shop=new Shop("H&M","clothes shop",3);
        assertEquals("Shop{shopName='H&M', shopDescription='clothes shop', numberOfDollarSigns=3}"
                ,shop.toString());
    }
    @Test void checkShopReview() {
        Review rest=new Review(2,"It is a good shop","Rahaf");
        assertEquals("Review {rate=2.0, body='It is a good shop', author='Rahaf'}",rest.toString());
    }
    @Test void checkMovieName() {
        List<String> movies=new ArrayList<>();
        movies.add("Invisible Guest");
        movies.add("Cruella");
        Theater theater=new Theater("Taj Cinemas",movies);
        assertEquals("Theater{name='Taj Cinemas', movies=[Invisible Guest, Cruella]}"
                ,theater.toString());
    }
    @Test void checkMovieReview() {
        Review rest=new Review(2,"It is a good movie","Rahaf");
        assertEquals("Review {rate=2.0, body='It is a good movie', author='Rahaf'}",rest.toString());
    }

    @Test void checkMovieWithNameReview() {
        Review rest=new Review("hello","Rahaf",4.5,"Cruella");
        assertEquals("Review {rate=4.5, body='hello', author='Rahaf'}",rest.toString());
    }

}
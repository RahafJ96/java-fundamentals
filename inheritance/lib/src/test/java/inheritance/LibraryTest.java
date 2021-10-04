package inheritance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void ResturantName() {
        Restaurant res=new Restaurant("KFC","JD");
        assertEquals("Restaurant{name='KFC', stars=0.0, priceCat='JD'}\n" +
                " all reviews:  \n"+ "[]",res.toString());
    }
    @Test void ResturantReview() {
        Review rest=new Review(5,"I really liked the burger","Rahaf");
        assertEquals("review {rate=5.0, body='I really liked the burger', author 'Rahaf'}",rest.toString());
    }
//    @Test void addMutiplerev(){
//        Restaurant res=new Restaurant("KFC","JD");
//
//        res.addReview(3,"Will try again","Ibrahim");
//        res.addReview(5,"Delicious :D","Noor");
//        res.addReview(4,"Loved it !!","Sara");
//        assertEquals("Restaurant{name='KFC', stars=4.0, priceCat='JD'}\n" +
//                " all reviews:  \n" +"[review {rate=3.0, body='Will try again', author 'Ibrahim'}, review {rate=5.0, body='Delicious :D', author 'Noor'}, review {rate=4.0, body='Loved it !!', author 'Sara'}]\n",res.toString());
//
//    }

}
package inheritance;



public class Review {

    double rate;
    String body;
    String author;

    public Review(double rate, String body, String author) {
        this.rate = rate;
        this.body = body;
        this.author = author;
    }
    public Review() {
        setRate(rate);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if(rate <= 5 && rate >= 0) {
            this.rate = rate;
        }else {
            System.out.println("Please rate the restaurant from 0 to 5 ");
        }
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    // Stretch Goal
    public void updateRate(double rate) {
        validateRate(rate);
        this.rate = rate;
    }

    public String validateRate(double number) {

        if (number != -1 && number < 0 || number > 5){
            return "Rating is between 0 and 5";
        }
        return "";

    }
    @Override
    public String toString() {
        return "review {" + "rate=" + rate + ", body='" + body + '\'' + ", author '" + author + '\'' + '}';
    }
}
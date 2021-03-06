public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price priceCode;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }
    public int getPriceCode() {
        return priceCode.getPriceCode();
    }
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                priceCode = new RegularPrice();
                break;
            case CHILDRENS:
                priceCode = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                priceCode = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }

    }
    public String getTitle (){
        return title;
    };

    double getCharge(int daysRented) { return
            priceCode.getCharge(daysRented);
    }


    int getFrequentRenterPoints(int daysRented) {
        return priceCode.getFrequentRenterPoints(daysRented);
    }

}
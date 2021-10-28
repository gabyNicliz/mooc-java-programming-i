
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int comparedPrice = compared.princePerSquare * compared.squares;
        int selfPrice = this.princePerSquare * this.squares;
        return Math.abs(selfPrice - comparedPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int comparedPrice = compared.princePerSquare * compared.squares;
        int selfPrice = this.princePerSquare * this.squares;
        
        if (selfPrice > comparedPrice) {
            return true;
        }
        
        return false;
    }
}


public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.sum = 0;
        this.count = 0;
    }
    
    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        double average = 0;
        if (this.sum != 0 && this.count != 0) {
            average = this.sum / (double) this.count;
        }
        return average;
    }
}

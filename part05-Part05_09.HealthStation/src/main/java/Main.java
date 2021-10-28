
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation healthStation = new HealthStation();
        
        Person testPerson = new Person("test person", 28, 180, 85);
        System.out.println(healthStation.weighings());
        
        System.out.println(healthStation.weigh(testPerson));
        
        healthStation.feed(testPerson);
        
        System.out.println(healthStation.weigh(testPerson));
        System.out.println(healthStation.weighings());
    }
}

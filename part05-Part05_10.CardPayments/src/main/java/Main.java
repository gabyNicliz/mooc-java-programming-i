
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentTerminal testTerminal = new PaymentTerminal();

        PaymentCard testCard = new PaymentCard(10);

        boolean wasSuccesful = testCard.takeMoney(8);
        System.out.println(wasSuccesful);

        wasSuccesful = testCard.takeMoney(4);
        System.out.println(wasSuccesful);
        System.out.println("testCard balance " + testCard.balance());

        double change = testTerminal.eatAffordably(4);
        System.out.println("Change: " + change);
        System.out.println(testTerminal);

        change = testTerminal.eatHeartily(3);
        System.out.println("Change: " + change);
        System.out.println(testTerminal);
        
        change = testTerminal.eatHeartily(4.3);
        System.out.println("Change: " + change);
        System.out.println(testTerminal);
        
        testCard.addMoney(4.8);
        
        wasSuccesful = testTerminal.eatAffordably(testCard);
        System.out.println(wasSuccesful + " " + testCard.balance());
        System.out.println(testTerminal);
        
        wasSuccesful = testTerminal.eatHeartily(testCard);
        System.out.println(wasSuccesful + " " + testCard.balance());
        System.out.println(testTerminal);
        
        wasSuccesful = testTerminal.eatHeartily(testCard);
        System.out.println(wasSuccesful + " " + testCard.balance());
        System.out.println(testTerminal);
        
        testTerminal.addMoneyToCard(testCard, 20);
        System.out.println(testCard.balance());
        System.out.println(testTerminal);
    }
}

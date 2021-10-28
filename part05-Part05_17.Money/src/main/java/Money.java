
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        if (addition.cents + this.cents > 99) {
            int remainingCents = (addition.cents + this.cents) - 100;
            int totalEuros = this.euros + addition.euros + 1;

            return new Money(totalEuros, remainingCents);
        } else {
            return new Money(this.euros + addition.euros, this.cents + addition.cents);
        }
    }

    public Money minus(Money decreaser) {
        if (this.euros - decreaser.euros >= 0) {
            if (this.cents < decreaser.cents) {
                return new Money(this.euros - decreaser.euros - 1, this.cents + 100 - decreaser.cents);
            } else {
                return new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
            }
        } else {
            return new Money(0, 0);
        }
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros > compared.euros) {
            return false;
        }

        if (this.cents < compared.cents) {
            return true;
        }

        return false;
    }
}

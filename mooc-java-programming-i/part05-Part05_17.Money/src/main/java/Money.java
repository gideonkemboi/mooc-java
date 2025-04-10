
public class Money {

    private final int euros;
    private final int cents;
    private final double value;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
        this.value = euros + cents / 100.0;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        double sum = this.value + addition.value;

        int euros = (int) sum;
        int cents = (int) Math.round((sum - euros) * 100);

        Money newMoney = new Money(euros, cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
       if (this.value < compared.value) {
           return true;
       }
       
       return false;
    }

    public Money minus(Money decreaser) {
        double difference = this.value - decreaser.value;

        int euros = 0;
        int cents = 0;
        if (difference > 0) {
            euros = (int) difference;
            cents = (int) Math.round((difference - euros) * 100);
        }

        return new Money(euros, cents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}

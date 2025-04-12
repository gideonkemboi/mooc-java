
public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;

            if (this.amount > 100) {
                this.amount = 100;
            } else if (this.amount < 0) {
                this.amount = 0;
            }
        }
    }

    public void incrementAmount(int amount) {
          if (amount >= 0) {
              this.amount += amount;

              if (this.amount > 100) {
                  this.amount = 100;
              }
          }      
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }
}

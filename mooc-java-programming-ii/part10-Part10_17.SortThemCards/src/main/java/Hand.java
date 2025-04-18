
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    } // adds a card to the hand

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    } // prints the cards in hand as shown in the example below

    public void sort() {
        Collections.sort(this.cards);
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

    public int getValue() {
        return this.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (prevSum, value) -> prevSum + value);
    }

    @Override
    public int compareTo(Hand hand) {
        return Integer.compare(this.getValue(), hand.getValue());
    }
}

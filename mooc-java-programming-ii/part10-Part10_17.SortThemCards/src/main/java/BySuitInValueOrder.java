
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card card1, Card card2) {
        int suitComparison = card1.getSuit().compareTo(card2.getSuit());

        if (suitComparison == 0) {
            return Integer.compare(card1.getValue(), card2.getValue());
        }

        return suitComparison;
    }
}

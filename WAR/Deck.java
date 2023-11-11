import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            CardValue value = CardValue.values()[i];

            for (int j = 0; j < 4; j++) {
                Card card = new Card(value, Suit.values()[j]);
                this.deck.add(card);
            }
        }
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        return deck.remove(0);
    }

    public void sortDeck() {
        Collections.sort(deck);
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }

    public void addCard(Card c){
        deck.add(c);
    }

}

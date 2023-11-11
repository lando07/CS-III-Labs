import static java.lang.System.out;

/*
Card 1: SIX of DIAMONDS loses against Card 2: ACE of HEARTS
Card 1: TEN of DIAMONDS wins against Card 2:  FIVE of DIAMONDS
Card 1: SIX of SPADES loses against Card 2: KING of CLUBS
Card 1: KING of HEARTS wins against Card 2:  TWO of SPADES
Card 1: FOUR of HEARTS loses against Card 2: JACK of CLUBS
TWO of CLUBS
TWO of DIAMONDS
TWO of HEARTS
TWO of SPADES
THREE of CLUBS
THREE of DIAMONDS
THREE of HEARTS
THREE of SPADES
FOUR of CLUBS
FOUR of DIAMONDS
FOUR of HEARTS
FOUR of SPADES
FIVE of CLUBS
FIVE of DIAMONDS
FIVE of HEARTS
FIVE of SPADES
SIX of CLUBS
SIX of DIAMONDS
SIX of HEARTS
SIX of SPADES
SEVEN of CLUBS
SEVEN of DIAMONDS
SEVEN of HEARTS
SEVEN of SPADES
EIGHT of CLUBS
EIGHT of DIAMONDS
EIGHT of HEARTS
EIGHT of SPADES
NINE of CLUBS
NINE of DIAMONDS
NINE of HEARTS
NINE of SPADES
TEN of CLUBS
TEN of DIAMONDS
TEN of HEARTS
TEN of SPADES
JACK of CLUBS
JACK of DIAMONDS
JACK of HEARTS
JACK of SPADES
QUEEN of CLUBS
QUEEN of DIAMONDS
QUEEN of HEARTS
QUEEN of SPADES
KING of CLUBS
KING of DIAMONDS
KING of HEARTS
KING of SPADES
ACE of CLUBS
ACE of DIAMONDS
ACE of HEARTS
ACE of SPADES
*/
public class DeckTester {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Deck deck2 = new Deck();
        for (int i = 0; i < 5; i++) {
            Card card = deck.drawCard();
            Card card2 = deck.drawCard();
            if (card.compareTo(card2) > 0) {
                out.println("Card 1: " + card + " wins against Card 2:  " + card2);
            } else {
                out.println("Card 1: " + card + " loses against Card 2: " + card2);
            }
        }
        deck2.sortDeck();
        for (int j = 0; j < 52; j++) {
            out.println(deck2.drawCard());
        }
    }
}

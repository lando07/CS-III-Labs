public class Card implements Comparable<Card> {
    private Suit suit;
    private CardValue cardValue;

    public Card(CardValue cardValue, Suit suit) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return cardValue + " of " + suit;
    }

    @Override
    public int compareTo(Card o) {
        if (getCardValue().getCardValue() != o.getCardValue().getCardValue()) {
            return getCardValue().getCardValue() - o.getCardValue().getCardValue();
        }
        return getSuit().getSuitValue() - o.getSuit().getSuitValue();
    }

}

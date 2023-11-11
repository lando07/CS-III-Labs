public enum Suit {
    HEARTS(2),
    SPADES(3),
    CLUBS(0),
    DIAMONDS(1);

    private int suitValue;

    private Suit(int suitValue) {
        this.suitValue = suitValue;
    }

    public int getSuitValue() {
        return suitValue;
    }

    
}
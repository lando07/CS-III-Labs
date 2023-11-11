import static java.lang.System.out;

import java.util.ArrayList;

public class War {
    private static ArrayList<Card> p1 = new ArrayList<Card>();
    private static ArrayList<Card> p2 = new ArrayList<Card>();

    public static void main(String[] args) {
        splitDeck();
        boolean pHasWon = false;
        int round = 0;
        out.println("Let the WAR begin! (Player 1's card will always show before Player 2)");
        while (!pHasWon) {
            round++;
            out.println("\nRound " + round);
            Card p1c = p1.remove(0);
            Card p2c = p2.remove(0);
            if (p1c.compareTo(p2c) > 0) {
                out.println(p1c + " wins against " + p2c + " <--- Player 1 wins the round");
                p1.add(p1.remove(0));
                p1.add(p1c);
                p1.add(p2.remove(0));
                p1.add(p2c);
            } else {
                out.println(p1c + " loses against " + p2c + " <--- Player 2 wins the round");
                p2.add(p1.remove(0));
                p2.add(p1c);
                p2.add(p2.remove(0));
                p2.add(p2c);
            }
            out.println("Player 1 cards: " + p1.size() + "\t\tPlayer 2 cards: " + p2.size());

            if (p1.isEmpty() || p2.isEmpty()) {
                pHasWon = true;
            }
        }
        if (p1.isEmpty())
            out.println("Player 2 wins!");
        else
            out.println("Player 1 wins!");
    }

    private static void splitDeck() {
        Deck d = new Deck();
        for (int i = 0; i < 52 / 2; i++) {
            p1.add(d.drawCard());
            p2.add(d.drawCard());
        }
    }
}

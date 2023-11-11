import static java.lang.System.in;
import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class KaraokeDJ {
    private static ArrayList<Song> availableSongs;
    private static Queue<PlayListEntry> songList = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        availableSongs = new ArrayList<>();
        Scanner sc = new Scanner(new File("songs.txt"));
        while (sc.hasNextLine()) {
            String[] song = sc.nextLine().split(";");
            availableSongs.add(new Song(song[0], song[1], song[2]));
        }
        sc.close();

        try (Scanner console = new Scanner(in)) {
            while (true) {
                out.print("Would you like to:" +
                        "\n1. Add a song" +
                        "\n2. Get the next song in the queue" +
                        "\n3. Exit" +
                        "\n>>> ");
                int option = console.nextInt();
                console.nextLine();
                switch (option) {
                    case 1:
                        addSong(console);
                        break;
                    case 2:
                        try {
                            out.println(songList.remove());
                        } catch (NoSuchElementException nsee) {
                            out.println("There are no songs in the queue.");
                        }
                        break;
                    case 3:
                        return;
                    default:
                        out.println("Invalid Option");
                }
            }
        }
    }

    private static void addSong(Scanner console) {
        out.println("Please enter the song number(enter to list songs)");
        String ans = console.nextLine();
        while (ans.isEmpty()) {
            if (ans.isEmpty()) {
                for (int i = 0; i < availableSongs.size(); i++) {
                    out.println((i + 1) + " - " + availableSongs.get(i));
                }
            }
            out.println("Please enter the song number(enter to list songs) ");
            ans = console.nextLine();
        }
        int songNum = Integer.parseInt(ans);
        out.println("Please enter the name of the performer: ");
        String performer = console.nextLine();
        songList.add(new PlayListEntry(performer, availableSongs.get(songNum - 1)));
    }
}
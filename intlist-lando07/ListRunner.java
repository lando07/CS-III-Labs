import java.util.Iterator;

public class ListRunner {
    public static void main(String[] args) {
        GenericList<String> li = new GenericList<>();
        li.add("h");
        li.add("o");
        li.add("RNETS");

        System.out.println(li);
        Iterator<String> it = li.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        it.remove();
        it.remove();
        System.out.println(li);
    }
}

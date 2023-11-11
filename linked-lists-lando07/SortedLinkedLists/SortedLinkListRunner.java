public class SortedLinkListRunner {
    public static void main(String[] args) {
        SortedLinkedList myList = new SortedLinkedList();

        // These should all cause exceptions
        // System.out.println(myList.removeFront());
        // System.out.println(myList.removeBack());
        // System.out.println(myList.peekFront());
        // System.out.println(myList.peekBack());
        System.out.println(myList);
        myList.add(100);
        myList.add(50);
        myList.add(-10);
        myList.add(150);
        System.out.println(myList);
        System.out.println(myList.size());

        while (myList.size() > 0) {
            System.out.println(myList.removeFront());
            System.out.println(myList.removeBack());
        }
        System.out.println(myList);

        for (int i = 0; i < 10; i++) {
            myList.add(10);
        }
        System.out.println(myList);
        System.out.println(myList.size());

        int[] ns = { 5, 25, 8, -3, 154, 212, 6 };
        myList.addAll(ns);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.removeFront());
        System.out.println(myList.peekFront());
        System.out.println(myList.size());
        System.out.println(myList);
        System.out.println(myList.removeBack());
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.peekBack());
        System.out.println(myList.size());

        int[] moreNs = { 100, 23, -150, Integer.MIN_VALUE, Integer.MAX_VALUE, 10000000, 12 };
        myList.addAll(moreNs);
        System.out.println(myList);
        System.out.println(myList.size());

        myList.add(100);
        myList.add(80);
        myList.add(50);
        myList.add(25);
        System.out.println(myList);
        System.out.println(myList.size());

        while (myList.size() > 0) {
            System.out.print(myList.removeFront() + " ");
            System.out.print(myList.removeBack() + "\n");
        }

    }
}
/*
 * Expected output -- BE SURE TO LOOK REALLY CLOSELY AT THE OUTPUT!
 * 
 * []
 * [-10, 50, 100, 150]
 * 4
 * -10
 * 150
 * 50
 * 100
 * []
 * [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]
 * 10
 * [-3, 5, 6, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 25, 154, 212]
 * 17
 * -3
 * 5
 * 16
 * [5, 6, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 25, 154, 212]
 * 212
 * [5, 6, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 25, 154]
 * 15
 * 154
 * 15
 * [-2147483648, -150, 5, 6, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 23,
 * 25, 100, 154, 10000000, 2147483647]
 * 22
 * [-2147483648, -150, 5, 6, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 23,
 * 25, 25, 50, 80, 100, 100, 154, 10000000, 2147483647]
 * 26
 * -2147483648 2147483647
 * -150 10000000
 * 5 154
 * 6 100
 * 8 100
 * 10 80
 * 10 50
 * 10 25
 * 10 25
 * 10 23
 * 10 12
 * 10 10
 * 10 10
 * 
 */

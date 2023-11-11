public class IntLinkedListRunner {
    public static void main(String[] args) {
        IntLinkedList myList = new IntLinkedList();
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(8);
        myList.add(6);
        System.out.println(myList);
        
        System.out.println(myList.remove());
        System.out.println(myList);
        System.out.println(myList.remove(3));
        System.out.println(myList);

        System.out.println(myList.remove(4));
        System.err.println(myList);
    }
}

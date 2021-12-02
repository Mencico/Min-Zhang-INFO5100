public class Main { // just for test.

    public static void main(String[] args) {
        ThreadSafeLinkedList test = new ThreadSafeLinkedList();

        test.addAtPosition(0, 1);
        test.addAtPosition(1, 2);
        test.addAtPosition(2, 3);
        test.addAtPosition(3, 4);
        test.addAtPosition(4, 5);
        test.addAtPosition(5, 6);
        test.addAtPosition(6, 7);
        test.addAtPosition(7, 8);
        test.addAtPosition(8, 9);


        test.print();

        System.out.println(" ");
        System.out.println("The first element: " + test.getFirst());
        System.out.println("The last element: " + test.getLast());

        test.removeAtPosition(5,6);
        test.print();


        System.out.println("  ");
        System.out.println("The size is:" + test.size());




    }






}

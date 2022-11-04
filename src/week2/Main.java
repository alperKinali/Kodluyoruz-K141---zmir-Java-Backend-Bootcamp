package week2;

public class Main {
    public static void main(String[] args) {
        /*
         * Priority queeo olacak
         * Generic olcak
         * adding, popping, peeking. (peek koparmaz gitmez ama pop da gider )
         *
         *
         */

        PriorityQueue<String > priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Kodluyoruz ", Priority.MEDİUM);
        priorityQueue.add("Bootcamp",Priority.LOW);
        priorityQueue.add("java",Priority.MEDİUM);


        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.pop());
        System.out.println(priorityQueue.pop());
        System.out.println(priorityQueue.pop());

        // test
        // testtt







    }
}

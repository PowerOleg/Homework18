import java.util.*;

public class Main {

    public static List<Person> generateClients() {
        List<Person> queue = new LinkedList<>();
        queue.add(new Person("Vladimir", "Popkov", 4));
        queue.add(new Person("Petya", "Nikitin", 1));
        queue.add(new Person("Nastya", "Shushukova", 2));
        queue.add(new Person("Alena", "Vnutskih", 3));
        queue.add(new Person("Alex", "Bui", 10));
        return queue;
    }

    public static void main(String[] args) {
        Queue<Person> queue1 = new ArrayDeque<>(generateClients());

        boolean exit = false;
        while (exit) {
            int count = 0;
            for (Iterator<Person> iterator = queue1.iterator(); iterator.hasNext(); ) {
                Person p = iterator.next();
                if (p.getTicketsNumber() > 0) {
                    p.setTicketsNumber(p.getTicketsNumber() - 1);
                    Person client = queue1.poll();
                    System.out.printf("%s took a ride at the roller coaster\n", client);
                    queue1.offer(client);
                } else count++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            if (queue1.size() == count) {
                exit = true;
            }
        }

    }
}

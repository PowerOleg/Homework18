import java.util.*;

public class Main {
    public static List<Person> generateClients() {
        List<Person> queue = new LinkedList<>();
        queue.add(new Person("Rabbit", "Hare", 0));
        queue.add(new Person("Vladimir", "Popkov", 4));
        queue.add(new Person("Petya", "Nikitin", 1));
        queue.add(new Person("Nastya", "Shushukova", 2));
        queue.add(new Person("Alena", "Vnutskih", 3));
        queue.add(new Person("Alex", "Bui", 10));
        return queue;
    }

    public static void faceControl(Queue<Person> queue) {
        for (Iterator<Person> iterator = queue.iterator(); iterator.hasNext(); ) {
            Person p = iterator.next();
            if (p.getTicketsNumber() <= 0) {
                queue.poll();
            } else {
                p.setTicketsNumber(p.getTicketsNumber() - 1);
                Person client = queue.poll();
                System.out.printf("%s took a ride at the roller coaster (%d tickets left)\n",
                        client, client.getTicketsNumber());
                queue.offer(client);
            }
        }
    }

    public static void main(String[] args) {
        Queue<Person> queue1 = new ArrayDeque<>(generateClients());
        while (!queue1.isEmpty()) {
            faceControl(queue1);
        }
    }
}

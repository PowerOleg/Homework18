public class Person {
    private String name;
    private String surname;
    private int ticketsNumber;

    public Person(String name, String surname, int ticketsNumber) {
        this.name = name;
        this.surname = surname;
        this.ticketsNumber = ticketsNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int getTicketsNumber() {
        return ticketsNumber;
    }

    public void setTicketsNumber(int ticketsNumber) {
        this.ticketsNumber = ticketsNumber;
    }
}

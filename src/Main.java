public class Main {
    public static void main(String[] args) {

        System.out.println("____ Task 1 ____");
        task1();

        System.out.println("\n____ Task 2 ____");
        task2();

        System.out.println("\n____ Task 3 ____");
        task3();

    }

    public static void task1() {
        var person = new Person("Test Name", "Test Position",
                "test.email@mailbox.com", "9000000", 1, 18);
        person.getInfo();
    }

    public static void task2() {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "982312312", 3000, 30);
        persArray[1] = new Person("Petrov Petr", "Engineer",
                "petpetr@mailbox.com", "982312313", 3001, 31);
        persArray[2] = new Person("Sidorov Ivan", "Engineer",
                "sidivan@mailbox.com", "982312314", 3002, 32);
        persArray[3] = new Person("Ivanov Petr", "Worker",
                "ivpetr@mailbox.com", "982312315", 30000, 20);
        persArray[4] = new Person("Sidorov Petr", "Worker",
                "sidpetr@mailbox.com", "982312316", 30001, 21);

        for (Person person : persArray) {
            person.getInfo();
        }
    }

    public static void task3() {
        Park park = new Park("AstonQA Park");
        park.addAttraction("Roller Coaster",
                "09:00-18:00", 25.0);
        park.addAttraction("Ferris Wheel",
                "10:00-20:00", 15.0);
        park.displayAttractions();
    }
}
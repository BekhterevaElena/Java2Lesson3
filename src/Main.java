public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "+7000000000");
        phonebook.add("Петров", "+7000000001");
        phonebook.add("Сидоров", "+7000000002");
        phonebook.add("Петров", "+7000000003");
        phonebook.add("Иванов", "+7000000004");

        String[] Ivanov = phonebook.get("Иванов").toArray(new String[0]);
        String[] Sidorov = phonebook.get("Сидоров").toArray(new String[0]);

        for (int i=0; i< Ivanov.length; i++) {
            System.out.println("Иванов " + Ivanov[i]);
        }
        for (int i=0; i< Sidorov.length; i++) {
            System.out.println("Сидоров " + Sidorov[i]);
        }
    }
}
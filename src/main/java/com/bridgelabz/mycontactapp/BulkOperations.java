import java.util.*;
import java.util.stream.Collectors;

// Contact Component (Composite Pattern)

interface ContactComponent {
    void display();
}

// Leaf

class Contact implements ContactComponent {

    private int id;
    private String name;
    private String phone;
    private String tag;

    public Contact(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.tag = "None";
    }

    public int getId() {
        return id;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public void display() {
        System.out.println(id + "  " + name + "  " + phone + "  Tag : " + tag);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " Tag:" + tag;
    }
}

// Composite

class ContactGroup implements ContactComponent {

    private List<ContactComponent> contacts = new ArrayList<>();

    public void add(ContactComponent contact) {
        contacts.add(contact);
    }

    @Override
    public void display() {

        contacts.forEach(ContactComponent::display);   // Method Reference

    }

}

// Main

public class BulkOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact(1, "Pavi", "9878943210"));
        contacts.add(new Contact(2, "Hari", "9123456529"));
        contacts.add(new Contact(3, "Saroja", "7852776655"));
        contacts.add(new Contact(4, "Uma", "9012342568"));

        while (true) {

            System.out.println("\n===== BULK OPERATIONS =====");

            System.out.println("1. View Contacts");
            System.out.println("2. Bulk Delete");
            System.out.println("3. Bulk Tag");
            System.out.println("4. Bulk Export");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    ContactGroup group = new ContactGroup();

                    contacts.forEach(group::add);

                    group.display();

                    break;

                case 2:

                    System.out.print("Delete Contacts with ID greater than : ");

                    int deleteId = sc.nextInt();

                    // Streams + Lambda
                    contacts.removeIf(contact -> contact.getId() > deleteId);

                    System.out.println("Bulk Delete Successful");

                    break;

                case 3:

                    System.out.print("Enter Tag : ");

                    sc.nextLine();

                    String tag = sc.nextLine();

                    // Batch Processing
                    contacts.forEach(contact -> contact.setTag(tag));

                    System.out.println("Bulk Tag Applied");

                    break;

                case 4:

                    System.out.println("\nExported Contacts");

                    // Stream API
                    List<String> export = contacts.stream()
                            .map(Contact::toString)      // Method Reference
                            .collect(Collectors.toList());

                    export.forEach(System.out::println);

                    break;

                case 5:

                    System.out.println("Thank You");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }

        }

    }

}

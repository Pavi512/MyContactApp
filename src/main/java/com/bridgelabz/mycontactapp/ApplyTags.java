package com.bridgelabz.mycontactapp;
import java.util.*;

// Observer 

interface Observer {

    void update(String message);

}

// Concrete Observer 

class UIObserver implements Observer {

    @Override
    public void update(String message) {

        System.out.println("UI Updated : " + message);

    }

}

// Tag 

class Tag {

    private String name;

    // Bidirectional Relationship
    private Set<Contact> contacts = new HashSet<>();

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    @Override
    public String toString() {
        return name;
    }

}

// Contact 

class Contact {

    private String name;

    // Bidirectional Relationship
    private Set<Tag> tags = new HashSet<>();

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public void removeTag(Tag tag) {
        tags.remove(tag);
    }

    public void display() {

        System.out.println("\nContact : " + name);

        System.out.println("Tags : " + tags);

    }

}

// Association Class 

class ContactTag {

    private Contact contact;
    private Tag tag;

    public ContactTag(Contact contact, Tag tag) {

        this.contact = contact;
        this.tag = tag;

        // Maintain Bidirectional Relationship

        contact.addTag(tag);

        tag.addContact(contact);

    }

}

// Tag Manager 

class TagManager {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {

        observers.add(observer);

    }

    public void notifyObservers(String message) {

        for (Observer observer : observers) {

            observer.update(message);

        }

    }

}

// Main 

public class ApplyTags {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contact pavi = new Contact("Pavi");
        Contact hari = new Contact("Hari");

        Tag family = new Tag("Family");
        Tag work = new Tag("Work");
        Tag friends = new Tag("Friends");

        TagManager manager = new TagManager();

        manager.addObserver(new UIObserver());

        while (true) {

            System.out.println("\n===== APPLY TAGS =====");

            System.out.println("1. Apply Tag to Pavi");

            System.out.println("2. Remove Tag from Pavi");

            System.out.println("3. View Contacts");

            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("Available Tags");

                    System.out.println("1. Family");

                    System.out.println("2. Work");

                    System.out.println("3. Friends");

                    System.out.print("Choose Tag : ");

                    int tagChoice = sc.nextInt();

                    Tag selectedTag = null;

                    if (tagChoice == 1)
                        selectedTag = family;

                    else if (tagChoice == 2)
                        selectedTag = work;

                    else
                        selectedTag = friends;

                    new ContactTag(pavi, selectedTag);

                    manager.notifyObservers("Tag Applied Successfully");

                    break;

                case 2:

                    System.out.println("Enter Tag Name : ");

                    String tagName = sc.next();

                    for (Tag tag : pavi.getTags()) {

                        if (tag.getName().equalsIgnoreCase(tagName)) {

                            pavi.removeTag(tag);

                            tag.removeContact(pavi);

                            manager.notifyObservers("Tag Removed");

                            break;

                        }

                    }

                    break;

                case 3:

                    pavi.display();

                    pavi.display();

                    break;

                case 4:

                    System.out.println("Thank You");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }
        }
    }
}
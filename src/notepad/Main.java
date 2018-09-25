package notepad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner (System.in);
    static List<Person> personList = new ArrayList<>();  // sozdaet list - spisok



    public static void main(String[] args) {

     while (true) {
        System.out.println ("Enter command");
        String cmd = scanner.next();
        switch (cmd){
            case "create":
            create();
            break;
            case "delete":
                delete();
            case "List":
              list();
                break;
            case "exit":
            return;
            default:
                System.out.print("It isn't a command");
        }
        }

    }

    private static void delete() {
        for( int id = 0 ;  ; id ++  ) {

        if (  id = 5 ); {delete();
    } } }

    private static void list() {   // sozdet i vivodit spisok
        for (Person p: personList) {
            System.out.println(p);
        }

    }



    private static void create() {
    System.out.println("what is your name"); // sprasivaem
    String name = scanner.next(); // scitivaem s ekrana

        System.out.println("what is your surname");
        String surname = scanner.next();


        System.out.println("what is your phone");
        String phone = scanner.next();


        Person p = new Person();  // sozdaem novuju personu , ekzempljar klassa person

        p.setName(name);   // zapisivaem imja , familiju, telefon v Person
        p.setSurname(surname);
        p.setPhone(phone);

        personList.add(p);  // sohranjaem v spiske person

        System.out.println(p);  // vivodim na ekran


    }
}

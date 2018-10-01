package notepad_vb1;

import java.io.ObjectInput;
import java.util.ArrayList;

import java.util.List;

import java.util.Objects;
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

                case "help":

                    help();

                    break;

                case "Delete":

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

        System.out.println("what number of ID you want to delete?"); // sprasivaem
    int id_num = scanner.nextInt(); // scitivaem s ekrana
        for (int id=0; id==id_num; id++) {

            System.out.println(id);
        }
        personList.remove(id_num);
    }

    private static void help() {

        System.out.println("Enter a question command");

        String cmd = scanner.next();

        switch (cmd) {

            case "create":

                System.out.println("enter new users");

                break;

            case "help":

                System.out.println("about all commands");

                break;

            case "List":

                System.out.println("output of all users");

                break;

            case "Delete":

                System.out.println("input number of ID to delete");

                break;

            case "exit":

                System.out.println("end the programm");
        }
    }





    private static void list() {   // sozdet i vivodit spisok ,
        // pri vivode na ekran avtomaticeski vizivaetsja metod toString
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

        if (phone.length()<5)
        {System.out.println("The number must consist 5 digits");
            return;
        }

        System.out.println("what is your email");

        String email = scanner.next();


        Person p = new Person();  // sozdaem novuju personu , ekzempljar klassa person
        p.setName(name);   // zapisivaem imja , familiju, telefon v Person
        p.setSurname(surname);

        p.setPhone(phone);

        p.setEmail(email);




        personList.add(p);  // sohranjaem v spiske person
        System.out.println(p);  // vivodim na ekran
    }

}

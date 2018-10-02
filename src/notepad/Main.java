package notepad;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



public class Main {

    static Scanner scanner = new Scanner (System.in);

    static List<Record> recordList = new ArrayList<>();  // sozdaet list - spisok
    public static void main(String[] args) {



        while (true) {

            System.out.println ("Enter command");

            String cmd = scanner.next();

            switch (cmd){

                case "create":

                    create();

                    break;

                case "find":
                    find();

                    break;


                case "help":

                    help();

                    break;

                case "note_text":
                    note_text();

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

    private static void find() {

        System.out.println("Find what?");
        String str = askString();
        for (Record r : recordList) {
            if (r.hasSubstring(str)) {
                System.out.println(r);
            }
        }
    }

    private static void note_text() {

        System.out.println("Enter text"); // sprasivaem

        String note_text = askString(); // scitivaem s ekrana

        Note p1 = new Note();  // sozdaem novuju personu , ekzempljar klassa person
        p1.setNote_text(note_text);   // zapisivaem imja , familiju, telefon v Person



        recordList.add(p1);  // sohranjaem v spiske person
        System.out.println(p1);  // vivodim na ekran
    }


    private static void delete() {

        System.out.println("what number of ID you want to delete?"); // sprasivaem
        int id = scanner.nextInt(); // scitivaem s ekrana
        for (int i = 0; i < recordList.size(); i++) {
            Record p = recordList.get(i);
            if (id == p.getId()) {
                recordList.remove(i);
                break;
            }
        }

    }
//        for (int id=0; id==id_num; id++) {
//
//            System.out.println(id);
//        }
//        recordList.remove(id_num);


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
        for (Record p: recordList) {

            System.out.println(p);

        }



    }



    private static void create() {

        System.out.println("what is your name"); // sprasivaem
        String name = askString(); // scitivaem s ekrana
        System.out.println("what is your surname");

        String surname = askString();


        System.out.println("what is your phone");

        String phone = askString();

        while (phone.length()<5)
        {System.out.println("The number must consist 5 digits");
        System.out.println("what is your phone");
        phone = askString();

        }

        System.out.println("what is your email");

        String email = askString();


        Person p = new Person();  // sozdaem novuju personu , ekzempljar klassa person
        p.setName(name);   // zapisivaem imja , familiju, telefon v Person
        p.setSurname(surname);

        p.setPhone(phone);

        p.setEmail(email);




        recordList.add(p);  // sohranjaem v spiske person
        System.out.println(p);  // vivodim na ekran
    }

    // imja i familja s probelami v kavickah

    private static String askString() {
        var result = new ArrayList<String>();
        var word = scanner.next();
        if (word.startsWith("\"")) {

            do {
                result.add(word);
                if (word.endsWith("\"")) {
                    String str = String.join(" ", result);  // ubrat kovicki
                    return str.substring(1,str.length()-1);
                }
                word = scanner.next();
            } while(true);

        } else {
            return word;

        }
    }

}

package notepad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



public class Main {

    public final static String DATE_FORMAT = "dd.MM.yyyy";// constanta ( public final static)
    public final static DateTimeFormatter DATE_FORMATER = DateTimeFormatter.ofPattern(DATE_FORMAT);

    public final static String TIME_FORMAT = "HH:mm:ss";
    public final static DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_FORMAT);


    static Scanner scanner = new Scanner (System.in);

    static List<Record> recordList = new ArrayList<>();  // sozdaet list - spisok
    public static void main(String[] args) {



        while (true) {

            System.out.println ("Enter command ('help'for help):");

            String cmd = scanner.next();

            switch (cmd){

                case "create":

                    create();

                    break;

                case "find":
                    find();

                    break;
                    
                case "reminder":

                    reminder();

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

    public static void reminder() {

        Reminder datetime = new Reminder(); //sozdaetsja reminder
        addRecord(datetime);

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

    public static void note_text() {

        Note p1 = new Note();  // sozdaem novuju personu , ekzempljar klassa person
        addRecord(p1);
    }

    private static void addRecord(Note p1) {
        p1.askQuestion();   // zapisivaem imja , familiju, telefon v Person
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

   private static void help() {

        System.out.println("create:  " +   "enter new users" );
        System.out.println("help:  " + "about all commands" );
        System.out.println("List:  " + "output of all users" );
        System.out.println("Delete:  " + "input number of ID to delete" );
        System.out.println("Exit:  " + "end the programm" );
        System.out.println("note_text :  " + "input TEXT" );
        System.out.println("reminder :  " + "input date/time" );
    }

    private static void list() {   // sozdet i vivodit spisok ,
        // pri vivode na ekran avtomaticeski vizivaetsja metod toString
        for (Record p: recordList) {
            System.out.println(p);
        }
    }


    public static void create() {

        Person p = new Person();  // sozdaem novuju personu , ekzempljar klassa person
        addRecord((Record) p);
    }

    private static void addRecord(Record p) {
        p.askQuestion();   // zapisivaem imja , familiju, telefon v Person

        System.out.println("person");
        recordList.add(p);  // sohranjaem v spiske person
        System.out.println(p);  // vivodim na ekran
    }



    public static String askString() {
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

    public static LocalDate askDate() {
        String d = askString();   // zaprasivaem datu
        LocalDate date =LocalDate.parse(d,DATE_FORMATER);
        return date;

    }

    public static LocalTime askTime() {
        String t = askString();
        LocalTime time =LocalTime.parse(t,TIME_FORMATTER);
        return time;
    }
}

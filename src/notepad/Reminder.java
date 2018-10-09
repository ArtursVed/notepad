package notepad;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reminder extends Note {



    private LocalDate date;
    private LocalTime time;

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }




    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() + '\'' +
                "note_text='" + getNote_text() + '\'' +
                "date='" + date.format(Main.DATE_FORMATER) + '\'' +   // mozno otformatirovat po svoim dannim
                ", time='" + time.format(Main.TIME_FORMATTER) + '\'' +
                '}';
    }

    @Override
    //poisk
    public boolean hasSubstring(String str) {
        return super.hasSubstring(str)
        ||  date.format(Main.DATE_FORMATER).contains(str)
        ||  time.format(Main.TIME_FORMATTER).contains(str);


    }
    @Override
    public void askQuestion() {
        super.askQuestion();

        System.out.println("Enter date"); // sprasivaem
        date = Main.askDate();// scitivaem s ekrana
        System.out.println("Enter time");
        time =  Main.askTime();


    }

}


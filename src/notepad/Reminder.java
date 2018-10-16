package notepad;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Reminder extends Alarm implements Expirable {


    private LocalDate date;
  

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
               "time='" + getTime() + '\'' +
                "date='" + date.format(Main.DATE_FORMATER) + '\'' +   // mozno otformatirovat po svoim dannim
              
                '}';
    }

    @Override
    //poisk
    public boolean hasSubstring(String str) {
        return super.hasSubstring(str)
        ||  date.format(Main.DATE_FORMATER).contains(str);



    }
    @Override
    public void askQuestion() {
        super.askQuestion();

        System.out.println("Enter date"); // sprasivaem
        date = Main.askDate();// scitivaem s ekrana
  

    }


    @Override
    public boolean isExpired() {
        LocalTime time = getTime();
        // LocalDate date = getDate();
        LocalDateTime timedate = LocalDateTime.of(date,time);
        LocalDateTime now = LocalDateTime.now();

        return now.isAfter(timedate);
    }
}


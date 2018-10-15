package notepad;

import java.time.LocalTime;

public class Alarm extends Note {


    private LocalTime time;


    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }



    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() + '\'' +
               "note_text='" + getNote_text() + '\'' +

                ", time='" + time.format(Main.TIME_FORMATTER) + '\'' +
                '}';
    }


    @Override
    //poisk
    public boolean hasSubstring(String str) {
        return super.hasSubstring(str)

                ||  time.format(Main.TIME_FORMATTER).contains(str);




    }
    @Override
    public void askQuestion() {
        super.askQuestion();



        System.out.println("Enter time");
        time =  Main.askTime();




    }


}

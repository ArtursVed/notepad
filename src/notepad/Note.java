package notepad;

public class Note extends Record {

    private String note_text;

    public String getNote_text() {
        return note_text;
    }

    public void setNote_text(String note_text) {
        this.note_text = note_text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() + '\'' +
                "note_text='" + note_text + '\'' +
                '}';
    }


    @Override
    public boolean hasSubstring(String str) {
        return note_text.contains(str);

    }

    @Override
    public void askQuestion() {
        System.out.println("Enter text"); // sprasivaem

         note_text = Main.askString(); // scitivaem s ekrana

    }
}


package notepad;

public abstract class Record {
    private static int count = 0;

    private int id;  // private --prjacet peremennie klassa

    public Record() {

        count ++;

        id = count;

    }

    public abstract boolean hasSubstring(String str);

    public int getId() { return id; }
}

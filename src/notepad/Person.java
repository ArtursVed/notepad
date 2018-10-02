package notepad;


public class Person {

    private static int count = 0;

    private int id;  // private --prjacet peremennie klassa
    private String name;

    private String surname;

    private String phone;

    private String email;

    private String Exit;

    private String Create;

    private String Delete;

    int id_num;



    public Person() {

        count ++;

        id = count;

    }


    public int getId() {

        return id;

    }


    public String getName() {


        return name;

    }


    public void setName(String name) {

        this.name = name;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {

        return surname;

    }


    public void setSurname(String surname) {

        this.surname = surname;

    }


    public String getPhone() {

        return phone;

    }



    public void setPhone(String phone) {

        this.phone = phone;

    }

    @Override   // konvertacija objecta v stroku
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}

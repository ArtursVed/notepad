package notepad;

//klass person soderzin dannie klassa record

public class Person extends Record {


    private String name;

    private String surname;

    private String phone;

    private String email;

    private String Exit;

    private String Create;

    private String Delete;






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
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    @Override
    public boolean hasSubstring(String str) {
        return name.contains(str)
                ||surname.contains(str)
                ||phone.contains(str)
                ||email.contains(str);

    }

    @Override
    public void askQuestion() {
        System.out.println("what is your name"); // sprasivaem
       name = Main.askString(); // scitivaem s ekrana
        System.out.println("what is your surname");

         surname = Main.askString();


        System.out.println("what is your phone");

      phone = Main.askString();

        while (phone.length()<5)
        {System.out.println("The number must consist 5 digits");
            System.out.println("what is your phone");
            phone = Main.askString();

        }

        System.out.println("what is your email");

        email = Main.askString();
    }
}

package entity;

public class Person {
    private int id;
    private String firstName;
    private String phonNumber;
    private String email;
    private int age;
    private String lastName;


    public void work() {
        System.out.println(firstName + "офисте иштейт  ");
    }

    public void timetable(int day) {

        switch (day) {
            case 1:
                System.out.println(firstName+"works");
                break;
            case 2:
                System.out.println("works hard");
                break;
            case 3:
                System.out.println("works less");
                break;
            case 4:
                System.out.println("works more");
                break;
            case 5:
                System.out.println("works with team");
                break;
            case 6:
                System.out.println("works briefly");
                break;
            case 7:
                System.out.println("holiday");
                break;
            default:
                System.out.println("excuse me are you studied in school");

        }
    }


    public Person(int id, String firstName, String phonNumber, String email, int age, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("@ жок кайрадан ткешериниз ");
        }
        if (age < 0 || age > 110) {
            System.out.println("Терс сан берууго жана жок сан берууго болбойт ");
        } else {
            this.age = age;
        }
        if (phonNumber.startsWith("+996")) {
            this.phonNumber = phonNumber;
        } else {
            System.out.println("Кыргыз номер бериниз ");
        }
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", phonNumber='" + phonNumber + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}' + "\n";
    }
}


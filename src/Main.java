import entity.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 21, "Baku");
        Person person2 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 21, "Baku");
        Person person3 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 2, "Baku");
        Person person4 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 3, "Baku");
        Person person5 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 4, "Baku");
        Person person6 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 34, "Baku");
        Person person7 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 45, "Baku");
        Person person8 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 54, "Baku");
        Person person9 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 34, "Baku");
        Person person10 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 32, "Baku");
        Person person11 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 23, "Baku");
        Person person12 = new Person(21, "baktygul", "+996707411028", "asdfsd@gmail.com", 12, "Baku");
        Person person13 = new Person(21, "baktygulkushtar", "+996707411028", "2asdfsd@gmail.com", 12, "Baku");
        Person person14 = new Person(21, "baktygulkushtar", "+996707411028", "asdfsd@gmail.com", 34, "Baku");
        Person person15 = new Person(21, "baktygulkushtar", "+996707411028", "23@4678634", 78, "Baku");
        Person person16 = new Person(21, "baktygulkushtar", "+996707411028", "234@678634", 34, "Baku");
        Person person17 = new Person(21, "baktygulkushtar", "+996707411028", "2346@78634", 21, "Baku");
        Person person18 = new Person(21, "baktygulkushtarbekkyzy", "+996707411028", "23467@8634", 23, "Baku");
        Person person19 = new Person(21, "baktygulkushtar", "+996707411028", "234678!@634", 21, "Baku");
        Person person20 = new Person(21, "baktygulkushtar", "+996707411028", "23@467863", 21, "Baku");
        Person person21 = new Person(21, "baktygulkushtarbekkyzyy", "+996707411028", "23467@8634", 34, "Baku");
        Person person22 = new Person(21, "baktygulkushtarbekkyzyy", "+996707411028", "234@678634", 87, "Baku");
        Person person23 = new Person(21, "baktygulkushtarbekkyzyy", "+996707411028", "2346@78634", 32, "Baku");
        Person person24 = new Person(21, "baktygulkushtarbekkyzyy", "+996707411028", "23467@8634", 21, "Baku");
        Person person25 = new Person(21, "baktygulkushtarbekkyzyy", "+996707411028", "234678@634", 12, "Baku");
        Person person26 = new Person(21, "baktygulkushtarbekkyzyy", "+996707411028", "2346786@34", 12, "Baku");
        Person person27 = new Person(21, "baktygulkushtarbekkyzyy", "+996707411028", "2346786@34", 56, "Baku");
        Person person28 = new Person(21, "baktygulkushtarbekkyzyy", "+996707411028", "23467863@4", 2, "Baku");
        Person person29 = new Person(21, "baktygulkushtarbekkyzyy", "+996707411028", "23467863@4", 1, "Baku");
        Person person30 = new Person(21, "baktygulkushtarbekkyzy", "+996707411028", "23467863@4", 9, "Baku");


        Person[] persons = {person1, person2, person3, person4, person5, person6, person7, person8};
        CrazyHouse house = new CrazyHouse(1, "Crazy House", "Kekol 5A", 210000, 2022, persons);


        Person[] persons1 = {person9, person10, person11, person12, person13, person14, person15, person16};
        FashTeamHouse house1 = new FashTeamHouse(3, "FashTeamHouse", "Jibek jolu 5", 78000, 2021, persons1);

        Person[] persons2 = {person17, person18, person19, person20, person21, person22, person23};
        StarHouse house2 = new StarHouse(3, "Star House", "Jibek jolu 9", 80800, 2024, persons2);

        Person[] persons3 = {person24, person25, person26, person27, person28, person29, person30};
        VipHouse house3 = new VipHouse(3, "Vip House", "Jibek jolu 5", 543800, 2021, persons3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Crazy House
                FashTeamHouse
                Star House
                Vip House""");
        System.out.println("\nбир Houseту танданыз: ");
        String houseName = scanner.nextLine();
        if (houseName.equals(house.getName())) {
            house.city();
            System.out.println(house.electricity());
            house.uniqueMethod();
            System.out.println(house);
            for (Person per:persons) {
                System.out.println("Жуманын кундорун сан менен бериниз");
                per.timetable(scanner.nextInt());
            }
        } else if (houseName.equals(house1.getName())) {
            house1.city();
            System.out.println(house1.electricity());
            house1.uniqueMethod();
            System.out.println(house1);
            for (Person per : persons1) {
                System.out.println("Жуманын кундорун сан менен бериниз");
                per.timetable(scanner.nextInt());
            }
        } else if (houseName.equals(house2.getName())) {
            house2.city();
            System.out.println(house2.electricity());
            house2.uniqueMethod();
            System.out.println(house2);
            for (Person per : persons2) {
                System.out.println("Жуманын кундорун сан менен бериниз");
                per.timetable(scanner.nextInt());
            }
        } else if (houseName.equals(house3.getName())) {
            house3.city();
            System.out.println(house3.electricity());
            house3.uniqueMethod();
            System.out.println(house3);
            for (Person per : persons3) {
                System.out.println("Жуманын кундорун сан менен бериниз");
                per.timetable(scanner.nextInt());
            }
        }
    }
}







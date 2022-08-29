import entity.Person;

import java.util.Arrays;

public abstract class House {

    private int  id;
    private String name;
    private String address;
    private int price;
    private int year;
    private Person [] person;

    public House() {

    }

    public abstract void city();
    public abstract String electricity();

    public House(int id, String name, String address, int price, int year, Person [] person) {
        this.id = id;
        if (name.contains("r")|| name.contains("o")|| name.contains("b")|| name.contains("m")|| name.contains("w")|| name.contains("h")){
        this.name = name;
        }else {
            System.out.println("Уй кабыл алынбайт биздин шарттагыдай болсун ");
        }
        this.address = address;
        if (price>70000){
            this.price = price;
        }else {
            System.out.println("Биздин шартка туура келбейт ");
        }
        if (year>2015){
            this.year = year;
        }else {
            System.out.println("Сиздин уйунуз эски ");
        }

        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "House " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", year=" + year +
                "\n\n person=" + Arrays.toString(person) ;
    }
}

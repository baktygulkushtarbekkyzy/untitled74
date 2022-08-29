import entity.Person;

public class VipHouse extends House{
    public VipHouse() {
    }

    public VipHouse(int id, String name, String address, int price, int year, Person[] person) {
        super(id, name, address, price, year, person);
    }

    public void uniqueMethod(){
        System.out.println("""
                my house is crazy house""");
    }
    @Override
    public void city() {
        System.out.println(getName()+" is situated in "+ getAddress());
    }

    @Override
    public String electricity() {
        int count=0;
        int counter=0;
        for (int i = 0; i < getPerson().length; i++) {
            count++;
            counter++;
        }
        count*=150;
        return counter+"адам жашайт \nЭлектр энергиясына айына "+count+"сом кетет. ";
    }
}

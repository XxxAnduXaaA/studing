import java.util.ArrayList;
import java.util.List;

//Нужен для работы с элементами списка списков

public class FlatMapExample {
    public static void main(String[] args) {

        House house1 = new House("Topleva", "9A",11);
        House house2 = new House("Lenina", "11",9);

        Vestibule vestibule1 = new Vestibule(1, "1-50");
        Vestibule vestibule2 = new Vestibule(2, "51-100");
        Vestibule vestibule3 = new Vestibule(3, "101-150");
        Vestibule vestibule4 = new Vestibule(4, "151-200");

        house1.vestibules.add(vestibule1);
        house1.vestibules.add(vestibule2);
        house1.vestibules.add(vestibule3);
        house1.vestibules.add(vestibule4);

        Vestibule vestibule5 = new Vestibule(1, "1-40");
        Vestibule vestibule6 = new Vestibule(2, "41-80");
        Vestibule vestibule7 = new Vestibule(3, "81-120");
        Vestibule vestibule8 = new Vestibule(4, "121-160");

        house2.vestibules.add(vestibule5);
        house2.vestibules.add(vestibule6);
        house2.vestibules.add(vestibule7);
        house2.vestibules.add(vestibule8);

        System.out.println(house1);

        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);

        houses.stream().flatMap(house -> house.getVestibules().stream()).forEach(vestibule -> System.out.println(vestibule.vestibuleAppartements));
        houses.stream().flatMap(house -> house.getVestibules().stream()).forEach(vestibule -> System.out.println(vestibule.vestibuleAppartements));

    }
}

class House{
    String address;
    String number;
    int floorNumber;
    List<Vestibule> vestibules;

    public House(String address, String number, int floorNumber) {
        this.address = address;
        this.number = number;
        this.floorNumber = floorNumber;
        vestibules = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", floorNumber=" + floorNumber +
                ", vestibules=" + vestibules +
                '}';
    }

    public List<Vestibule> getVestibules(){
        return vestibules;
    }
}

class Vestibule{
    int vestibuleNumber;
    String vestibuleAppartements;


    public Vestibule(int vestibuleNumber, String vestibuleAppartements) {
        this.vestibuleNumber = vestibuleNumber;
        this.vestibuleAppartements = vestibuleAppartements;
    }

    @Override
    public String toString() {
        return "Vestibule{" +
                "vestibuleNumber=" + vestibuleNumber +
                ", vestibuleAppartements='" + vestibuleAppartements + '\'' +
                '}';
    }
}

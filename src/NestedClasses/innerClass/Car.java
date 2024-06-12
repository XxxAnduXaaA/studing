package NestedClasses.innerClass;

public class Car {

//    void method(){
//        System.out.println(Engine.horsePower);
//        Engine e = new Engine(201);
//        System.out.println(e.b);
//    }

    int doorsNumber;
    int wheelsNumber;
    private static String color;

    Engine engine;

    public Car(int doorsNumber, int wheelsNumber, String color, int horsepower) {
        this.doorsNumber = doorsNumber;
        this.wheelsNumber = wheelsNumber;
        this.color = color;
        this.engine = this.new Engine(horsepower);
    }

    public Car(int doorsNumber, int wheelsNumber, String color) {
        this.doorsNumber = doorsNumber;
        this.wheelsNumber = wheelsNumber;
        this.color = color;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "This Car{" +
                "doorsNumber=" + doorsNumber +
                ", wheelsNumber=" + wheelsNumber +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

//    Inner класс не может содержать static методы/поля
    public class Engine {
        private int horsePower;

//        public static int a = 1;
//    НО, если мы хоти создать константу, то можно
        public final static int a = 1;
        public Engine(int horsePower) {
            System.out.println(color);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "This Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
//        Car.Engine engine = new Car.Engine(200);

        Car car1 = new Car(4, 4, "Yellow");
        System.out.println(car1);

        Car.Engine engine1 = car1.new Engine(500);
        System.out.println(engine1);
        car1.setEngine(engine1);

        System.out.println(car1);

        Car car2 = new Car(6, 4, "Red", 600);
        System.out.println(car2);

        //Но так теряется ссылка на машину мотора, так что вряд ли нужно
        Car.Engine engine3 = new Car(4, 4, "blue").new Engine(200);

        System.out.println(engine3);
    }
}

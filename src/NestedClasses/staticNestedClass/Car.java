package NestedClasses.staticNestedClass;

public class Car {

    void method(){
        System.out.println(Engine.horsePower);
        Engine e = new Engine(201);
        System.out.println(e.b);
    }

    int doorsNumber;
    int wheelsNumber;
    String color;

    Engine engine;

    private static int a;

    public Car(int doorsNumber, int wheelsNumber, String color, Engine engine) {
        this.doorsNumber = doorsNumber;
        this.wheelsNumber = wheelsNumber;
        this.color = color;
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


    public static class Engine {
        private static int horsePower;
        private int b;

        public Engine(int horsePower) {
            System.out.println(a);
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
        Car.Engine engine = new Car.Engine(200);
        System.out.println(engine);

        Car car = new Car(4, 4, "Yellow", engine);

        System.out.println(car);

        car.method();
    }
}

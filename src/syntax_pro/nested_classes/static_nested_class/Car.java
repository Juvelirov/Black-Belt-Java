package syntax_pro.nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine){
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int horsePower;

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256); // Просто Engine создать невозможно, потому что он nested and static.
        System.out.println(e);
        Car car = new Car("red", 4, e);
        System.out.println(car);
    }
}
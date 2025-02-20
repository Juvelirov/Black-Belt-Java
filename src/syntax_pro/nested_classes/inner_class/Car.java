package syntax_pro.nested_classes.inner_class;

// Inner class Engine не может быть создан без создания объекта машины. Жесткая связь.
public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower){
        this.color = color;
        this.doorCount = doorCount;
        // this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
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

    public class Engine {
        private int horsePower;

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
        Car car = new Car("red", 4, 256);
        System.out.println(car);
    }
}
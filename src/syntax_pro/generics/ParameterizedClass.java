package syntax_pro.generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("ExampleStr");
        System.out.println(info1 + " " + info1.getValue().getClass());
    }
}

// T - Type Placeholder (Заполнитель типа)
class Info<T> {
    public T value;

    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return "Value: " + value;
    }

    public T getValue(){
        return value;
    }
}
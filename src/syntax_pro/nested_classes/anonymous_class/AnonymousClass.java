package syntax_pro.nested_classes.anonymous_class;

// Анонимные классы применяются, когда нам точно известно, что мы будем использовать класс один раз, чтобы не создавать новый, который никак не будет использоваться в других участках кода.
// Избежать создания отдельного класса для одноразового использования.
public class AnonymousClass {
    public static void main(String[] args) {
        // Какой-то анонимус имплементит интерфейс Math и дополнительно добавляет свою логику
        Math math = new Math() {
            int variable = 5;
            public void doSomething(){}
            /// ...
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        // Какой-то анонимус экстендит класс Math и дополнительно добавляет свою логику
        MathClass mc = new MathClass(){
            int variable = 10;
            int doOperationPlus(int a, int b){
                return a+b;
            }
        };
        System.out.println(mc.doOperation(2,2));
        System.out.println(math.doOperation(5,2));
    }
}

interface Math {
    int doOperation(int a, int b);
}

class MathClass{
    int doOperation(int a, int b){
        return a*b;
    }
}

package syntax_pro.nested_classes;

public class Test {
    // как правило, nested class имеют доступ к элементам outer class. тесная связь без возможности разрыва
    // static = inner
    static class A{} // static class
    class B{} // inner class
    void method(){
        class C{} // local class
    }
}

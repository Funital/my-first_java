public class Ex3 {
}
class A{
    B b = new A.B();
    void f(){B b = new A.B();}
    static class B{}
}

public class StaticExample {
    public void nonStatic() {
        // this is non static mthod when we call non staic method we create object and
        // then call in below we make object hello
        // to call method nonstatic
        System.out.println("nonstatic method");
    }

    public static void staticExample() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        System.out.println("example for static and non static method");
        StaticExample hello = new StaticExample();
        hello.nonStatic();
        staticExample();
    }
}
import static java.lang.System.out;
class Demo {
    public static void main(String[] args) {
        new Person("Adam").start();
        new Person("Johny").start();
    }
}
class Person extends Thread{
    Person(String name) {
        super(name);
    }
    @Override
    public void run() {
        out.printf("%s is running ...\n", getName());
    }
}
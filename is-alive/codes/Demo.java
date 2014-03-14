import static java.lang.System.out;
class Demo {
    public static void main(String[] args) {
        Person p1 = new Person();
        out.printf("is alive ... %s\n", p1.isAlive());
        p1.start();
        out.printf("is alive ... %s\n", p1.isAlive());
    }
}
class Person extends Thread{
    @Override
    public void run() {
        out.println("person is running ...");
    }
}
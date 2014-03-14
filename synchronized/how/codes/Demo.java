import static java.lang.System.out;
class Demo {
    public static void main(String[] args) {
        Toilet t = new Toilet();
        new Person("Adam", t).start();
        new Person("Johny", t).start();
    }
}
class Toilet {
    public synchronized void use() {
        out.printf("%s started using toilet\n", Thread.currentThread().getName());
        out.printf("%s finished using toilet\n", Thread.currentThread().getName());
    }
}
class Person extends Thread{
    Toilet toilet;
    Person(String name, Toilet t) {
        super(name);
        toilet = t;
    }
    @Override
    public void run() {
        toilet.use();
    }
}
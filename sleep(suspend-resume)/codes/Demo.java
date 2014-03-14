import static java.lang.System.out;
class Demo {
    public static void main(String[] args) {
        new Person().start();
    }
}
class Person extends Thread{
    @Override
    public void run() {
        out.println("person is running ...");
        for (int i = 1; 3 != i; i ++) {
            out.println("person is suspended ...");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            out.println("person is resumed ...");            
        }
    }
}
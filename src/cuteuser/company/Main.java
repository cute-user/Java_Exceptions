package cuteuser.company;

public class Main {

    static void f() throws ArithmeticException {
        f();
        try {
            System.out.println(1/0);
        }
        catch (Exception exception) {
            //System.out.println(1/0);
        }
        finally {
            System.out.println("finaly");
        }
        System.out.println("f end");
    }

    public static void main(String[] args) {
        f();
        System.out.println();
    }
}

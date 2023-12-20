package EjPassword;

public class Main {
    public static void main(String[] args) {
        Password p = new Password();
        System.out.print(p);
        Password p2 = new Password(36);
        System.out.println(p2);
    }
}

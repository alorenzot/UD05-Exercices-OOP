package EjPassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tell me how many passwords you want for me to generate.");
        int passwordsQuantity=askForQuantity();
        Password[] passwords=new Password[passwordsQuantity];
        for (int i=0;i<passwordsQuantity;i++){
            passwords[i]=new Password();
        }
        for (Password password: passwords)
            System.out.println(password);
    }

    private static int askForQuantity() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Introduce only numbers");
            return askForQuantity();
        } else {
            return sc.nextInt();
        }
    }
}

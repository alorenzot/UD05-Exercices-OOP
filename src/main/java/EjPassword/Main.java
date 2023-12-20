package EjPassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tell me how many passwords you want for me to generate.");
        int passwordsQuantity=askForQuantity();
        Password[] passwords=new Password[passwordsQuantity];
        Boolean[] isStrong=new Boolean[passwordsQuantity];

        System.out.println("How many characters will the password have?");
        int passwordsLength=askForQuantity();


        for (int i=0;i<passwordsQuantity;i++){
            passwords[i]=new Password(passwordsLength);
            isStrong[i]=passwords[i].isStrong();
        }
        for (int i=0;i<passwordsQuantity;i++) {
            System.out.println(passwords[i]);
        }
    }
    private static int askForQuantity() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Introduce only numbers.");
            return askForQuantity();
        } else {
            return sc.nextInt();
        }
    }

}

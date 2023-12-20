package EjPassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tell me how many passwords you want for me to generate.");
        int passwordsQuantity = setLength();
        Password[] passwords = new Password[passwordsQuantity];
        Boolean[] isStrong = new Boolean[passwordsQuantity];

        System.out.println("How many characters will the password have?");
        int passwordsLength = setLength();


        for (int i = 0; i < passwordsQuantity; i++) {
            passwords[i] = new Password(passwordsLength);
            isStrong[i] = passwords[i].isStrong();
        }
        for (int i = 0; i < passwordsQuantity; i++) {
            System.out.println("Generated password: " + passwords[i] + ", is strong? " + isStrong[i]);
        }
    }

    private static int setLength() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Introduce only numbers.");
            return setLength();
        } else {
            return sc.nextInt();
        }
    }

}

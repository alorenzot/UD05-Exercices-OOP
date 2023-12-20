package EjPassword;

public class Password {
    private int length;
    private static int defaultLength = 10;
    private String password;
    private String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRTSUVWXYZ0123456789";


    public Password() {
        this.length = defaultLength;
        this.password = generatePassword(length);
    }
    public Password(int length) {
        this.length = length;
        this.password = generatePassword(length);
    }
    public boolean isStrong() {
        if (numberChecker(password)+lowerChecker(password)+upperChecker(password)==7) return true;
        else return false;
    }
    private int numberChecker(String password) {
        int check = 0;
        if (password.length() != 0)
            for (int i = 52; i < characters.length(); i++) {
                for (int j = 0; j < password.length(); j++) {
                    if (characters.charAt(i) == password.charAt(j)) {
                        check++;
                        if (check == 4) {
                            return check;
                        }
                    }
                }
            }
        return check;
    }
    private int lowerChecker(String password) {
        int check = 0;
        if (password.length() != 0)
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < password.length(); j++) {
                    if (characters.charAt(i) == password.charAt(j)) {
                        check++;
                        if (check == 1) {
                            return check;
                        }
                    }
                }
            }
        return check;    }
    public int upperChecker(String password) {
        int check = 0;
        if (password.length() != 0)
            for (int i = 27; i < 52; i++) {
                for (int j = 0; j < password.length(); j++) {
                    if (characters.charAt(i) == password.charAt(j)) {
                        check++;
                        if (check == 2) {
                            return check;
                        }
                    }
                }
            }
        return check;    }
    public String generatePassword(int length) {
        String aux = "";
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * characters.length());
            aux += characters.charAt(random);
        }
        return aux;
    }
    public int getLength() {
        return length;
    }
    public String getPasswordAndLength() {
        return password + length;
    }
    @Override
    public String toString() {
        return password;
    }
}

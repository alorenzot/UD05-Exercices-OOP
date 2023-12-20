package EjPassword;

public class Password {
    private int length;
    private static int defaultLength=10;
    private String password;

    public Password(){
        this.length=defaultLength;
        this.password=generatePassword(length);
    }
    public Password(int length){
        this.length=length;
        this.password=generatePassword(length);
    }
    public boolean isStrong(){
        int strengthness=0;
        for (int i=0; i<this.password.length();i++){
            if (password.charAt(i)=='A');//mayuscula

        }
        return false;
    }
    public String generatePassword(int length){
        String characters="abcdefghijklmopqrstuvwxyzABCDEFGHIJKLMNOPQRTSUVWXYZ0123456789";
        String aux="";
        for (int i=0;i<=length;i++){
            int random=(int)(Math.random()*characters.length());
            aux+=characters.charAt(random);
        }
        return aux;
    }
    @Override
    public  String toString(){
        return "Your password is: "+password;
    }
}

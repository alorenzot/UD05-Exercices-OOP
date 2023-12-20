package org.EjPersona;

import java.util.Scanner;

public class PersonaTester {
    public static void main(String[] args) {
        Persona[] personas=new Persona[6];
        for (int i=0;i< personas.length;i++){
            System.out.println("Vamos con la " + (i+1) + "ª persona.");
            boolean introduceDNI=Persona.introduceDNI();
            if (introduceDNI)
                personas[i]=new Persona(setNombre(),setApellidos(),setEdad(),setDni(),setSexo(),setPeso(),setAltura());
            else
                personas[i]=new Persona(setNombre(), setApellidos(), setEdad());
        }
        for (Persona persona:personas)
            System.out.println(persona);
    }
    public static String setNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre=sc.next();
        return nombre;
    }
    public static String setApellidos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus apellidos: ");
        String apellidos=sc.nextLine();
        return apellidos;
    }
    public static int setEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        if (!sc.hasNextInt()) {
            System.out.println("Introduce un número.");
            return setEdad();
        }
        else return sc.nextInt();
    }
    public static String setDni(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el DNI: ");
        String respuesta=sc.next();
        if (respuesta.length()!=9){
            System.out.println("Debes introducir 8 numeros y una letra.");
            return setDni();
        } else return respuesta;
    }
    public static Sexo setSexo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu sexo [1-Hombre][2-Mujer][3-No Especificado]");
        int sexo=sc.nextInt();
        switch (sexo){
            case 1:
                return Sexo.Hombre;
            case 2:
                return Sexo.Mujer;
            case 3:
                return Sexo.No_Especificado;
            default:
                System.out.println("Introduce una opción válida.");
                return setSexo();
        }

    }
    public static float setPeso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu peso en kg: [65,3]");
        if (!sc.hasNextFloat()){
            System.out.println("Introduce solo numeros con coma.");
            return setPeso();
        }
        else return sc.nextFloat();
    }
    public static float setAltura() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu altura en metros: [1,65]");
        if (!sc.hasNextFloat()){
            System.out.println("Introduce solo numeros con coma.");
            return setAltura();
        }
        else return sc.nextFloat();
    }
}

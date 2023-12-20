package org.EjPersona;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String DNI;
    private Sexo sexo;
    private float peso;
    private float altura;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = Sexo.No_Especificado;
        this.peso = 62.5f;
        this.altura = 1.65f;
    }

    public Persona(String nombre, String apellidos, int edad, String DNI, Sexo sexo, float peso, float altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        float IMC = peso / (altura * altura);
        if (IMC < 18.5) return -1;
        if (IMC >= 18.5 && IMC < 25) return 0;
        if (IMC >= 25 && IMC < 30) return 1;
        else return 2;
    }
    public String respuestaIMC(int IMC) {
        switch (IMC) {
            case -1:
                return "Bajo peso";
            case 0:
                return "Rango normal";
            case 1:
                return "Sobrepeso";
            default:
                return "Obesidad";
        }
    }

    public boolean esMayorDeEdad() {
        if (edad < 18) return false;
        else return true;
    }

    public static boolean introduceDNI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Vas a introducir tu DNI? [s | n]");
        String respuesta = sc.next();
        if (respuesta.toLowerCase().charAt(0) == 's') {
            return true;
        } else if (respuesta.toLowerCase().charAt(0) == 'n') {
            return false;
        } else {
            System.out.println("Introduce sí o no [s | n]");
            return introduceDNI();
        }
    }

    public String generaDNI() {
        String DNI = "";
        char[] dniLetter = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        DNI += getDNINumbers() + getDNILetter(dniLetter, Integer.parseInt(getDNINumbers()));
        return DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDNI() {
        return this.DNI;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public float getPeso() {
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public String getDNINumbers() {
        String numbers = "";
        int aux = (int) (Math.random() * 100000000);
        numbers += String.valueOf(aux);
        return numbers;
    }

    public char getDNILetter(char[] array, int numbers) {
        int letter = numbers % 23;
        char result = array[letter];
        return result;
    }

    @Override
    public String toString() {
        return "\nNombre: " + getNombre() + "\n" +
                "Apellidos: " + getApellidos() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "DNI: " + getDNI() + "\n" +
                "Sexo: " + getSexo() + "\n" +
                "Peso: " + getPeso() + "kg\n" +
                "Altura: " + getAltura() + "m\n" +
                "Mayor de edad: " + esMayorDeEdad() + "\n" +
                "IMC: "+ respuestaIMC(calcularIMC())
                ;
    }
}
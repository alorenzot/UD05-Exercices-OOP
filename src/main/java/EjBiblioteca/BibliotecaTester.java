package EjBiblioteca;

public class BibliotecaTester {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("AAAA", "BBBB");
        b.agregarLibro("La vida de Joel","Dame 90 céntimos", 3);
        System.out.println(b);
    }

}

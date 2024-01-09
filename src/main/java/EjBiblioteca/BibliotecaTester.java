package EjBiblioteca;

public class BibliotecaTester {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("AAAA", "BBBB");
        System.out.println("Antes de añadir la corteza: "+b.getCantidadLibrosActuales());
        b.agregarLibro("La corteza del arbol", "La vereda", 3);
        System.out.println("Despues de alñadir la corteza: "+b.getCantidadLibrosActuales());
        System.out.println(b.comprobarLibro("La corteza"));
        System.out.println(b.comprobarLibro("Desola"));
        b.eliminarLibro("La corteza");
        System.out.println("Despues de eliminar la corteza: "+b.getCantidadLibrosActuales());

    }

}

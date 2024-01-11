package EjBiblioteca;

public class BibliotecaTester {
    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca("El rincón", "Plaza de San Juan, Madrid");
        Biblioteca b2 = new Biblioteca("Book bin", "Calle de Ramón y Cajal, Madrid");

        b1.agregarLibro("La vida de Joel","Joel Gutiérrez",3);
        b1.agregarLibro("La casa del Array", "Mar Martínez", 4);
        b1.agregarLibro("El último String", "Java Entertainment", 2);
        b1.agregarLibro("El jardín de la recursividad", "Joaquín Alonso", 3);
        b1.agregarLibro("La diferencia iterativa", "Alex Madison", 5);

        b2.eliminarLibro("Don Quijote");
        b2.eliminarLibro("El amor");
        b2.eliminarLibro("La casa");
        b2.eliminarLibro("365");

        b1.prestamo("La vida de Joel");
        b1.prestamo("El último String");
        b1.devolucion("La casa del Array");

        b2.prestamo("Cien años");
        b2.prestamo("Cien años");
        b2.devolucion("Cien años");

        System.out.println(b1);
        System.out.println(b2);
    }

}

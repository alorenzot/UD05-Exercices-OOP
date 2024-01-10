package EjBiblioteca;

public class Biblioteca {
    private static int cantidadLibrosMaxima = 100;
    private Libro[] libros;
    private int cantidadLibrosActuales;
    private String nombre;
    private String localizacion;


    public Biblioteca(String nombre, String localizacion) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        libros = new Libro[cantidadLibrosMaxima];

        String[][] librosBasicos = {
                {"Don Quijote de la Mancha", "Miguel de Cervantes Saavedra"},
                {"Cien años de soledad", "Gabriel García Márquez"},
                {"El alquimista", "Paulo Coehlo"},
                {"20 poemas de amor y una canción desesperada", "Pablo Neruda"},
                {"La ciudad y los perros", "Mario Vargas Llosa"},
                {"La casa de los espíritus", "Isabel Allende"},
                {"Desolación", "Gabriela Mistral"},
                {"Rayuela", "Julio Cortázar"},
                {"El Aleph", "Jorge Luis Borges"},
                {"El amor en los tiempos del cólera", "Gabriel García Márquez"}
        };

        for (int i = 0; i < librosBasicos.length; i++) {
            libros[i] = new Libro(librosBasicos[i][0], librosBasicos[i][1], 3);
            cantidadLibrosActuales++;
        }
    }


    public int comprobarLibro(String busqueda) {
        int i = 0;
        while (i < cantidadLibrosActuales) {
            if (libros[i].getTitulo().contains(busqueda)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean agregarLibro(String titulo, String autor, int ejemplares) {
        if (cantidadLibrosActuales >= cantidadLibrosMaxima) {
            return false;
        } else {
            libros[cantidadLibrosActuales] = new Libro(titulo, autor, ejemplares);
            cantidadLibrosActuales++;
            return true;
        }
    }

    public Libro[] reordenarLibros(int indice) {
        Libro[] aux = new Libro[cantidadLibrosMaxima];

        for (int i = 0; i < indice; i++) {
            aux[i] = libros[i];
        }
        for (int i = indice; i + 1 < libros.length; i++) {
            aux[i] = libros[i + 1];
        }

        cantidadLibrosActuales--;
        return libros = aux;
    }

    public boolean eliminarLibro(String titulo) {
        if (comprobarLibro(titulo) == -1) return false;

        else reordenarLibros(comprobarLibro(titulo));
        return true;
    }

    public boolean prestamo(String titulo) {
        int libroEnTramite = comprobarLibro(titulo);
        if (libroEnTramite == -1) return false;
        if (libros[libroEnTramite].getEjemplaresDisponibles() < 0) return false;
        else {
            libros[libroEnTramite].setEjemplaresDisponibles(libros[libroEnTramite].getEjemplaresDisponibles() - 1);
            libros[libroEnTramite].setEjemplaresPrestados(libros[libroEnTramite].getEjemplaresPrestados() + 1);
            return true;
        }
    }

    public boolean devolucion(String titulo) {
        int libroEnTramite = comprobarLibro(titulo);
        if (libroEnTramite == -1) return false;
        if (libros[libroEnTramite].getEjemplaresPrestados() == 0) return false;
        else {
            libros[libroEnTramite].setEjemplaresDisponibles(libros[libroEnTramite].getEjemplaresDisponibles() + 1);
            libros[libroEnTramite].setEjemplaresPrestados(libros[libroEnTramite].getEjemplaresPrestados() - 1);
            return true;
        }
    }

    public int getCantidadLibrosActuales() {
        return cantidadLibrosActuales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    @Override
    public String toString(){
        return "Nombre de la Biblioteca: " + getNombre() + "\n" +
                "Localización: " + getLocalizacion() + "\n" +
                "Libros disponibles: " + getCantidadLibrosActuales() + "\n" +
                "Lista de libros: " + "\n" +
                mostrarLibros();
    }
    //TODO NO ENTIENDO NADA
    private String mostrarLibros() {
        return this.libros.toString();
    }
}

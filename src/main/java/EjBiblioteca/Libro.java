package EjBiblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplaresDisponibles;
    private int ejemplaresPrestados;

    public Libro(String titulo, String autor, int ejemplaresDisponibles){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplaresDisponibles=ejemplaresDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }
    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }
    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public boolean prestamo(){
        if (ejemplaresDisponibles!=0) {
            ejemplaresPrestados++;
            ejemplaresDisponibles--;
            return true;
        }
        else return false;
    }
    public boolean devolucion(){
        if (ejemplaresPrestados!=0) {
            ejemplaresPrestados--;
            ejemplaresDisponibles++;
            return true;
        }
        else return false;
    }

    @Override
    public String toString(){
        return "· Título: " + getTitulo() + "\n" +
                "    Autor: " + getAutor() + "\n" +
                "    Ejemplares disponibles: " + "\n" +
                "    Ejemplares prestados: " + "\n";
    }


}

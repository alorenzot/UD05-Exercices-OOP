package EjBiblioteca;

public class Biblioteca {
    private int cantidadLibros=100;
    private int cantidadLibrosActuales;
    private String nombre;
    private String localizacion;
    private Libro[] libros;

    public Biblioteca(String nombre, String localizacion){
        this.nombre=nombre;
        this.localizacion=localizacion;
        libros=new Libro[cantidadLibros];

        String[][] librosBasicos ={
                {"Don Quijote de la Mancha", "Miguel de Cervantes Saavedra"},
                {"Cien años de soledad", "Gabriel García Márquez"},
                {"El alquimista", "Paulo Coehlo"},
                {"20 poemas de amor y una canción desesperada", "Pablo Neruda"},
                {"La ciudad y los perros", "Mario Vargas Llosa"},
                {"La casa de los espíritus","Isabel Allende"},
                {"Desolación", "Gabriela Mistral"},
                {"Rayuela", "Julio Cortázar"},
                {"El Aleph", "Jorge Luis Borges"},
                {"El amor en los tiempos del cólera","Gabriel García Márquez"}
        };

        for (int i=0;i<librosBasicos.length;i++){
            libros[i]=new Libro(librosBasicos[i][0],librosBasicos[i][1],3);
            cantidadLibrosActuales++;
        }
    }

}

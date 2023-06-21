package clase2;

public class Usuarios {

    private static int idCounter = 0;
    public int id;
    public String nombre, apellido;
    private int edad;

    public Usuarios(String nombre, String apellido, int edad) {
        this.id = Usuarios.getId();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
        
    private static int getId(){
        return ++idCounter;
    }
        
    static int getUsersCount(){
        return Usuarios.idCounter;
    }
    
    
}

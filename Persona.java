public abstract class Persona {
    protected String nombre;
    protected int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract void mostrar();
}

class Alumno extends Persona {
    private String curso;
    
    public Alumno(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Alumno: " + nombre + ", Edad: " + edad + ", Curso: " + curso);
    }
}

class Profesor extends Persona {
    private String asignatura;
    
    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Profesor: " + nombre + ", Edad: " + edad + ", Asignatura: " + asignatura);
    }
}

class TestPersonas {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Carlos", 20, "Matemáticas");
        Profesor profesor = new Profesor("Laura", 45, "Historia");
        
        alumno.mostrar();
        profesor.mostrar();
    }
}

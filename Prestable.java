public interface Prestable {
    void presta();
    void devuelve();
    boolean estaPrestado();
}

class Publicacion {
    private String ISBN;
    private String titulo;
    private int anioPublicacion;
    
    public Publicacion(String ISBN, String titulo, int anioPublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }
    
    @Override
    public String toString() {
        return "Título: " + titulo + ", ISBN: " + ISBN + ", Año: " + anioPublicacion;
    }
}

class Libro extends Publicacion implements Prestable {
    private boolean prestado;
    
    public Libro(String ISBN, String titulo, int anioPublicacion) {
        super(ISBN, titulo, anioPublicacion);
        this.prestado = false;
    }
    
    @Override
    public void presta() {
        prestado = true;
    }
    
    @Override
    public void devuelve() {
        prestado = false;
    }
    
    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}

class Revista extends Publicacion {
    private int numero;
    
    public Revista(String ISBN, String titulo, int anioPublicacion, int numero) {
        super(ISBN, titulo, anioPublicacion);
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Número: " + numero;
    }
}

class TestBiblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro("12345", "Java Programming", 2020);
        Revista revista = new Revista("67890", "Tech Today", 2023, 45);
        
        System.out.println(libro);
        System.out.println("¿Prestado?: " + libro.estaPrestado());
        libro.presta();
        System.out.println("¿Prestado?: " + libro.estaPrestado());
        
        System.out.println(revista);
    }
}
    

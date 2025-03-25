package chapter3;

public class Libro {
    private String titulo;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String nuevoTitulo) {
        if (nuevoTitulo != null && !nuevoTitulo.isEmpty()) {
            this.titulo = nuevoTitulo;
        }
    }

    public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.setTitulo("Don Quijote de La Mancha");
        System.out.println("Título del libro: " + miLibro.getTitulo()); // Salida: Título del libro: Don Quijote de La Mancha

        miLibro.setTitulo("");
        System.out.println("Título del libro intentando establecerlo vacío: " + miLibro.getTitulo()); // Salida: Título del libro intentando establecerlo vacío: Don Quijote de La Mancha

        miLibro.setTitulo(null);
        System.out.println("Título del libro intentando establecerlo a null: " + miLibro.getTitulo()); //Título del libro intentando establecerlo a null: Don Quijote de La Mancha
    }
}

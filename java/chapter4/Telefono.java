package chapter4;

public class Telefono {
    private String marca;
    private String modelo;
    private int precio;
    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo);
    }
}
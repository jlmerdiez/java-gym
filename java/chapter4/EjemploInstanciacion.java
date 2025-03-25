package chapter4;

public class EjemploInstanciacion {
    public static void main(String[] args) {
        Telefono miTelefono1 = new Telefono("OnePlus", "Nord 3");  // Se crea una instancia de la clase Telefono
        miTelefono1.mostrarDetalles();  // Se llama al método mostrarDetalles() de la instancia miTelefono1

        Telefono miTelefono2 = new Telefono("Xiaomi", "Mi 11");    // Se crea otra instancia de la clase Telefono
        miTelefono2.mostrarDetalles();  // Se llama al método mostrarDetalles() de la instancia miTelefono2
    }
}

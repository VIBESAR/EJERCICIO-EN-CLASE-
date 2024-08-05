package vehiculos;

public class Moto extends Vehiculo {
    boolean tieneSidecar;

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + tieneSidecar);
    }
}


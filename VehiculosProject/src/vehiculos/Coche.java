package vehiculos;

public class Coche extends Vehiculo {
    int numeroDePuertas;

    public void setMarca(String marca) {
        super.setMarca(marca);
    }


    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}

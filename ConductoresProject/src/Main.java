package conductores;

import vehiculos.Vehiculo.;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Conductor
        Conductor conductor = new Conductor("Juan Pérez", "12345678A");

        // Crear un objeto Vehículo
        Vehiculo miAuto = new Vehiculo("Toyota", "Corolla", 2023);

        // Asignar el vehículo al conductor (Puedes implementar una lógica más compleja si es necesario)
        conductor.setVehiculo(miAuto);

        // El conductor conduce el vehículo
        System.out.println("Juan conduce un " + miAuto.getMarca());
        miAuto.acelerar();
        miAuto.frenar();
        miAuto.mostrarDetalles();

        // Mostrar información del conductor
        conductor.mostrarInformacion();
    }
}


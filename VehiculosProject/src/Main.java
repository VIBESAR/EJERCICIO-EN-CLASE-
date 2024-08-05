import vehiculos.Coche;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.setMarca("Toyota");
        String marcaDelCoche = miCoche.getMarca();
        System.out.println("La marca del coche es: " + marcaDelCoche);
    }
}


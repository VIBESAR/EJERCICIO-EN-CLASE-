package conductores;

public class ConductorDeCoche extends Conductor {
    private int experienciaAnios;

    public ConductorDeCoche(String nombre, String licencia, int experienciaAnios) {
        super(nombre, licencia);
        this.experienciaAnios = experienciaAnios;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Experiencia en años: " + experienciaAnios);
    }
}
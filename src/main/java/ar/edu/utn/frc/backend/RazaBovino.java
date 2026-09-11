package ar.edu.utn.frc.backend;

public enum RazaBovino implements Raza{

    HOLSTEIN("Holstein"),
    HEREFORD("Hereford"),
    ANGUS("Angus");

    private final String nombre;

    RazaBovino(final String aNombre){
        nombre = aNombre;
    }

    @Override
    public String getNombre(){
        return nombre;
    }
}

package ar.edu.utn.frc.backend;

public enum RazaOvino implements Raza{

    MERINO("Merino"),
    CORRIEDALE("Corriedale"),
    TEXEL("Texel");

    private final String nombre;

    RazaOvino(final String aNombre){
        nombre = aNombre;
    }

    @Override
    public String getNombre(){
        return nombre;
    }
}

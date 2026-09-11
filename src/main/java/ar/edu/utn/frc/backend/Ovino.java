package ar.edu.utn.frc.backend;

import java.time.LocalDate;
import java.util.Map;

public class Ovino extends Animal{
    public Ovino(float aPeso, LocalDate aFechaNacimiento, Sexo aSexo, RazaOvino aRaza) {
        super(aPeso, aFechaNacimiento, aSexo, aRaza);
    }

    @Override
    public double calcularConsumoDiario() {
        return 0;
    }

    @Override
    public Map<Alimento, Double> generarPlanDietario() {
        return Map.of();
    }

    @Override
    public double calcularEnergiaTotalDiaria() {
        return 0;
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }

    @Override
    public Especie getEspecie() {
        return Especie.OVINO;
    }

    @Override
    protected double getFactorConsumo() {
        return 1.2d;
    }
}
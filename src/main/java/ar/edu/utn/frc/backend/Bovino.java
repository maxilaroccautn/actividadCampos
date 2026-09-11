package ar.edu.utn.frc.backend;

import java.time.LocalDate;
import java.util.Map;

public class Bovino extends Animal{
    public Bovino(float aPeso, LocalDate aFechaNacimiento, Sexo aSexo, RazaBovino aRaza) {
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
        return Especie.BOVINO;
    }

    @Override
    protected double getFactorConsumo() {
        return 1.5d;
    }
}
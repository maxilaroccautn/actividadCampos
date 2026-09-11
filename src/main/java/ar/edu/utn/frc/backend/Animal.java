package ar.edu.utn.frc.backend;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
public abstract class Animal implements Alimentable, Comparable<Animal> {
    protected float peso;
    private final LocalDate fechaNacimiento;
    private final Sexo sexo;
    private final Raza raza;
    @Setter
    private Dieta dieta;

    public Animal(float aPeso, LocalDate aFechaNacimiento, Sexo aSexo, Raza aRaza) {
        this.peso = aPeso;
        this.fechaNacimiento = aFechaNacimiento;
        this.sexo = aSexo;
        this.raza = aRaza;
    }

    public boolean tieneDieta() {
        return false;
    }

    public abstract Especie getEspecie();

    protected abstract double getFactorConsumo();

    public abstract double calcularConsumoDiario(){

    }
}

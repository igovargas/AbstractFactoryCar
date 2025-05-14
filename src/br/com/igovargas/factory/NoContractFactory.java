package br.com.igovargas.factory;

public class NoContractFactory extends Factory {

    @Override
    Car retriveCar(String requestedGrade) {
        return null;
    }

}

package br.com.igovargas.factory;

import br.com.igovargas.ccars.Corola;
import br.com.igovargas.ccars.Kardian;

public class ContractFactory extends Factory {

    @Override
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Corola(100, "cheio", "azul");
        } else {
            return new Kardian(120, "cheio", "branco");
        }
    }

}

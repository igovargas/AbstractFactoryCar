package br.com.igovargas.factory;

import br.com.igovargas.nccars.Golf;
import br.com.igovargas.nccars.HB20;

public class NoContractFactory extends Factory {
   
    @Override
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Golf(140, "cheio", "preto");
        } else {
            return new HB20(110, "cheio", "cobre");
        }
    }

}

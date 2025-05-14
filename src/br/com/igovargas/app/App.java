package br.com.igovargas.app;

import br.com.igovargas.factory.ContractFactory;
import br.com.igovargas.factory.Customer;
import br.com.igovargas.factory.Factory;
import br.com.igovargas.factory.NoContractFactory;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer("A", false);
        Factory factory = getFactory(customer);
        factory.create(customer.getGradeRequest());
    }

    private static Factory getFactory(Customer customer) {
        if (customer.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return new NoContractFactory();
        }

    }
}

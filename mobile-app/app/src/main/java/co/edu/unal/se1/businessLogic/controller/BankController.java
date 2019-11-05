package co.edu.unal.se1.businessLogic.controller;
import android.content.Context;

import co.edu.unal.se1.dataAccess.model.Bank;
import co.edu.unal.se1.dataAccess.model.Bank;
import co.edu.unal.se1.dataAccess.repository.BankRepository;
import co.edu.unal.se1.dataAccess.model.User;
import co.edu.unal.se1.dataAccess.model.Manager;

public class BankController {

    private BankRepository bankRepository;

    public BankController() {

    }

    public void createBank(Bank bank, Context context) {

        bankRepository = new BankRepository(context);
        bankRepository.createBank(bank);
        System.out.println("Banco creado");
    }


    public void addUser(User user, Context context) {

    }
    public void addManager(Manager manager, Context context) {


    }


}

package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;
import co.edu.unal.se1.dataAccess.model.Account;
import co.edu.unal.se1.dataAccess.repository.AccountRepository;

public class AccountController {
    private AccountRepository accountRepository;

    public AccountController() {

    }

    public void createAccount(Account account, Context context) {

        accountRepository = new AccountRepository(context);
        accountRepository.createAccount(account);
        System.out.println("¡Cuenta creada satisfactoriamente!");
    }
}

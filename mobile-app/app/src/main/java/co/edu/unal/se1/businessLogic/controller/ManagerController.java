package co.edu.unal.se1.businessLogic.controller;
import android.content.Context;

import co.edu.unal.se1.dataAccess.model.Manager;
import co.edu.unal.se1.dataAccess.model.User;
import co.edu.unal.se1.dataAccess.repository.ManagerRepository;
import co.edu.unal.se1.dataAccess.repository.UserRepository;

public class ManagerController {

    private ManagerRepository managerRepository;
    private UserRepository userRepository;

    public ManagerController() {

    }

    public void createManager(Manager manager, Context context) {

        managerRepository = new ManagerRepository(context);
        managerRepository.createManager(manager);
        System.out.println("Created Manager");
    }


}
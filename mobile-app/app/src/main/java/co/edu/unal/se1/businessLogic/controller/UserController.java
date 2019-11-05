package co.edu.unal.se1.businessLogic.controller;

import android.content.Context;

import co.edu.unal.se1.dataAccess.model.User;
import co.edu.unal.se1.dataAccess.repository.UserRepository;

public class UserController {

    private UserRepository userRepository;

    public UserController() {

    }

    public void createUser(User user, Context context) {

        userRepository = new UserRepository(context);
        userRepository.createUser(user);
        System.out.println("¡Usuario creado satisfactoriamente!");
    }

    public boolean sendMoney(int sourceId, int targetId, double value, Context context) {

        userRepository = new UserRepository(context);

        final User sourceUser = userRepository.getUserById(sourceId);
        System.out.println("Source User - ID: " + sourceUser.getId() +
                ", Name: " + sourceUser.getName() +
                ", Email: " + sourceUser.getEmail()+", Balance: " + sourceUser.getBalance());

        if (sourceUser.getBalance() >= value) {

            final User targetUser = userRepository.getUserById(targetId);
            System.out.println("Target User - ID: " + targetUser.getId() +
                    ", Name: " + targetUser.getName() +
                    ", Email: " + targetUser.getEmail()+", Balance: " + targetUser.getBalance());

            sourceUser.setBalance(sourceUser.getBalance()- value);
            targetUser.setBalance(targetUser.getBalance() + value);
            userRepository.updateUser(sourceUser);
            userRepository.updateUser(targetUser);

            final User updatedSourceUser = userRepository.getUserById(sourceId);
            System.out.println("Source User (updated) - ID: " + updatedSourceUser.getId() +
                    ", Name: " + updatedSourceUser.getName() +
                    ", Email: " + updatedSourceUser.getEmail()+", Balance: " + updatedSourceUser.getBalance());

            final User updatedTargetUser = userRepository.getUserById(targetId);
            System.out.println("Target User (updated) - ID: " + updatedTargetUser.getId() +
                    ", Name: " + updatedTargetUser.getName() +
                    ", Email: " + updatedTargetUser.getEmail()+updatedTargetUser.getBalance());

            return true;

        } else {

            return false;
        }

    }













}

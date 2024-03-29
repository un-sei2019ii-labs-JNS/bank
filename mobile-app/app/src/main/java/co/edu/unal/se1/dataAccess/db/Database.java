package co.edu.unal.se1.dataAccess.db;

import androidx.room.RoomDatabase;

import co.edu.unal.se1.dataAccess.dao.AccountDao;
import co.edu.unal.se1.dataAccess.dao.BankDao;
import co.edu.unal.se1.dataAccess.dao.ManagerDao;
import co.edu.unal.se1.dataAccess.dao.TransactionDao;
import co.edu.unal.se1.dataAccess.dao.UserDao;
import co.edu.unal.se1.dataAccess.model.Account;
import co.edu.unal.se1.dataAccess.model.Bank;
import co.edu.unal.se1.dataAccess.model.Manager;
import co.edu.unal.se1.dataAccess.model.Transaction;
import co.edu.unal.se1.dataAccess.model.User;

@androidx.room.Database(entities = {User.class, Transaction.class,Account.class, Manager.class, Bank.class}, version = 1)
public abstract class Database extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract TransactionDao TransactionDao();
    public abstract AccountDao accountDao();
    public abstract ManagerDao ManagerDao();
    public abstract BankDao bankDao();

}

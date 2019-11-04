package co.edu.unal.se1.dataAccess.db;

import androidx.room.RoomDatabase;

import co.edu.unal.se1.dataAccess.dao.TransactionDao;
import co.edu.unal.se1.dataAccess.dao.UserDao;
<<<<<<< HEAD
import co.edu.unal.se1.dataAccess.model.Transaction;
import co.edu.unal.se1.dataAccess.model.User;

@androidx.room.Database(entities = {User.class,Transaction.class}, version = 1)
public abstract class Database extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract TransactionDao TransactionDao();
=======
import co.edu.unal.se1.dataAccess.dao.AccountDao;
import co.edu.unal.se1.dataAccess.model.Account;
import co.edu.unal.se1.dataAccess.model.User;

@androidx.room.Database(entities = {User.class, Account.class}, version = 1)
public abstract class Database extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract AccountDao accountDao();
>>>>>>> 86c4f0ec9b47e9b632e88375ace879136daf9037

}

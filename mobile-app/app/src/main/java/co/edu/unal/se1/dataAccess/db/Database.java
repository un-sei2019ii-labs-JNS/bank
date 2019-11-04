package co.edu.unal.se1.dataAccess.db;

import androidx.room.RoomDatabase;

import co.edu.unal.se1.dataAccess.dao.TransactionDao;
import co.edu.unal.se1.dataAccess.dao.UserDao;
import co.edu.unal.se1.dataAccess.model.Transaction;
import co.edu.unal.se1.dataAccess.model.User;

@androidx.room.Database(entities = {User.class,Transaction.class}, version = 1)
public abstract class Database extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract TransactionDao TransactionDao();

}

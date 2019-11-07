package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Manager;

public class ManagerRepository {

    private String DB_NAME = "se1_db_bank";

    private Database database;
    public ManagerRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<Manager> getAllManagers() {
        return database.ManagerDao().getAllManagers();
    }

    public Manager getManagerById(int id) {
        return database.ManagerDao().getManagerById(id);
    }

    public void createManager(final Manager manager) {
        database.ManagerDao().createManager(manager);
    }

    public void updateManager(Manager manager) {
        database.ManagerDao().updateManager(manager);
    }

    public String getDB_NAME() {
        return DB_NAME;
    }

    public Database getDatabase() {
        return database;
    }

    public void deleteManager(int id) {
        Manager manager = database.ManagerDao().getManagerById(id);
        database.ManagerDao().deleteManager(manager);
    }
}

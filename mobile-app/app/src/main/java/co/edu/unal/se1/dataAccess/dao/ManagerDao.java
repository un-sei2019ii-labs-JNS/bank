package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import co.edu.unal.se1.dataAccess.model.Manager;

@Dao
public interface ManagerDao {
    @Query("SELECT * FROM Manager")
    Manager getManager();

    @Query("SELECT * FROM Account WHERE accountid = :id")
    Manager getAccountById(int id);

    @Insert
    void createAccount(Manager account);

    @Update
    void updateAccount(Manager account);

    @Delete
    void deleteAccount(Manager account);
}

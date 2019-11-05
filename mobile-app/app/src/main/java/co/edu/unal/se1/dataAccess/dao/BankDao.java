package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Bank;
import co.edu.unal.se1.dataAccess.model.User;

@Dao
public interface BankDao {

    @Query("SELECT * FROM Bank")
    Bank getBankInfo();

    @Insert
    void createBank(Bank bank);

    @Update
    void updateBank(Bank bank);

    @Delete
    void deleteBank(Bank bank);

}

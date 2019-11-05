package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Bank;

public class BankRepository {

    private String DB_NAME = "se1_db_bank";

    private Database database;
    public BankRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public Bank getBankInfo() {
        return database.bankDao().getBankInfo();
    }

    public void createBank(final Bank bank) {
        database.bankDao().createBank(bank);
    }

    public void updateBank(Bank bank) {
        database.bankDao().updateBank(bank);
    }

    public void deleteBank (){
        Bank bank = database.bankDao().getBankInfo();
        database.bankDao().deleteBank(bank);
    }
}
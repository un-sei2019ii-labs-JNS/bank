package co.edu.unal.se1.dataAccess.repository;

import android.content.Context;
import androidx.room.Room;
import java.util.List;

import co.edu.unal.se1.dataAccess.db.Database;
import co.edu.unal.se1.dataAccess.model.Transaction;

public class TransactionRepository {

    private String DB_NAME = "se1_db_bank";

    private Database database;
    public TransactionRepository(Context context) {
        database = Room.databaseBuilder(context, Database.class, DB_NAME).
                allowMainThreadQueries().build();
    }

    public List<Transaction> getAllTransactions() {
        return database.TransactionDao().getAllTransactions();
    }

    public Transaction getTransactionById(int id) {
        return database.TransactionDao().getTransactionById(id);
    }

    public void createTransaction(final Transaction transaction) {
        database.TransactionDao().createTransaction(transaction);
    }

    public void updateTransaction(Transaction transaction) {
        database.TransactionDao().updateTransaction(transaction);
    }

    public void deleteTransaction(int id) {
        Transaction transaction = database.TransactionDao().getTransactionById(id);
        database.TransactionDao().deleteTransaction(transaction);
    }
}
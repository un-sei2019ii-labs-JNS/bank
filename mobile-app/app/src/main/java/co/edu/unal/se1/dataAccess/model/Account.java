package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Account implements Serializable{


    @ForeignKey(entity = User.class,parentColumns = "idUser", childColumns = "User id")
    @ColumnInfo(name = "User ID")
    public int userid;

    @ColumnInfo(name = "Amount")
    public double amount;

    @ColumnInfo(name = "Accountid")
    @PrimaryKey
    public int accountid;

    public int getAccountId() {
        return this.accountid;
    }

    public void setAccountId(int accountid) {
        this.accountid = accountid;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getUserAccountId() {
        return this.userid;
    }
}

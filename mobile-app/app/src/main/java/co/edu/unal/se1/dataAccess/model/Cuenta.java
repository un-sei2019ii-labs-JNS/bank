package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Cuenta implements Serializable  {

    public User user;

    @ColumnInfo(name = "User ID")
    public int userid = this.user.id;

    @ColumnInfo(name = "Amount")
    public int Amount;

    @PrimaryKey
    @ColumnInfo(name = "Cuentaid")
    public int cuentaid;

    public int getCuentaId() {
        return this.cuentaid;
    }

    public void setCuentaId(int cuentaid) {
        this.cuentaid = cuentaid;
    }

    public int getAmount() {
        return this.Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getUserCuentaId() {
        return this.user.id;
    }
}

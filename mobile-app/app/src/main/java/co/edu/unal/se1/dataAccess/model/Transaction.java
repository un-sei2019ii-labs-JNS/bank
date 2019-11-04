package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ForeignKey;
import java.io.Serializable;

@Entity
public class Transaction implements Serializable {

    @PrimaryKey
    public int id;

    public double ammount;
    @ForeignKey(entity = User.class,parentColumns = "id" , childColumns = "id_depositor")
    @ColumnInfo(name = "id_depositor")
    public int id_depositor;
    @ForeignKey(entity = User.class,parentColumns = "id" , childColumns = "id_receiver")
    @ColumnInfo(name = "id_receiver")
    public int id_receiver;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public int getId_depositor() {
        return id_depositor;
    }

    public void setId_depositor(int id_depositor) {
        this.id_depositor = id_depositor;
    }

    public int getId_receiver() {
        return id_receiver;
    }

    public void setId_receiver(int id_receiver) {
        this.id_receiver = id_receiver;
    }
}

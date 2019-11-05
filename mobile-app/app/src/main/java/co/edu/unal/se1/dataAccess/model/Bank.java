package co.edu.unal.se1.dataAccess.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import java.util.List;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.List;

@Entity
public class Bank implements Serializable {


    @ColumnInfo(name = "Numero de usuarios ")
    public int Users;
    @PrimaryKey
    @ForeignKey(entity = Manager.class,parentColumns = "id" , childColumns = "Manager")
    @ColumnInfo(name = "Manager")
    public int Manager;


    public Integer getUsers() {
        return Users;
    }

    public void setUsers(Integer users) {
        Users = users;
    }

    public int getManager() {
        return Manager;
    }

    public void setManager(int manager) {
        Manager = manager;
    }
}

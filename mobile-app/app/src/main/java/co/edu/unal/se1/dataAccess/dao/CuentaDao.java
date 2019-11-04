package co.edu.unal.se1.dataAccess.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import co.edu.unal.se1.dataAccess.model.Cuenta;

@Dao
public interface CuentaDao {
    @Query("SELECT * FROM cuenta")
    List<Cuenta> getAllUsers();

    @Query("SELECT * FROM cuenta WHERE cuentaid = :id")
    Cuenta getCuentaById(int id);

    @Insert
    void createCuenta(Cuenta cuenta);

    @Update
    void updateCuenta(Cuenta cuenta);

    @Delete
    void deleteCuenta(Cuenta cuenta);
}

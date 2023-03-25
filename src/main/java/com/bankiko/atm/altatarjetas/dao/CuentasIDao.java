package com.bankiko.atm.altatarjetas.dao;



import com.bankiko.atm.altatarjetas.dto.CuentasDto;

import java.io.IOException;
import java.sql.SQLException;

public interface CuentasIDao {

    CuentasDto conusltaNumTarjeta(Long num_tarjeta) throws SQLException, IOException;


    Object crearCuenta(CuentasDto cuentasDto) throws SQLException, IOException;


    void activarCuenta(Long num_cuenta);


}

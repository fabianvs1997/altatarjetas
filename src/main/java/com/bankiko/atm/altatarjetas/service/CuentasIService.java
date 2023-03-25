package com.bankiko.atm.altatarjetas.service;



import com.bankiko.atm.altatarjetas.model.CuentasResponse;
import com.bankiko.atm.altatarjetas.model.registro.CuentasRequest;
import com.bankiko.atm.altatarjetas.model.registro.RegistroCuentasRequest;

import java.io.IOException;
import java.sql.SQLException;

public interface CuentasIService {

    CuentasResponse consultaTarjeta(Long num_tarjeta, CuentasRequest request) throws SQLException, IOException;        // espera dos parametros, Resquest (modelo de datos)

    CuentasResponse crearCuenta(RegistroCuentasRequest request) throws SQLException, IOException;
    CuentasResponse activaCuenta(Long num_cuenta) throws SQLException, IOException;
}


// SQLException indica lo que pasa en Bd Ioexception conversion de datos
package com.bankiko.atm.altatarjetas.controller;



import com.bankiko.atm.altatarjetas.model.CuentasResponse;
import com.bankiko.atm.altatarjetas.model.registro.CuentasRequest;
import com.bankiko.atm.altatarjetas.model.registro.RegistroCuentasRequest;
import com.bankiko.atm.altatarjetas.service.CuentasIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.SQLException;


@RestController              // creación de API RESTful para manejar solicitudes HTTP y responder con objetos JSON o XML
@RequestMapping("/altaTarjetas")              //para mapear una URL específica
public class CuentasController {


    @Autowired //Crea una instancia de inyeccion de dependencias
    private CuentasIService service;


    /**
     * Crea una nueva cuenta y devuelve una respuesta con información de la cuenta creada y un código de estado HTTP.
     */
    @PostMapping("/crearCuenta")  // Asigana la ruta
    public ResponseEntity<?> crearCuenta(@RequestBody RegistroCuentasRequest request) throws SQLException, IOException { //Metodo que envia dos parametros, uno como body y otro como parametro
        CuentasResponse response = this.service.crearCuenta(request); // Respuesta
        return new ResponseEntity<>(response, HttpStatus.valueOf(response.getCode())); //Esta línea de código crea un nuevo objeto de respuesta HTTP con el cuerpo de respuesta y el código de estado dados, que puede ser enviado de vuelta a un cliente que hace una solicitud HTTP.
    }

    /**
     * Activa una cuenta existente y devuelve una respuesta con información de la cuenta y un código de estado HTTP.
     */
    @GetMapping("/activarCuenta")
    /*METODO GET MAPPING UNICAMENTE RECIBE INFORMACION, ESTA ES RECIBIDA POR URL*/
    /*metodo publico ResponseEntity que permite regresar peticion http Metodo Activar cuenta que recibe parametro cuenta, Tiene las dos excepciones*/
    public ResponseEntity<?> activarCuenta(@RequestParam("cuenta") Long num_cuenta) throws SQLException, IOException {
        /*Declaracion de objeto que tiene un servicio avtivaCuenta*/
        CuentasResponse response = this.service.activaCuenta(num_cuenta);
        /**/
        return new ResponseEntity<>(response.map(), HttpStatus.valueOf(response.getCode()));
    }
}




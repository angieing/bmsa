package com.bmsaProjectManager.bmsa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/angie")
public class test {
    //Esto es una variable que es parte de la clase test

    

   

    //Es un método con petición GET llamado desde la clase controlador
    @RequestMapping(value = "status", method = RequestMethod.GET)
    public String status() {
        System.out.println("Angie me mando a imprimir algo en log de seguimiento.");
		return "OK-saludando a Angie";
	}

}

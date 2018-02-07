package fr.mc.app.controllers;


import java.util.ArrayList;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.mc.app.HomeController;
import fr.mc.app.hibernate.entities.OrdersEntity;
import fr.mc.app.models.Vente;
import fr.mc.app.services.XmlParsingService;


@RequestMapping("/batch")
@RestController
public class BatchDBController {

	private static final Logger masDatabaseLogger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	XmlParsingService xmlParsing;
	
	@CrossOrigin
	@RequestMapping(value = "/getAllOrders", method = RequestMethod.GET)
	private @ResponseBody ArrayList<OrdersEntity> getAllOrders() {
		try {
			
			return  xmlParsing.getOrdersFromXML();
		} catch (Exception e) {
			e.getStackTrace();
			
			return null;
		}
	}
	
	@CrossOrigin
	@RequestMapping(value="/getVentes", method = RequestMethod.GET)
	private @ResponseBody ArrayList<Vente> getVentes(){
		try {
			masDatabaseLogger.info("Accès aux ventes.");
			return xmlParsing.getVentesFromXML();
		} catch (Exception e) {
			
			e.getStackTrace();
			return null;
		}
	}
	
	@RequestMapping("/test")
	private Response test() {
		masDatabaseLogger.info("Accès page de test.");
		return Response.ok("Test réussi.").build();
	}
}

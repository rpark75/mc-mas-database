package fr.mc.app;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController	
public class HomeController {
	
	private static final Logger masDatabaseLogger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Response home() {

		masDatabaseLogger.info("Accès à l'accueil.");
		
		return Response.ok("Accueil de l'API.").build();
	}
	
}

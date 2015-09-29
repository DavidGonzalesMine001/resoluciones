package edu.upeu.resoluciones.web.controlador;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexControlador {

	Logger log = Logger.getLogger(IndexControlador.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mostrarInicio() {

		log.debug("Me llamaron :D");

		return "inicio";
	}

}

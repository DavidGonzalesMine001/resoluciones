package edu.upeu.resoluciones.web.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.upeu.resoluciones.service.DataMainService;
import edu.upeu.resoluciones.web.form.DataMainForm;


@Controller
@RequestMapping(value ="/datamain")
public class DataMainControlador {

	@Autowired
	private DataMainService dataMainService;
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String MostrarTodosDatos(Model model){
		
        List<DataMainForm> listar = dataMainService.listar();
		model.addAttribute("david", listar);
		
		return "datamain/main";
	}
			
	 
	
}

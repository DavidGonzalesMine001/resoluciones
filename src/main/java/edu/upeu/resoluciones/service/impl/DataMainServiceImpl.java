package edu.upeu.resoluciones.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.upeu.resoluciones.dao.DataMainDAO;
import edu.upeu.resoluciones.domain.DataMain;
import edu.upeu.resoluciones.service.DataMainService;
import edu.upeu.resoluciones.web.form.DataMainForm;


@Service
@Transactional (readOnly = true)
public class DataMainServiceImpl implements DataMainService {

	@Autowired
	private DataMainDAO datamainDAO;
	public List<DataMainForm> listar(){
		
		List<DataMainForm> listar =new ArrayList<DataMainForm>();
		List<DataMain> listardata =datamainDAO.getAll(DataMain.class);
		for (DataMain data : listardata) {
			DataMainForm da = new DataMainForm();

			da.setId(data.getId().toString());
			da.setNombre(data.getNombre());
			da.setPaterno(data.getPaterno());
			da.setMaterno(data.getMaterno());
			da.setDni(data.getDni());
			da.setCampo1(data.getCampo1());
			da.setCampo2(data.getCampo2());
			listar.add(da);
		}

		
		return listar;
	}
	
}

package servlet.jsp.service;

import java.util.List;
import servlet.jsp.dao.HospitalDao;
import servlet.jsp.dto.Hospital;

public class HospitalService {
	HospitalDao hd=new HospitalDao();
	public Hospital saveHospital(Hospital hsp) {
		
		return hd.saveHospital(hsp);
	}
	public Hospital updateHospital(Hospital hsp) {
		return hd.updateHospital(hsp);
	}
	public Hospital deleteHospital(int id) {
		return hd.deleteHospital(id);
	}
	public List<Hospital> getAllHospitals(){
		return hd.getAllHospitals();
	}
	public Hospital getHospitalById(int id) {
		return hd.getHospitalById(id);
	}

}

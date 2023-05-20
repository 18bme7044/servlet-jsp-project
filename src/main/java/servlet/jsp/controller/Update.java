package servlet.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.jsp.dto.Hospital;
import servlet.jsp.service.HospitalService;
@WebServlet("/update1")
public class Update extends HttpServlet{
	
	HospitalService hs=new HospitalService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Hospital hsp=new Hospital();
		hsp.setId(Integer.parseInt(req.getParameter("id")));
		hsp.setName(req.getParameter("name"));
		 hsp.setWebsite(req.getParameter("website"));
		 hsp.setContact_no(req.getParameter("number"));
		Hospital hsp2=hs.updateHospital(hsp);
		if(hsp2!=null) {
			RequestDispatcher request=req.getRequestDispatcher("/displayhospital");
			request.forward(req, resp);
		}
		else {
			RequestDispatcher request=req.getRequestDispatcher("Home.jsp");
			request.forward(req, resp);
		}
		
		
		
	}
	

}

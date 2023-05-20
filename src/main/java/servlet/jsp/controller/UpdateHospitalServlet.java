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
@WebServlet("/update")
public class UpdateHospitalServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		HospitalService hs=new HospitalService();
		Hospital hsp=hs.getHospitalById(id);
		req.setAttribute("edit", hsp);
		if(hsp!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("updatehospital.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/displayhospital");
			dispatcher.forward(req, resp);
		
		}
	}
}

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
@WebServlet("/delete")
public class DeleteHospitalServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HospitalService hs=new HospitalService();
		Hospital hsp=hs.deleteHospital(Integer.parseInt(req.getParameter("id")));
		if(hsp!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/displayhospital");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("Home.jsp");
			dispatcher.forward(req, resp);
		}
	}
}

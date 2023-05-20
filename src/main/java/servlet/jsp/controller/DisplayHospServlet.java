package servlet.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.jsp.dto.Hospital;
import servlet.jsp.service.HospitalService;
@WebServlet("/displayhospital")
public class DisplayHospServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 HospitalService hs=new HospitalService();
	 List<Hospital> list=hs.getAllHospitals();
	 if(list.size()>0) {
		 req.setAttribute("addlist", list);
		 RequestDispatcher dispatcher =req.getRequestDispatcher("displayhospital.jsp");
		 dispatcher.forward(req, resp);
	 }
	 else {
		 RequestDispatcher dispatcher =req.getRequestDispatcher("Home.jsp");
		 dispatcher.include(req, resp);
	 }
}
}

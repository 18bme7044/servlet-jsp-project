package servlet.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import servlet.jsp.dto.Hospital;
import servlet.jsp.service.HospitalService;
@WebServlet("/save1")
public class HospitalJsp extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String website=req.getParameter("website");
		String phno=req.getParameter("number");
		
		
		Hospital hsp=new Hospital();
		
		hsp.setName(name);
		hsp.setWebsite(website);
		hsp.setContact_no(phno);
		HospitalService hs=new HospitalService();
		Hospital hsp2=hs.saveHospital(hsp);
		if(hsp2!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("");
			dispatcher.forward(req, resp);
//			System.out.println("data saved");
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("register.jsp");
			dispatcher.forward(req, resp);
//			System.out.println("pls provide data /n thanks");
		
		}
//		String name1=req.getParameter("name");
//		PrintWriter printwriter=resp.getWriter();
//		printwriter.print(name1+" data saved");
		
		
	}
}

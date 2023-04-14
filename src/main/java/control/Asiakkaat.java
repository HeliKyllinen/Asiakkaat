package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import asiakastiedot.Asiakas;
import asiakastiedot.dao.Dao2;


@WebServlet("/asiakkaat/*")
public class Asiakkaat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Asiakkaat() {
    	System.out.println("Asiakkaat.Asiakkaat()");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Asiakkaat.doGet()");
		String hakusana = request.getParameter("hakusana");
		Dao2 dao2 = new Dao2();
		ArrayList<Asiakas> asiakkaat;
		String strJSON ="";
		if(hakusana!=null) {//jos kutsun mukana tuli hakusana
			if(!hakusana.equals("")) {//Jos hakusana ei ole tyhjä
				asiakkaat=dao2.getAllItems(hakusana);//haetaan kaikki hakusanan mukaiset autot
			}else {
				asiakkaat=dao2.getAllItems();//haetaan kaikki autot
			}
			strJSON = new Gson().toJson(asiakkaat);
		}
		response.setContentType("application/json; charset=UTF-8");//määritellään minkä tyyppistä kirjoitetaan
		PrintWriter out = response.getWriter();
		out.println(strJSON);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Asiakkaat.doPost()");
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Asiakkaat.doPut()");
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Asiakkaat.doDelete()");
	}

}

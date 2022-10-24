package dam.dii.unidad01.actividad03;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/actividad03")
public class Actividad03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		if (nombre != null) {
			request.setAttribute("nombre_attr", nombre);
			request.getRequestDispatcher("saludo.jsp").forward(request, response);
		}
	}

}

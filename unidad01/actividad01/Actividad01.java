package dam.dii.unidad01.actividad01;

//Para probar si funciona http://localhost:8080/PrimerProyecto/actividad01?nombre="Gabriel"

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/actividad01")
public class Actividad01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		if (nombre != null) {
			System.out.println("Hola " + request.getParameter("nombre"));
		}
	}

}

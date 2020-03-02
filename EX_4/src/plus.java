

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class plus
 */
@WebServlet("/plus")
public class plus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public plus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		HttpSession session = request.getSession();
		String temp = request.getParameter("box");
		String op = request.getParameter("op");
		int num = 0;
		
		String savetemp = (String)session.getAttribute("final");
		int num2 = Integer.parseInt(savetemp);
		num = Integer.parseInt(temp);
		
		// 0 + t = s 
		// s + t = new s
		// new s + t = new s
		
		String jj = "";
		int total = num+num2;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(op);
		System.out.println((num+op+num2));
		
		switch (op) {
		case "+":
			jj = String.valueOf(num+num2);
			break;
		case "-":
			jj = String.valueOf(num-num2);
			break;
		case "*":
			jj = String.valueOf(num*num2);
			break;
		case "/":
			jj = String.valueOf(num/num2);
			break;
		}
		jj += "<br>";
			
		request.setAttribute("final", jj);
		session.setAttribute("final", jj);
		
		RequestDispatcher m = request.getRequestDispatcher("plus.jsp");
		m.forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

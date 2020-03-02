

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class score
 */
@WebServlet("/score")
public class score extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public score() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Ex01 e = new Ex01();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String name = request.getParameter("name");
		String math = request.getParameter("math");
		String eng = request.getParameter("eng");
		String kor = request.getParameter("kor");
		
		String[] score = {name,kor,eng,math};
		System.out.println(e.count); // 초기 0
		session.setAttribute("name"+e.count, score[0]);
		session.setAttribute("math"+e.count, score[1]);
		session.setAttribute("eng"+e.count, score[2]);
		session.setAttribute("kor"+e.count, score[3]);
		
		
		e.count();
		session.setAttribute("num", e.count);
		System.out.println(session.getAttribute("num"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
		
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
class Ex01 {
	static int count ;
	int num ;
	Ex01(){
		
	}
	void count(){
		count++;	
	}
	void ncount() {
			num++;
		 
	}
}
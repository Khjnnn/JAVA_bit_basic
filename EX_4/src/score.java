

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

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
    public static int score;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
		
		int correct = 0; // 실제 정답
		 
		correct = Integer.valueOf(String.valueOf(session.getAttribute("total")));
		System.out.println("ddddd세션:"+session.getAttribute("total"));
		System.out.println("총합"+correct);
		int pang = 0;
		if(request.getParameter("pang")!=null || request.getParameter("pang") != "") {
		pang = Integer.valueOf((String)request.getParameter("pang")); 
		}//정답 쓴거
		System.out.println("입력값"+pang);
			
		
		if(pang == correct) {
			score += 10;
			System.out.println("정답입니다 +10점 ");
			session.setAttribute("score", score);
			
		} else {
			System.out.println("틀렸습니다 +0점 ");
		}
		System.out.println("세선"+session.getAttribute("score")); 	
		System.out.println(name);
		System.out.println(score);
		
		RequestDispatcher m = request.getRequestDispatcher("games.jsp");
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

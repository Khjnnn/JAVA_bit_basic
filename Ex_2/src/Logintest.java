

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class Logintest
 */
@WebServlet("/login")
public class Logintest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logintest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); //HTML 바디부분 입력함
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String saveid = (String)session.getAttribute("id");
		String save = request.getParameter("saveid");
		System.out.println(save);
		
		
		if(id != "" || saveid != "") {
			session.setAttribute("id", request.getParameter("id"));
			session.setAttribute("pw", request.getParameter("pw"));
			System.out.println("id : "+ id + " pw: "+ pw);
			out.println(id + " 님이 로그인 하셨습니다.");	
			out.println("<form action=\"login\" method=\"post\">");
			out.println("<input type=\"submit\" value=\"뒤로가기\">");
			
			out.println("</form>");
		}else if (id.equals("") || saveid.equals("")|| id == null || saveid == null || id == ""){
			out.println("login fail..");
		}else {
			out.println("login fail..");
		}
	
		
		
		//out.println("아디 : "+"<b>"+id+"</b>" +"<br>");
		//out.println("아디 : "+"<b>"+(String)session.getAttribute("id")+"</b>" +"<br>");
		// out.println("비번 : "+pw );
		
		//append 추가하다 (화면에찍음)
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

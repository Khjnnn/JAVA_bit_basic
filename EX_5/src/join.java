

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class join
 */
@WebServlet("/join")
public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public join() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		test t = new test();
		String newid = request.getParameter("id");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8;pageEncoding=\"UTF-8\"");
		String setid = "";
		if (session.getAttribute("id")!= null) {
			setid = (String)session.getAttribute("id");
			}
		System.out.println("첨"+newid);
		System.out.println(t.id);		
		
		if (setid.equals(newid)) {
			out.println("가입실패 : 중복된 ID 가 있습니다 "); 
			System.out.println("가입실패");
		} else {
		session.setAttribute("id", newid);
		System.out.println("가입성공");
		out.println(newid+"가입 완료");
		}
		
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
class test {
	static String id ;
	static boolean check ;
	
	
	test(){
	}
	
}

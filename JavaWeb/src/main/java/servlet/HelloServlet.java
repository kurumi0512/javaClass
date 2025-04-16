package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//表示瀏覽器可以透過http://localhost:8080/JavaWeb/hello 網址執行到此Servlet程式
//@WebServlet("/hello") //精簡配置寫法
@WebServlet(urlPatterns = "/hello") //標準配置寫法
//@WebServlet(urlPatterns = {"/hello","welcome","hi.php"})
public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("Hello JavaServlet");//將字串回應給瀏覽器
	}
	
	
	

}

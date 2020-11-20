package myServlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//HttpServletインポート
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"r01_servlet"})
public class R01_Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {

			//supper.doGet(req,resp);
			//↑supper.doGetは実行すると必ずエラーになる
			fncServlet(req,resp);
		}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {

			//supper.doGet(req,resp);
			//↑supper.doGetは実行すると必ずエラーになる
			fncServlet(req,resp);
		}



	protected void fncServlet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
			//	サーブレットの処理を書く
			req.setCharacterEncoding("UTF8");

			// デバッグ用出力例
			System.out.println("step-01");

			// サーブレットからjspに遷移
			ServletContext sc = null;
			sc = getServletContext();
			sc.getRequestDispatcher("/jsp/R01_output.jsp").forward(req,resp);
		}

}

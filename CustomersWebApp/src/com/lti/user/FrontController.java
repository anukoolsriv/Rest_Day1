package com.lti.user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.bean.Customer;
import com.lti.services.CustomerService;
import com.lti.services.CustomerServiceImpl;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher requestDispatcher = null;

	public FrontController() {


	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command=(request.getServletPath());
		//		System.out.println(command);
		List<Customer> myList = null;
		String jspName="";
		CustomerService myService=null;

		switch(command)
		{
		case "/GetAllCustomers.do": 
		{
			try{
			myService = new CustomerServiceImpl();						
			myList=myService.getAllCustomers();
//			System.out.println(myList);

			request.setAttribute("myList", myList);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		jspName = "/GetAllCustomerDetails.jsp";							
		break;
		}
			default:
			{
				jspName="/index.jsp";
				break;
			}				
	}
		requestDispatcher=request.getRequestDispatcher(jspName);
		requestDispatcher.forward(request,response);

}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	doGet(request, response);
}

}

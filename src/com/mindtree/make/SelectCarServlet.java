package com.mindtree.make;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectCarServlet
 */
@WebServlet(urlPatterns = { "/SelectCar" })
public class SelectCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SelectCarServlet() {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String carType = request.getParameter("Type");

		BrandSelect brandSelect = new BrandSelect();
		BrandType brandType = BrandType.valueOf(carType);

		List carBrands = brandSelect.getAvailableBrands(brandType);

		request.setAttribute("brands", carBrands);
		RequestDispatcher dispatcher = request.getRequestDispatcher("results.jsp");
		dispatcher.forward(request, response);
	}

}

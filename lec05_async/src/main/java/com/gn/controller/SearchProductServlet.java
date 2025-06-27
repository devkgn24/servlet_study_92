package com.gn.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.gn.dto.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/searchProduct")
public class SearchProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchProductServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"노트북",1200000));
		list.add(new Product(1,"스마트폰",800000));
		list.add(new Product(2,"물티슈",3000));
		list.add(new Product(3,"티셔츠",25000));
		
		int code = Integer.parseInt(request.getParameter("code"));
		JSONArray arr = new JSONArray();
		for(Product p : list) {
			if(code == p.getCode()) {
				JSONObject obj = new JSONObject();
				obj.put("name", p.getName());
				obj.put("price", p.getPrice());
				arr.add(obj);
			}
		}
		
		JSONObject result = new JSONObject();
		result.put("arr", arr);
		
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().print(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

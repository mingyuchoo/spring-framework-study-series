package com.playanetworks.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.playanetworks.springmvc.vo.ProductVO;

@Controller
public class JSONController {
	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSON() {
		ProductVO product = new ProductVO("mgchoo", 5000);
		return product;
	}
}

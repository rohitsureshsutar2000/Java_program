package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Pillion_route_details;
import com.demo.service.ServiceImpl;

@Controller
public class Pillion_routeController {
	@Autowired
	private ServiceImpl serv;
	@GetMapping("/pillionlist")
	public ModelAndView getAll(){
		List<Pillion_route_details> lst=serv.getall();
		return new ModelAndView("msg","lst",lst);
	}
}

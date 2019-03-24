package com.sist.myapp;

import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.controller.Autowired;
import com.sist.controller.Controller;
// index
@Controller
public class BoardProject {
 
   @RequestMapping("/")
   public String disp()
   {
	   return "";
   }
}

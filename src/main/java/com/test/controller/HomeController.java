
package com.test.controller;

/**
 *
 *
 * Created by Kuwu on 7/24/17.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

  @RequestMapping("/")
  public ModelAndView helloWorld() {
    String hi = "Welcome to CG COFFEE";
    return new
        ModelAndView( "welcome", "message",hi);
  }

  @RequestMapping("/register")
  public String register()
  {
    return "register";
  }

  @RequestMapping("/addUser")
  public String addUser(Model model, @RequestParam("c_first") String firstName, @RequestParam("c_last") String lastName,
                        @RequestParam("c_email") String email, @RequestParam("c_tel") String telephone)
  {
    model.addAttribute( "userFirst", firstName );
    model.addAttribute( "userLast", lastName);
    model.addAttribute( "email", email);
    model.addAttribute( "telephone", telephone);
    //model.addAttribute( "password", password);

    return "addUser";
  }

}
package sangamonecourse.com.home;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import sangamonecourse.com.domain.Studentdetails;

@RestController
public class RestControllerHome {
	
	//  Rest controller   return helloworld
		@GetMapping("/")
	    		public String sayHello()
	     		{
			   	return   "Hello World   !!  time on the server  "  +LocalDateTime.now();
	     	}
	
				@GetMapping("/workout")
				public String   getDailyworkout()
				{
					return "  run on the road !!";
				}
				
				@GetMapping("/fortune")
				public String  getFortune()
				{
					 return  "  hello world ";
				}
				
			    
				@RequestMapping(value = "/hello", method = RequestMethod.GET)
				
				public ModelAndView addHello() {

					ModelAndView model = new ModelAndView();
					
					model.setViewName("/helloworld");

					return model;

				}
				
				
              @RequestMapping(value = "/nev", method = RequestMethod.GET)
				
				public ModelAndView addNav() {

					ModelAndView model = new ModelAndView();
					 System.out.println("Navigation Running ");
					model.setViewName("/nav");

					return model;

				}
              
             // @RequestMapping(value = "/studentdeatails" , method  = RequestMethod.GET)
              
              
           //   @Getmapping("/studentdetails")
             // public ModelAndView  addStudent()
              //{
            	//  ModelAndView  model    =  new ModelAndView();
            	  
            	 // model.setViewName("/studentdetails");
            	  
            	//  return model;
            	  
            	  
             // }
              
              @GetMapping("/studentdetails")
              public String greetingForm(Model model) {
                model.addAttribute("studentdetails", new Studentdetails());
                return "/studentdetails";
              }
				
				
				
				
				
				
				
}
		

package gmt.medical.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "Home";
	}

	@RequestMapping(value = "/Product_details", method = RequestMethod.GET)
	public String Product_details() {
		return "Product_details";
	}
	
	@RequestMapping(value = "/Order_list", method = RequestMethod.GET)
	public String Order_list() {
		return "Order_list";
	}
	
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
	
	@RequestMapping(value = "/Categorie", method = RequestMethod.GET)
	public String Categorie() {
		return "Categorie";
	}
	
	@RequestMapping(value = "/Checkout", method = RequestMethod.GET)
	public String Checkout() {
		return "Checkout";
	}
	
}
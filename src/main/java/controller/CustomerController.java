package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/customer")
public class CustomerController {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "thanh"));
        customers.add(new Customer(2, "thanh2"));
        customers.add(new Customer(3, "thanh3"));
    }

    @GetMapping("list")
    public String showListUser(ModelMap modelMap){
        modelMap.addAttribute("list",customers );
        return "list";
    }

    @GetMapping("add")
    public String showFormAddCustomer(){
        return "add";
    }

    @PostMapping("add")
    public ModelAndView addCustomer(@RequestParam Integer id, String name){
        ModelAndView modelAndView=new ModelAndView("list");
       Customer customer =  new Customer(id, name);
       customers.add(customer);
       modelAndView.addObject("list",customers);
       return modelAndView;
    }
}

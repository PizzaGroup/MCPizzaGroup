package springbootmcpizza.mcpizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    OrderRepository orderRepository;

    @RequestMapping("/")
    public String homePage(Model model){
        return "index";
    }

    @RequestMapping("/register")
    public String registerCustomer(Model model){
        model.addAttribute("user", new User());
        return "registerform";
    }


    @RequestMapping("/order")
    public String addOrder(Model model){
        model.addAttribute("order", new Order());
        return "orderform";
    }

    @PostMapping("/order")
    public String processOrder(@Valid @ModelAttribute("order") Order order, BindingResult result){
        if (result.hasErrors()){
            return "orderform";
        }
       orderRepository.save(order);
        return "redirect:/";
    }
    
}

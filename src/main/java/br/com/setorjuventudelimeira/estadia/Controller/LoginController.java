package br.com.setorjuventudelimeira.estadia.Controller;

import br.com.setorjuventudelimeira.estadia.Request.RequestUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@Valid RequestUser user, Model model){
        model.addAttribute("name", user.getUsername());
        return "login";
    }

}

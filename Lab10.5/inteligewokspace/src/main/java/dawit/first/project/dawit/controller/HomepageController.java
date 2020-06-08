package dawit.first.project.dawit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping(value = {"/", "/index", "/home", "/studentmgmnwebapp/home"})
    public String showHomepage() {
        return "home/index";
    }

}

package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.dao.UserDao;
import pl.coderslab.model.User;

@Component
@Controller
@RequestMapping(path = "/user")
public class UserController {

    private UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }


    @RequestMapping(method = RequestMethod.GET)
    public String showAllUsers(Model model){
        model.addAttribute("user", new User());
        return "registerUser";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createUser(@RequestParam String email, @RequestParam String password, Model model){
        User user = new User(email, password);
        model.addAttribute("user", user);
        userDao.saveUser(user);
        return "registerUser";
    }


}

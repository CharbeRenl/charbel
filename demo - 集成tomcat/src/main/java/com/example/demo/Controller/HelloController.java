package com.example.demo.Controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: rc
 * @create: 2019/11/22 17:37
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    /**
     * The User service.
     */
    @Autowired
    UserService userService;

    /**
     * Index string.
     *
     * @return the string
     */
    @RequestMapping("/")
    public String index() {
        return "redirect:/hello/list";
    }

    /**
     * List string.
     *
     * @param model the model
     * @return the string
     */
    @RequestMapping("/list")
    public String list(Model model) {
        List<User> users = userService.selectList(null);
        model.addAttribute("users", users);
        return "user/list";
    }

    /**
     * To add string.
     *
     * @return the string
     */
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "user/userAdd";
    }

    /**
     * Add string.
     *
     * @param user the user
     * @return the string
     */
    @RequestMapping("/add")
    public String add(User user) {
        userService.insert(user);
        return "redirect:/hello/list";
    }

    /**
     * To edit string.
     *
     * @param model the model
     * @param id    the id
     * @return the string
     */
    @RequestMapping("/toEdit")
    public String toEdit(Model model, Long id) {
        User user = userService.selectById(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    /**
     * Edit string.
     *
     * @param user the user
     * @return the string
     */
    @RequestMapping("/edit")
    public String edit(User user) {
        userService.updateById(user);
        return "redirect:/hello/list";
    }

    /**
     * Delete string.
     *
     * @param id the id
     * @return the string
     */
    @RequestMapping("/delete")
    public String delete(Long id) {
        userService.deleteById(id);
        return "redirect:/hello/list";
    }
}

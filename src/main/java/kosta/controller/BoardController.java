package kosta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;

@Controller
public class BoardController {
    @RequestMapping("/board_insert.do")
    public String BoardShow() {

        return "insert_form";
    }
}

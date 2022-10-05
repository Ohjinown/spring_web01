package kosta.controller;

import model.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HttpServletBean;

import javax.validation.Valid;

@Controller
public class BoardController {
    @RequestMapping(value = "/board_insert.do", method = RequestMethod.GET)
//    @GetMapping("/board_insert.do")
    public String board_from(@ModelAttribute("boardCommand") Board board) {
        return "insert_form";
    }

    @RequestMapping(value = "/board_insert.do", method = RequestMethod.POST)
//    @PostMapping("/board_insert.do")
    public String board_insert(@ModelAttribute("boardCommand") @Valid Board board, BindingResult errors) {
        if (errors.hasErrors()){
            System.out.println("에러발생");
            return "insert_form";
        } else {
            System.out.println(board);
            System.out.println("에러발생안함");

        }
        return "insert_form";
    }

}

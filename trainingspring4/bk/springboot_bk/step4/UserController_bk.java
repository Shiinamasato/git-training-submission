package com.example.demo.springboot_bk.step4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ユーザー情報 Controller
 */
//@Controller
public class UserController_bk {

  /**
   * ユーザー情報 Service
   */
  @Autowired
  UserService_bk userService;

  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面のHTML
   */
  @RequestMapping(value = "/user/list", method = RequestMethod.GET)
  public String displayList(Model model) {
    List<User_bk> userlist = userService.searchAll();
    model.addAttribute("userlist", userlist);
    return "user/list";
  }
}
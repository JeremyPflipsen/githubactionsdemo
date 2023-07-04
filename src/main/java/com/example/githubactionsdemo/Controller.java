/* (C)2023 */
package com.example.githubactionsdemo;

import com.example.githubactionsdemo.repository.BookRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired private BookRepositoryImpl bookRepository;

    @GetMapping(value = "getThisMan")
    public DemoModel getThisMan() {
        System.out.println("asdf");
        return new DemoModel();
    }

    @GetMapping("popo")
    public String popo() {
        return "popo";
    }

    @GetMapping("book")
    public Book getBookById(@RequestParam int id) {
        return bookRepository.getBookById(id);
    }
}

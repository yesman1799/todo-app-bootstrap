package cz.itnetwork.todoapp.controller;

import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class todoItemController {
    @Autowired
    private TodoItemService todoItemService;

    @PostMapping("/todo")
    public @ResponseBody TodoItemDTO create(@RequestBody TodoItemDTO todoItemDTO){
        return todoItemService.create(todoItemDTO);
    }

    @GetMapping("/todo")
    public @ResponseBody List<TodoItemDTO> getAll(){
        return todoItemService.getAll();
    }
}

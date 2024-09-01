package cz.itnetwork.todoapp.controller;

import cz.itnetwork.todoapp.dto.CategoryDTO;
import cz.itnetwork.todoapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public @ResponseBody CategoryDTO createCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.create(categoryDTO);
    }
    @GetMapping
    public @ResponseBody List<CategoryDTO> getAll(){
        return categoryService.getAll();
    }
}

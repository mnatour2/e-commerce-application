package com.example.demo.student.Controller;

import com.example.demo.student.Model.Category;
import com.example.demo.student.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }

    @PostMapping()
    public void addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }

}

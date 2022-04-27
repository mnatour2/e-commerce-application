package com.example.demo.student.Controller;

import com.example.demo.student.Model.SubCategory;
import com.example.demo.student.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubCategoryController {

    @Autowired
    public SubCategoryService subCategoryService;

    @GetMapping("/subcat")
    public List<SubCategory> getSubCategories() {
        return subCategoryService.getSubCategories();
    }
    @PostMapping("/addSub")
    public void addSubCategory(@RequestBody SubCategory subCategory) {
        subCategoryService.addSubCategory(subCategory);
    }


}

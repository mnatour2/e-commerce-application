package com.example.demo.student.Service;

import com.example.demo.student.Model.SubCategory;
import com.example.demo.student.Repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    public List<SubCategory> getSubCategories(){
        return subCategoryRepository.findAll();
    }

    public void addSubCategory(SubCategory subCategory) {
        subCategoryRepository.save(subCategory);

    }
}

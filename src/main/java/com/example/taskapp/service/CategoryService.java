package com.example.taskapp.service;

import com.example.taskapp.entity.Category;
import com.example.taskapp.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }
    public Category getCategoryById(long id) {
        return categoryRepo.findById(id);
    }
    public Category findCategoryByName(String name) {
        return categoryRepo.findByName(name);
    }
    @Transactional
    public void deleteCategoryById(Long categoryId) {
        categoryRepo.deleteById(categoryId);
    }
    public void addCategory(Category category) {
        categoryRepo.save(category);
    }
}

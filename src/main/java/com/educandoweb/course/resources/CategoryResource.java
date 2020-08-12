package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService cs;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = cs.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = cs.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

package com.example.demo.controller;

import com.example.demo.dto.FilmCategoryDTO;
import com.example.demo.entity.FilmCategoryId;
import com.example.demo.service.FilmCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("FILM_CATEGORY")
public class FilmCategoryController {

      @Autowired
      private FilmCategoryService filmCategoryService;

      @GetMapping
      public List<FilmCategoryDTO> findAll() {
          return filmCategoryService.findAll();
      }
      @GetMapping("/{id}")
      public List<FilmCategoryDTO> findById(@PathVariable FilmCategoryId id){
          List<FilmCategoryDTO> filmCategory = filmCategoryService.findById(id);
          return filmCategory.isEmpty() ? null : filmCategory;
      }

      @PutMapping("/{id}")
      public FilmCategoryDTO updateById(@PathVariable FilmCategoryId id, @RequestBody FilmCategoryDTO filmCategoryDTO) {
          return filmCategoryService.updateById(id, filmCategoryDTO);
      }

}

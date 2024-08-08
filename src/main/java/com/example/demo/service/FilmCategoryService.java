package com.example.demo.service;

import com.example.demo.dto.FilmCategoryDTO;
import com.example.demo.entity.FilmCategoryId;

import java.util.List;

public interface FilmCategoryService {
List<FilmCategoryDTO> findAll();
List<FilmCategoryDTO> findById(FilmCategoryId id);
FilmCategoryDTO updateById(FilmCategoryId id, FilmCategoryDTO filmCategoryDTO);
}

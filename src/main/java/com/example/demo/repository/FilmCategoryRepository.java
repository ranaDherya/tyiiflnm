package com.example.demo.repository;

import com.example.demo.entity.FilmCategoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.FilmCategory;

public interface FilmCategoryRepository extends JpaRepository<FilmCategory, FilmCategoryId> {
}

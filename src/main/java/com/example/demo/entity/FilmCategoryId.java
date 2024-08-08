package com.example.demo.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FilmCategoryId implements Serializable {
private Film filmId;
private Category categoryId;
public Film getFilmId() {
return this.filmId;
}

public Category getCategoryId() {
return this.categoryId;
}

public void setFilmId (Film filmId) {
this.filmId=filmId;
}

public void setCategoryId (Category categoryId) {
this.categoryId=categoryId;
}

}
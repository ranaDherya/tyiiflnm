package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "FILM_CATEGORY", schema = "test_dbo.dbo")
public class FilmCategory {

      @EmbeddedId
      private FilmCategoryId id;

      @ManyToOne
      @MapsId("filmId")
      @JoinColumn(name="FILM_ID", insertable = false, updatable = false)
      private Film film;

      @ManyToOne
      @MapsId("categoryId")
      @JoinColumn(name="CATEGORY_ID", insertable = false, updatable = false)
      private Category category;

      @Column(name="LAST_UPDATE")
      private String lastUpdate;

      // Getters and setters
      public FilmCategoryId getFilmCategoryId() {
            return id;
      }

      public void setFilmCategoryId(FilmCategoryId id) {
            this.id = id;
      }

      public Film getFilm() {
            return film;
      }

      public void setFilm(Film film) {
            this.film = film;
      }

      public Category getCategory() {
            return category;
      }

      public void setCategory(Category category) {
            this.category = category;
      }

      public String getLastUpdate() {
            return lastUpdate;
      }

      public void setLastUpdate(String lastUpdate) {
            this.lastUpdate = lastUpdate;
      }
}

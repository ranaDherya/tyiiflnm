package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "FILM_ACTOR", schema = "test_dbo.dbo")
public class FilmActor {

      @EmbeddedId
      private FilmActorId id;

      @ManyToOne
      @MapsId("filmId")
      @JoinColumn(name = "FILM_ID", insertable = false, updatable = false)
      private Film film;

      @ManyToOne
      @MapsId("actorId")
      @JoinColumn(name = "ACTOR_ID", insertable = false, updatable = false)
      private Actor actor;

      @Column(name = "LAST_UPDATE")
      private String lastUpdate;

      // Getters and setters
      public FilmActorId getFilmActorId() {
            return id;
      }

      public void setFilmActorId(FilmActorId id) {
            this.id = id;
      }

      public Film getFilm() {
            return film;
      }

      public void setFilm(Film film) {
            this.film = film;
      }

      public Actor getActor() {
            return actor;
      }

      public void setActor(Actor actor) {
            this.actor = actor;
      }

      public String getLastUpdate() {
            return lastUpdate;
      }

      public void setLastUpdate(String lastUpdate) {
            this.lastUpdate = lastUpdate;
      }
}

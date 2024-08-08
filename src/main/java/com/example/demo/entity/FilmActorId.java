package com.example.demo.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FilmActorId implements Serializable {
private Actor actorId;
private Film filmId;
public Actor getActorId() {
return this.actorId;
}

public Film getFilmId() {
return this.filmId;
}

public void setActorId (Actor actorId) {
this.actorId=actorId;
}

public void setFilmId (Film filmId) {
this.filmId=filmId;
}

}
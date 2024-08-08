package com.example.demo.repository;

import com.example.demo.entity.FilmActorId;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.FilmActor;

public interface FilmActorRepository extends JpaRepository<FilmActor, FilmActorId> {
}

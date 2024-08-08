package com.example.demo.service;

import com.example.demo.dto.FilmActorDTO;
import com.example.demo.entity.FilmActorId;

import java.util.List;

public interface FilmActorService {
List<FilmActorDTO> findAll();
List<FilmActorDTO> findById(FilmActorId id);
FilmActorDTO updateById(FilmActorId id, FilmActorDTO filmActorDTO);
}

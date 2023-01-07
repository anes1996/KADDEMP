package com.example.projetetrenprise.repository;

import com.example.projetetrenprise.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepo extends JpaRepository<Projet,Long> {
}

package com.example.projetetrenprise.repository;

import com.example.projetetrenprise.entity.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepo extends JpaRepository<Entreprise,Long> {
}

package com.projet.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projet.crudapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Autres methodes que je vais ajouter
}

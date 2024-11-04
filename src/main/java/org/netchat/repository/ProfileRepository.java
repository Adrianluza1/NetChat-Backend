package org.netchat.repository;

import org.netchat.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ProfileRepository handles CRUD operations and custom queries for Profile entities.
 */
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // Métodos personalizados pueden agregarse aquí si es necesario
}

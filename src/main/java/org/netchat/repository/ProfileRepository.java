package org.netchat.repository;

import org.netchat.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}

package org.netchat.service;

import org.netchat.model.Profile;
import org.netchat.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Optional<Profile> getProfileById(String id) {
        return profileRepository.findById(id);
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public void deleteProfile(String id) {
        profileRepository.deleteById(id);
    }
}

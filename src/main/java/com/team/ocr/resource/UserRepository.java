package com.team.ocr.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource(collectionResourceRel = "users",path="users")
public interface UserRepository extends JpaRepository <Users, Integer> {
}

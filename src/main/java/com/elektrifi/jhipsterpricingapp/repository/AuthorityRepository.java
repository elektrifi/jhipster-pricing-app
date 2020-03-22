package com.elektrifi.jhipsterpricingapp.repository;

import com.elektrifi.jhipsterpricingapp.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}

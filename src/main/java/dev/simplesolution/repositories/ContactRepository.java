package dev.simplesolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.simplesolution.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}

package com.notary.client_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notary.client_management.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    public List<Client> findByClientLastName(String lastName);

}

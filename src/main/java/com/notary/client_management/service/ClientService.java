package com.notary.client_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notary.client_management.model.Client;
import com.notary.client_management.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Retrive all clients
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    // get a client by id
    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public List<Client> getClientsByLastName(String lastName) {
        return clientRepository.findByClientLastName(lastName);
    }
    

    public Client saveClient(Client client) {
        //validate data here
        return clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        //check if client exist
        clientRepository.deleteById(id);
    }
}

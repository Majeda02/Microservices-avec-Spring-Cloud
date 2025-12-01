package com.example.Client.controllers;

import com.example.Client.entities.Client;
import com.example.Client.repositories.ClientRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // Récupérer un client par ID
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found with id: " + id));
    }

    // Récupérer tous les clients
    @GetMapping
    public java.util.List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}

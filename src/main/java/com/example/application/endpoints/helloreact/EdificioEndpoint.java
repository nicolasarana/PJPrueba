package com.example.application.endpoints.helloreact;
import com.example.application.Edificio;
import com.example.application.EdificioRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

import java.util.List;

@Endpoint
@AnonymousAllowed

public class EdificioEndpoint {
    
private EdificioRepository repository;

    EdificioEndpoint(EdificioRepository repository) {
        this.repository = repository;
    }

    public List<Edificio> findAll() {
        return repository.findAll();
    }

    public Edificio add(Integer id) {
        return repository.save(new Edificio(id));
    }

    public Edificio update(Edificio edificio) {
        return repository.save(edificio);
    }

    public Integer delete(Edificio edificio) {
        repository.delete(edificio);
        return edificio.getId();
    }

}

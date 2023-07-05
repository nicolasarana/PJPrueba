package com.example.application.endpoints.helloreact;
import com.example.application.Dependencia;
import com.example.application.DependenciaRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

import java.util.List;


@Endpoint
@AnonymousAllowed

public class DependenciaEndpoint {
    
private DependenciaRepository repository;

    DependenciaEndpoint(DependenciaRepository repository) {
        this.repository = repository;
    }

    public List<Dependencia> findAll() {
        return repository.findAll();
    }

    public Dependencia add(Integer id) {
        return repository.save(new Dependencia(id));
    }

    public Dependencia update(Dependencia dependencia) {
        return repository.save(dependencia);
    }

    public Integer delete(Dependencia dependencia) {
        repository.delete(dependencia);
        return dependencia.getId();
    }


}

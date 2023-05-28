package br.renan.proapi.service;

import br.renan.proapi.model.Person;
import br.renan.proapi.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

// todos os comentários são para fins didáticos

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public Person getById(final UUID personId) {
        return repository.findById(personId)
                .orElseThrow(); // orElseThrow() is a method that throws an exception if the value is not present
    }

}

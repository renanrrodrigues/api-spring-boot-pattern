package br.renan.proapi.controller;

import br.renan.proapi.dto.response.PersonResponse;
import br.renan.proapi.model.Person;
import br.renan.proapi.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("people")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @GetMapping("{personId}")
    private PersonResponse get(@PathVariable UUID personId) {
        final var person = service.getById(personId);

        return PersonResponse.of(person.getId(), person.getName());
    }
}

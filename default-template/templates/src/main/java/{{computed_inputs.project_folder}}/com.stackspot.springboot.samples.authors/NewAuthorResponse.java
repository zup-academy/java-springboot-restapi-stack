package com.stackspot.springboot.samples.authors;

import java.time.LocalDate;
import java.util.UUID;

public class NewAuthorResponse {

    private final UUID id;
    private final String name;
    private final String email;
    private final LocalDate birthdate;

    public NewAuthorResponse(Author author) {
        this.id = author.getId();
        this.name = author.getName();
        this.email = author.getEmail();
        this.birthdate = author.getBirthdate();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "NewAuthorResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}

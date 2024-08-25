package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

import lombok.Data;
import lombok.NonNull;

@Data
public class User {

    Long id;

    String username;

    @NonNull
    String email;

    @NonNull
    String password;

    Instant registrationDate;
}

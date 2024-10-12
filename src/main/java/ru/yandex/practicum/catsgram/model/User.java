package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = { "email" })
public class User {

    private Long id;

    private String username;

    @NonNull
    private String email;

    @NonNull
    private String password;

    private Instant registrationDate;
}

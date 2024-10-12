package ru.yandex.practicum.catsgram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;

@Data
public class UpdateUserRequest {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long id;
    private String username;
    private String password;
    private String email;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Instant registrationDate;

    public boolean hasEmail() {
        return email != null && !email.isEmpty();
    }

    public boolean hasPassword() {
        return password != null && !password.isEmpty();
    }

    public boolean hasUsername() {
        return username != null && !username.isEmpty();
    }
}

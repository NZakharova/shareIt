package ru.yandex.practicum.shareit.user;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder(toBuilder = true)
public class User {
    private final int id;

    @NonNull
    private final String name;

    @NonNull
    private final String email;
}

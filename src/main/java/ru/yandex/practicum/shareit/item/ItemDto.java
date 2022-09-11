package ru.yandex.practicum.shareit.item;

import lombok.Data;
import lombok.NonNull;

@Data
public class ItemDto {
    private final int userId;
    private final int id;
    @NonNull
    private final String name;
    private final String description;

    private final boolean available;
}


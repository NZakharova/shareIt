package ru.yandex.practicum.shareit.item;

import java.util.Optional;

public class ItemMapper {
    private ItemMapper() {
    }

    public static ItemDto toDto(Item item) {
        return ItemDto.builder()
                .id(item.getId())
                .userId(item.getUserId())
                .name(item.getName())
                .description(item.getDescription())
                .available(item.isAvailable())
                .build();
    }

    public static Item toModel(ItemDto item) {
        return Item.builder()
                .id(Optional.ofNullable(item.getId()).orElse(0))
                .userId(item.getUserId())
                .name(item.getName())
                .description(item.getDescription())
                .available(item.getAvailable())
                .build();
    }
}

package ru.yandex.practicum.shareit.user;

public class UserMapper {
    private UserMapper() {
    }

    public static UserDto toDto(User user) {
        return new UserDto(user.getId(), user.getName(), user.getEmail());
    }

    public static User toModel(UserDto user) {
        var id = user.getId();
        if (id == null) {
            id = 0;
        }
        return new User(id, user.getName(), user.getEmail());
    }
}

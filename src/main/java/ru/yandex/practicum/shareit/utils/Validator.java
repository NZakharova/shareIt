package ru.yandex.practicum.shareit.utils;

import org.springframework.stereotype.Service;

@Service
public class Validator {
    public void validateNotEmpty(String str, String name) {
        if (str == null) {
            throw new ValidationException("Строка должна присутсвовать, свойство: " + name);
        }
        if (str.isBlank()) {
            throw new ValidationException("Строка не может быть пустой, свойство: " + name);
        }
    }

    public void validateEmail(String email) {
        validateNotEmpty(email, "email");

        if (!email.contains("@")) {
            throw new ValidationException("Некорректный email");
        }
    }
}

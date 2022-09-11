package ru.yandex.practicum.shareit.user;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.shareit.utils.ValidationException;
import ru.yandex.practicum.shareit.utils.Validator;

@Service
public class UserDtoValidator {
    private final Validator validator;

    public UserDtoValidator(Validator validator) {
        this.validator = validator;
    }

    public void validateForAdd(UserDto dto) {
        validator.validateNotEmpty(dto.getName(), "name");
        validator.validateEmail(dto.getEmail());
    }

    public void validateForUpdate(UserDto dto) {
        int fields = 0;
        if (dto.getName() != null) {
            validator.validateNotEmpty(dto.getName(), "name");
            fields++;
        }

        if (dto.getEmail() != null) {
            validator.validateEmail(dto.getEmail());
            fields++;
        }

        if (fields == 0) {
            throw new ValidationException("Для обновления требуется хотя бы одно поле");
        }
    }
}

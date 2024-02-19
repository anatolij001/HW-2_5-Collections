package ru.sidorovan.hw2.collections.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class EmployeeStorgeIsFullException extends RuntimeException{
    public EmployeeStorgeIsFullException() {
        super("Список сотрудников заполнен.");
    }
}

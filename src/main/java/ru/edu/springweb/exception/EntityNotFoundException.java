package ru.edu.springweb.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Class<?> classEntity, Integer id) {
        super(String.format("Object of class %s with id = %d not found", classEntity.getName(), id));
    }

    public EntityNotFoundException(Class<?> classEntity, String name) {
        super(String.format("Object of class %s with name = %s was not found", classEntity.getName(), name));
    }

    public EntityNotFoundException(Class<?> classEntity) {
        super(String.format("Object of class %s not found", classEntity.getName()));
    }
}

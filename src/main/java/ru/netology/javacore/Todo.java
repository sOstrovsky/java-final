package ru.netology.javacore;

public class Todo {
    private final Type type;
    private final String task;

    public Todo(Type type, String task) {
        this.type = type;
        this.task = task;
    }

    public Type getType() {
        return this.type;
    }

    public String getTask() {
        return this.task;
    }
}

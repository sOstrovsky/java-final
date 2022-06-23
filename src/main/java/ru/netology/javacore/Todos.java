package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    private final Set<String> todos = new TreeSet();

    public void addTask(String task) {
        this.todos.add(task);
    }

    public void removeTask(String task) {
        this.todos.remove(task);
    }

    public Set<String> getTodos() {
        return this.todos;
    }

    public String getAllTasks() {
        StringBuilder sb = new StringBuilder();
        for (String todo : todos) {
            sb.append(todo).append(' ');
        }
        return sb.toString().trim();
    }

}

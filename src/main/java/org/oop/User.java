package org.oop;

import java.util.Objects;

public class User {
    public int id;
    public String username;
    public String password;
    public String email;
    public Role role;

    public User(int id, String username, String password, String email, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public User(String username, String password, String email, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("| %-10d | %-20s | %-30s | %-10s |",
                id, username, email, role.toString());
    }
}

/**
 * Принцип DRY (Don't Repeat Yourself)
 * Проблема: В коде присутствуют два конструктора, один из которых включает id, а другой — нет.
 * Вся логика инициализации почти идентична.
 *
 * Принцип KISS (Keep It Simple, Stupid)
 * Проблема: Метод toString имеет сложную и специфическую логику форматирования строки.
 *
 * Принцип YAGNI (You Aren't Gonna Need It)
 * Проблема: Метод equals проверяет только id, игнорируя остальные поля, что может быть избыточным,
 * если идентификатор является единственным уникальным идентификатором.
*/

package org.oop;

public class Article {
    public Long id;
    public String title;
    public String content;
    public Long authorId;

    // Конструктор по умолчанию
    public Article() {
    }

    // Конструктор с параметрами
    public Article(Long id, String title, String content, Long authorId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Заголовок: " + title + "\nСодержимое: " + content;
    }
}
//1. В текущем коде нет явных повторений, однако, если будут добавлены геттеры и сеттеры для каждого поля,
//следует избегать дублирования логики проверки значений.
//2. Код довольно простой и следует принципу KISS, но можно улучшить его читаемость и безопасность данных,
// сделав поля приватными и добавив геттеры и сеттеры.

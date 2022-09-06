package ru.javalang.item10.sample02.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javalang.item10.sample02.config.ProjectConfig;
import ru.javalang.item10.sample02.model.Comment;
import ru.javalang.item10.sample02.services.CommentService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service = c.getBean(CommentService.class);

    Comment comment = new Comment();
    comment.setText("Demo comment");
    comment.setAuthor("Natasha");
    service.publishComment(comment);
  }
}

package ru.javalang.item10.sample02.services;

import org.springframework.stereotype.Service;
import ru.javalang.item10.sample02.model.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {

  private Logger logger = Logger.getLogger(CommentService.class.getName());

  public void publishComment(Comment comment) {
    logger.info("Publishing comment:" + comment.getText());
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }
}

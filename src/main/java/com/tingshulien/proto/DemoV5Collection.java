package com.tingshulien.proto;

import com.tingshulien.proto.model.v5.Book;
import com.tingshulien.proto.model.v5.Library;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV5Collection {

  public static void main(String[] args) {
    var book1 = Book.newBuilder()
        .setName("Harry Potter 1")
        .setAuthor("JK Rowling")
        .build();

    var book2 = Book.newBuilder()
        .setName("Harry Potter 2")
        .setAuthor("JK Rowling")
        .build();

    var book3 = Book.newBuilder()
        .setName("Harry Potter 3")
        .setAuthor("JK Rowling")
        .build();

    var library = Library.newBuilder()
        .setName("Fantasy Library")
//        .addBooks(book1)
//        .addBooks(book2)
//        .addBooks(book3)
        .addAllBooks(List.of(book1, book2, book3))
        .build();

    log.info("Library: {}", library);
  }

}

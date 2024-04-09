package com.tingshulien.proto;

import com.tingshulien.proto.model.v2.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV2MultipleFiles {

  public static void main(String[] args) {
    var person1 = Person.newBuilder()
        .setName("John Doe")
        .setAge(20)
        .build();
    log.info("Person1: {}", person1);

    var person2 = person1.toBuilder().clearName().build();
    log.info("Person2: {}", person2);

    log.info("Person1 == Person2: {}", person1.equals(person2));      // false
    log.info("Person1 equals Person2: {}", person1.equals(person2));  // true
  }

}

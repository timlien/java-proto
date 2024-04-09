package com.tingshulien.proto;

import com.tingshulien.proto.model.v1.PersonOuterClass.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV1Basic {

  public static void main(String[] args) {
    var person = Person.newBuilder()
        .setName("John Doe")
        .setAge(10)
        .build();
    log.info("Person: {}", person);
  }

}

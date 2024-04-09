package com.tingshulien.proto;

import com.tingshulien.proto.model.v3.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV3Scalar {

  public static void main(String[] args) {
    var person = Person.newBuilder()
        .setName("John Doe")
        .setAge(30)
        .setEmail("john@gmail.com")
        .setEmployed(true)
        .setSalary(1000.0)
        .setBankAccount(123456789012L)
        .setBalance(-1000)
        .build();

    log.info("Person: {}", person);
  }

}

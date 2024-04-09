package com.tingshulien.proto;

import com.tingshulien.proto.model.v4.Address;
import com.tingshulien.proto.model.v4.School;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV4Composition {

  public static void main(String[] args) {
    var address = Address.newBuilder()
        .setStreet("123 Main St")
        .setCity("Springfield")
        .build();

    var school = School.newBuilder()
        .setName("Elementary School")
        .setAddress(address)
        .build();

    log.info("School: {}", school);
  }

}

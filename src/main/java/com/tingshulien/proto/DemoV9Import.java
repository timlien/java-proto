package com.tingshulien.proto;

import com.tingshulien.proto.model.v9.Library;
import com.tingshulien.proto.model.v9.common.Address;
import com.tingshulien.proto.model.v9.common.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV9Import {

  public static void main(String[] args) {
      var address = Address.newBuilder()
          .setStreet("123 Main St")
          .setCity("Springfield")
          .build();

      var person = Person.newBuilder()
          .setName("John Doe")
          .setAge(40)
          .build();

      var library = Library.newBuilder()
          .setName("Springfield Public Library")
          .setAddress(address)
          .setLibrarian(person)
          .build();

      log.info("Library: {}", library);
  }

}

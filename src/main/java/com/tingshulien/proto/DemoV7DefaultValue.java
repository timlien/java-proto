package com.tingshulien.proto;

import com.tingshulien.proto.model.v3.Person;
import com.tingshulien.proto.model.v4.School;
import com.tingshulien.proto.model.v5.Library;
import com.tingshulien.proto.model.v6.Car;
import com.tingshulien.proto.model.v6.Dealer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV7DefaultValue {

  public static void main(String[] args) {
    var person = Person.newBuilder().build();
    log.info("Default int32 value: {}", person.getAge());         // 0
    log.info("Default string value: {}", person.getName());       // ""
    log.info("Default boolean value: {}", person.getEmployed());  // false
    log.info("Default double value: {}", person.getSalary());     // 0.0
    log.info("Default long value: {}", person.getBankAccount());  // 0
    log.info("Equal default instance: {}", person.equals(Person.getDefaultInstance())); // true

    var school = School.newBuilder().build();
    log.info("Default school address: {}", school.getAddress());                        // Address(street:"", city:"")
    log.info("School has address?: {}", school.hasAddress());                           // false
    log.info("Default school address city: {}", school.getAddress().getCity());         // ""
    log.info("Equal default instance: {}", school.equals(School.getDefaultInstance())); // true

    var library = Library.newBuilder().build();
    log.info("Default library books: {}", library.getBooksList()); // []

    var dealer = Dealer.newBuilder().build();
    log.info("Default dealer inventory: {}", dealer.getInventoryMap()); // {}

    var card = Car.newBuilder().build();
    log.info("Default car bodyStyle: {}", card.getBodyStyle()); // UNKNOWN
  }

}

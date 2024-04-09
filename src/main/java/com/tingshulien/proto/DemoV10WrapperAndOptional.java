package com.tingshulien.proto;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import com.tingshulien.proto.model.v10.Person;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV10WrapperAndOptional {

  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.parse("2021-07-01T00:00:00");
    Instant instant = localDateTime.toInstant(ZoneOffset.UTC);
    Timestamp timestamp = Timestamp.newBuilder().setSeconds(instant.getEpochSecond())
        .setNanos(instant.getNano()).build();

    var peron = Person.newBuilder()
        .setName("John Doe")
        .setAge(30)
        .setHeight(Int32Value.newBuilder().setValue(180).build())
        .setBirthday(timestamp)
        .build();

    log.info("Person: {}", peron);
    log.info("Person has age: {}", peron.hasAge());
    log.info("Person has height: {}", peron.hasHeight());
  }

}

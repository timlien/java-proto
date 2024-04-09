package com.tingshulien.proto;

import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV11FormatChange {

  public static void main(String[] args) throws InvalidProtocolBufferException {

    var tv1 = com.tingshulien.proto.model.v11.version1.Television.newBuilder()
        .setBrand("samsung")
        .setYear(2019)
        .build();

    log.info("V1 client staring to parse");
    V1Parser.parse(tv1.toByteArray());
    V2Parser.parse(tv1.toByteArray());
    V3Parser.parse(tv1.toByteArray());

    var tv2 = com.tingshulien.proto.model.v11.version2.Television.newBuilder()
        .setBrand("samsung")
        .setModel(2019)
        .setType(com.tingshulien.proto.model.v11.version2.Type.UHD)
        .build();

    log.info("V2 client staring to parse");
    V1Parser.parse(tv2.toByteArray());
    V2Parser.parse(tv2.toByteArray());
    V3Parser.parse(tv2.toByteArray());

    var tv3 = com.tingshulien.proto.model.v11.version3.Television.newBuilder()
        .setBrand("samsung")
        .setType(com.tingshulien.proto.model.v11.version3.Type.UHD)
        .build();

    log.info("V3 client staring to parse");
    V1Parser.parse(tv3.toByteArray());
    V2Parser.parse(tv3.toByteArray());
    V3Parser.parse(tv3.toByteArray());
  }

  @Slf4j
  private static class V1Parser {

    public static void parse(byte[] bytes) throws InvalidProtocolBufferException {
      var tv = com.tingshulien.proto.model.v11.version1.Television.parseFrom(bytes);
      log.info("Version 1 format parsed");
      log.info("brand: {}", tv.getBrand());
      log.info("year:  {}", tv.getYear());
    }

  }

  @Slf4j
  private static class V2Parser {

    public static void parse(byte[] bytes) throws InvalidProtocolBufferException {
      var tv = com.tingshulien.proto.model.v11.version2.Television.parseFrom(bytes);
      log.info("Version 2 format parsed");
      log.info("brand: {}", tv.getBrand());
      log.info("model:  {}", tv.getModel());
      log.info("type: {}", tv.getType());
    }

  }

  @Slf4j
  private static class V3Parser {

    public static void parse(byte[] bytes) throws InvalidProtocolBufferException {
      var tv = com.tingshulien.proto.model.v11.version3.Television.parseFrom(bytes);
      log.info("Version 3 format parsed");
      log.info("brand: {}", tv.getBrand());
      log.info("type: {}", tv.getType());
    }

  }

}

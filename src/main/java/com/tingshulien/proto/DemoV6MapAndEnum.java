package com.tingshulien.proto;

import com.tingshulien.proto.model.v6.BodyStyle;
import com.tingshulien.proto.model.v6.Car;
import com.tingshulien.proto.model.v6.Dealer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV6MapAndEnum {

  public static void main(String[] args) {
    var car1 = Car.newBuilder()
        .setMake("Toyota")
        .setModel("Camry")
        .setYear(2021)
        .setBodyStyle(BodyStyle.SEDAN)
        .build();

    var car2 = Car.newBuilder()
        .setMake("Honda")
        .setModel("Civic")
        .setYear(2020)
        .setBodyStyle(BodyStyle.SUV)
        .build();

    var dealer = Dealer.newBuilder()
        .putInventory(car1.getYear(), car1)
        .putInventory(car2.getYear(), car2)
        .build();

    log.info("Dealer: {}", dealer);
  }

}

package com.tingshulien.proto;

import com.tingshulien.proto.model.v8.Credential;
import com.tingshulien.proto.model.v8.Email;
import com.tingshulien.proto.model.v8.Phone;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoV8OneOf {

  public static void main(String[] args) {
    var email = Email.newBuilder()
        .setAddress("john@gmail.com")
        .setPassword("123456")
        .build();

    var phone = Phone.newBuilder()
        .setNumber(900123456)
        .setCode(886)
        .build();

    var emailCredential = Credential.newBuilder()
        .setEmail(email)
        .build();

    var phoneCredential = Credential.newBuilder()
        .setPhone(phone)
        .build();

    login(emailCredential);
    login(phoneCredential);

    var overwrittenCredential = Credential.newBuilder()
        .setEmail(email)
        .setPhone(phone)  // This will overwrite the email credential
        .build();

    login(overwrittenCredential);
  }

  private static void login(Credential credential) {
    switch (credential.getLoginTypeCase()) {
      case EMAIL -> log.info("Login with email: {}", credential.getEmail().getAddress());
      case PHONE -> log.info("Login with phone: {}", credential.getPhone().getNumber());
    }
  }

}

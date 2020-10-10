package pl.bolka.aleksander.constuction.builder;

import lombok.Builder;

@Builder
public class User {

  private String name;

  private String lastName;

  private int age;

  private String street;

  private String city;

  private int streetNumber;

}


package com.cybertek.tests.day6_TestNG;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {

    @Test
    public void faker_test(){
     // we need to create obj from the Faker class to be able to use methods
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        System.out.println("Firstname = " + firstName);

        String lastName = faker.name().lastName();
        System.out.println("Lastname = " + lastName);

        String fullName = faker.name().fullName();
        System.out.println("Fullname = " + fullName);

        String address = faker.address().fullAddress();
        System.out.println("Address: " + address);

        String house = faker.gameOfThrones().house();
        System.out.println("House: " + house);

        String quote = faker.gameOfThrones().quote();
        System.out.println("Quote: "+ quote);

        String fact = faker.chuckNorris().fact();
        System.out.println("fact: " + fact);



    }


}

package pirzhan.configReaderPirzhan;

import com.github.javafaker.Faker;

public class MockGeneratorPirzhan {

    private static final Faker faker = new Faker();


    public static String pirzhanGeneratorMockFirstName(){
        return faker.name().firstName();
    }
    public static String pirzhanGeneratorMockLastName(){
        return faker.name().lastName();
    }

    public static String pirzhanGeneratorMockEmail(){
        return faker.internet().emailAddress();
    }

    public static String pirzhanGeneratorMockUserName() {
        return faker.name().username();
    }

    public static String pirzhanGeneratorMockPassword(){
        return faker.internet().password(7,8,true,true)
                .substring(0,1).toUpperCase().substring(1);
    }

    public static String pirzhanGeneratorMockBIO(){
        return faker.internet().macAddress();
    }

    public static String pirzhanGeneratorMockNumber(){
        return String.valueOf(MockGeneratorPirzhan.faker.number().numberBetween(0,10));
    }
}

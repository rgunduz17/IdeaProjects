package Framework;


import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.Test;

import java.util.ArrayList;


public class Test2 {



    public static Logger log= LogManager.getLogger(Test2.class.getName());

    @Test
    public static void getRandomPersons() {

         Faker faker = new Faker();
        ArrayList<String> arrayList = new ArrayList<>();
        log.info("Faker Class created");
        for (int i = 0; i <1; i++) {

             arrayList.add(faker.name().firstName());
             arrayList.add(faker.name().lastName());
             arrayList.add(faker.name().title());
             arrayList.add(faker.name().suffix());
             arrayList.add(faker.address().streetAddress());
             arrayList.add(faker.address().cityName());
             arrayList.add(faker.address().country());
             arrayList.add(faker.address().zipCode());

        }
        log.info("Saving faker info into ArrayList");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            arrayList2.add("FirstName: " + faker.name().firstName());
            arrayList2.add("LastName: " + faker.name().lastName());
            arrayList2.add("Title: " + faker.name().title());
            arrayList2.add("Suffix: " + faker.name().suffix());
            arrayList2.add("Address: " + faker.address().streetAddress());
            arrayList2.add("City: " + faker.address().cityName());
            arrayList2.add("Country: " + faker.address().country());
            arrayList2.add("Zip code: " + faker.address().zipCode());
            arrayList2.add("=======================================");
        }
        System.out.println("========================================");
        log.info("Printing saved fake info");
        for (String s : arrayList2) {
            System.out.println(s);
        }
    }


}

package day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatedTestMultipleTimes {


    //testi tekrarlamak istersek

    @RepeatedTest(5)
    void testSubString(){
        String str="Java is an OOP language";

        assertEquals("Java",str.substring(0,4));
        System.out.println("test calisdi");
    }

    @RepeatedTest(3)
    @Disabled//pasif hale getir
    void testAddExact(){
        assertEquals(5,Math.addExact(2,3));
        System.out.println("test2 calisti");
    }

    //repeated testler, daha cok random bir deger ile test edilirken kullanilir.

    Random random=new Random();
    @RepeatedTest(5)
    void testAddExactRandom(){
        int sayi1= random.nextInt(10);
        int sayi2= random.nextInt(10);

        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));

        System.out.println("addExact icin random test calisti.");
        System.out.println("sayi1: "+sayi1+" sayi2: "+sayi2);
    }

}

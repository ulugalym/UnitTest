package day2;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test05_PerformanceTest {

    //test in cozumu icin yazilan kodun maximum 2 saniye icinde sonuc donmesini
    //aksi halde durdurulmasini isteyebiliriz.

    @Test
    void testPrintPerformance(){
        //1-500000 olan sayilari yazdirma
        assertTimeout(Duration.ofSeconds(2),()->{
            IntStream.rangeClosed(1,500000).forEach(System.out::println);
        });
    }

    @Test
    void testPerformance1(){
        assertTimeout(Duration.ofMillis(20),()->{
            IntStream.rangeClosed(1,50000).reduce((x, y)->Math.addExact(x,y));
        });
    }

}

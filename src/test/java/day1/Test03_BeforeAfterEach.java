package day1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

//testlerin calisma sirasini kendimiz belirlemek istersek @TestMethodOrder annotation
//class seviyesinde kullanilir.


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test03_BeforeAfterEach {

    //bu calss'da test edecegimiz tum methodlarda String objesine ihtiyacimiz

    String str;

    @BeforeEach //asagdaki methodu her bir testten once calistirir
    void beforeEach(){

        str="Junit ile calismak harika";
        System.out.println("----------------beforeEach worked");
    }

    @AfterEach //asagdaki methodu her bir testten sonre calistirir
    void afterEach(){
        str=null;
        System.out.println("-----------------afterEach worked");
    }


    @Test
    @Order(2)
    void testSplit(TestInfo info){

        String[]anlikDizi=str.split(" ");
        String[]beklenenDizi={"Junit","ile","calismak","harika"};

        System.out.println(info.getDisplayName()+" calisdi");
        assertArrayEquals(beklenenDizi,anlikDizi);
    }


    @Test
    @Order(1)
    void testLength(TestInfo info){
        System.out.println(info.getDisplayName()+" calisdi");
        assertEquals(25,str.length());
    }

}

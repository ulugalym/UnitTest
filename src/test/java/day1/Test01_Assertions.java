package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test01_Assertions {
    @Test //bir method'un test method'u oldugunu belirtir ve junit tarafindan calistirilabilir hale gelir.
    public void test(){
        //test method'lerinin erisimi public olmak zorunda(Junit4 ve oncesinde)
        //Junit5 ile birlikde public yazmak zorunda degiliz.

    }

    @Test
    public void testLength(){
        String str="Unit test cok kolay";
        int anlikDeger=str.length();//19
        int beklenenDeger=19;

        assertEquals(beklenenDeger,anlikDeger,"length methodu hatali");
        //aldigi parametrelerin degerlerini karsilastirir
        //eger degerler ayni ise test gecer, aksi halde kalir

        //testin basarisiz olmasi durumunda mesaj yazilabilir.
    }

    //String-->toUpperCase
    @Test
    public void testToUpperCase(){
        String str="unit test cok kolay";
        String anlik=str.toUpperCase();
        String beklenen="UNIT TEST COK KOLAY";
        String beklenmeyen="Unit test cok kolay";

        assertEquals(beklenen,anlik);
        assertNotEquals(beklenmeyen,anlik);
    }

    //Math.addExact
    @Test
    public void testAddExact(){
        int sayi1=15;
        int sayi2=5;
        int anlikDeger=Math.addExact(sayi1,sayi2);
        int beklenenDeger=sayi1+sayi2;
        assertEquals(beklenenDeger,anlikDeger);
    }

    //String-->contains
    @Test
    public void testContains(){
         assertEquals(false,"JAVA".contains("z"));
    }

}

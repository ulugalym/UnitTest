package day1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test04_BeforeAfterAll {

    @BeforeAll//before ve after all methodlari static olmak zorundadir
    static void openFile(){
        System.out.println("open a file");
    }

    @AfterAll
    static void closeFile(){
        System.out.println("close file");
    }

    @Test
    void testSplitWithArrays(TestInfo info){
        String str="Junit ile calismak harika";
        String[]anlikDizi=str.split(" ");
        String[]beklenenDizi={"Junit","ile","calismak","harika"};

        System.out.println(info.getDisplayName()+" calisti.");

        assertArrayEquals(beklenenDizi,anlikDizi);
    }

    @Test
    void testSplitWithArrays2(TestInfo info){
        String str="Junit ile calismak harika";
        String[]anlikDizi=str.split(" ");
        String[]beklenenDizi={"Junit","ile","calismak","harika"};

        System.out.println(info.getDisplayName()+" calisti.");

        assertArrayEquals(beklenenDizi,anlikDizi);
    }

}

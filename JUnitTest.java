package Lessons.Exercise.JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTest {
    @Test
    public void subtractionTest(){
        int result = JUnit.subtraction(25,10);
        assertEquals(15,result,"La sottrazione 25 - 10 deve dare 15.");
    }

    @Test
    public void subtractionTest2(){
        int result = JUnit.subtraction(100,50);
        assertEquals(50,result,"Deve uscire 50.");
    }

    @Test
    public void multiplicationTest(){
        int result= JUnit.multiplication(5,5);
        assertEquals(25,result,"La moltiplicazione deve dare come risultato 25.");
    }

    @Test
    public void multiplicationTest2(){
        int result = JUnit.multiplication(10,5);
        assertEquals(50,result,"Risultato 50");
    }
}
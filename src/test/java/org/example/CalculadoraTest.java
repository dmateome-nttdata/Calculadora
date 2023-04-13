package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora calc;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass()");
    }
    @Before
    public void before(){
        calc =new Calculadora();
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass()");

    }
    @After
    public void after() {
        System.out.println("after()");
                calc.clear();
    }

        @Test
    public void testSum() {

        int resul = calc.add(3, 2);
        int esper = 5;
        assertEquals(esper, resul);
    }

    @Test
    public void testAnsSumC() {
        calc.add(3, 2);
        int resul = calc.ans();
        int esper = 5;
        assertEquals(esper, resul);
    }

    @Test
    public void testDiv(){
        calc.div(5,2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivPorCero(){
        calc.div(5,0);
    }

    @Test(timeout = 3000)
    public void testAlgoritmoOptimo() throws InterruptedException {
       calc.operacionOptima();
    }
}
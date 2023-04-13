package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;


@RunWith(value = Parameterized.class)
public class CalculadoreParametroTest {

    @Parameterized.Parameters
    public static Iterable<Object[]>getData(){
        return Arrays.asList(new Object[][]{{3,3,3},{2,2,2},{1,1,1}});

    }
private int a,b,exp;
public CalculadoreParametroTest(int a,int b, int exp){

    this.a=a;
    this.b=b;
    this.exp=exp;
}

    @Test
    public void testAdd(){
        Calculadora cal=new Calculadora();
        int result=cal.add(a,b);
        assertEquals(exp,result);
    }
}

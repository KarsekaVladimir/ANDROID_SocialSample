package com.sample.social.socialsample;

import android.widget.Button;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.junit.Assert.*;

import static org.junit.Assert.*;

public class SObjectTest {
@Before
    public void Before_Test_Array(){
        System.out.println("Execute before test");
    }
@Test
    public void Test_Array(){
        Main2Activity mass = new Main2Activity();
        assertNotNull(mass.names);
        String[] m={"TheBeatles", "Elvis Presley", "The Rolling Stones", "Chuck Berry", "Jimi Hendrix", "James Brown", "Little Richard", "Aretha Franklin", "Ray Charles", "Bob Marley", "The Beach Boys", "Led Zeppelin"};
        assertArrayEquals(mass.names, m);
        System.out.println("Test_Array complete");
    }
@Test
    public void Test_Array_size(){
        Main2Activity sizeA = new Main2Activity();
        System.out.println("Expectations size of Array" +sizeA.size);
        int s=sizeA.size;
        assertTrue(s==12);
        System.out.println("Test_Array_size complete");
    }
@After
    public void After_Test_Array(){
        System.out.println("Execute after test");
}

}


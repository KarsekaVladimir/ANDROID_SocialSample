package com.sample.social.socialsample;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoTest {
    @Test
    public void createT(){
        Main2Activity call = mock(Main2Activity.class);
        int c = call.ret(12);
        System.out.println("="+c);
        call.ret(c);
        //verify(call,never()).ret(c);
        verify(call, times(1)).ret(c);

    }
}

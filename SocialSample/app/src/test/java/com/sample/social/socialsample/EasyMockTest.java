package com.sample.social.socialsample;

import org.easymock.IExpectationSetters;
import org.junit.Test;
import static org.easymock.EasyMock.*;
public class EasyMockTest {

@Test    public void testSet() {
        Main2Activity mock = createMock(Main2Activity.class);
        NumArray mock1 = createMock(NumArray.class);
        NumArray cl = new NumArray();
        //Main2Activity cl1 = new Main2Activity();
        cl.someFunc(mock1);
        expect(mock1.setNumArray(anyByte(), int n);
        replay();
        cl.setNumArray(5);
        verify();



    }
}

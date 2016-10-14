package com.sample.social.socialsample;

import org.easymock.IExpectationSetters;
import org.junit.Test;
import static org.easymock.EasyMock.*;
public class EasyMockTest {

@Test    public void testSet() {
        MusiclistActivity mock = createMock(MusiclistActivity.class);
        NumArray mock1 = createMock(NumArray.class);
        NumArray cl = new NumArray();
        MusiclistActivity cl1 = new MusiclistActivity();
        //cl.someFunc(mock1);
        //expect(mock1.setNumArray(anyByte(), int n);
        replay();
        cl.setNumArray(5);
        verify();
        }
}

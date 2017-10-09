package com.story.retrofit.core.internal;

import junit.framework.TestCase;

/**
 * Created by tuyoo on 2017/10/9.
 */

public class ObjectsTest extends TestCase {

    public void testNonNull() {
        Objects.nonNull(10, "whatever");
        try {
            Objects.nonNull(null, "fail");
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals("fail", expected.getMessage());
        }
    }
}

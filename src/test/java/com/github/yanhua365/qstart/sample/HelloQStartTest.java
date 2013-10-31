package com.github.yanhua365.qstart.sample;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: yanhua
 * Date: 13-10-31
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */
public class HelloQStartTest {

    HelloQStart start = null;

    @Before
    public void setUp() {
        start  = new HelloQStart();
    }


    @Test
    public void shouldGreetingToUserWithName() {
        String msg = start.greeting("Tom");
        assertThat(msg, is("Hello Tom!"));
    }

}

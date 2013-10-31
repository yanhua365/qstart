package com.github.yanhua365.qstart.sample;

/**
 * Created with IntelliJ IDEA.
 * User: yanhua
 * Date: 13-10-31
 * Time: 下午4:12
 * To change this template use File | Settings | File Templates.
 */
public class HelloQStart {

    public static void main(String[] args) {
        System.out.println(new HelloQStart().greeting("Tom"));
    }

    public String greeting(String userName) {
        return String.format("Hello %s!", userName);
    }
}

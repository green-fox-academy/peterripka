package com.greenfoxacademy.springstart.controllers;


import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    static final AtomicLong ATOMIC_LONG = new AtomicLong( 1 );
    long id;
    String content;
    String name;

    public Greeting(long id, String content) {
        this.id = ATOMIC_LONG.getAndIncrement();
        this.content = content;
    }

    public Greeting(String s) {

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }
}

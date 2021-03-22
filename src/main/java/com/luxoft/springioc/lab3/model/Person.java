package com.luxoft.springioc.lab3.model;

import org.springframework.stereotype.Service;

public interface Person {
    void setName(String name);
    String getName();
    boolean isRegistered();
	void setRegistered(boolean isRegistered);
    void sayHello(Person person);
}
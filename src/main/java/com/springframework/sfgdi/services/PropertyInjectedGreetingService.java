package com.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    @Qualifier("constructorGreetingService")
    public String sayGreeting() {
        return "Hello World - Property";
    }
}

package com.example.demo11;

import com.example.demo11.qualifier.MobileQualifier;



@MobileQualifier
public class Mobile implements Product{
    @Override
    public String getName() {
        return "Mobile name";
    }
}


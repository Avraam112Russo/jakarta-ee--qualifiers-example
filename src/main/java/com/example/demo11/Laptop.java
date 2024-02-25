package com.example.demo11;

import com.example.demo11.qualifier.LaptopQualifier;

@LaptopQualifier
public class Laptop implements Product{

    @Override
    public String getName() {
        return "Laptop name";
    }


}

package com.example;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.params.TestNet3Params;

public class MyClass {

    public void conectarBTC(){
        NetworkParameters networkParameters = MainNetParams.get();
        System.out.println(networkParameters.toString());

    }

    public void conectarFER(){
        org.fermatj.core.NetworkParameters networkParameters = org.fermatj.params.MainNetParams.get();
        System.out.println(networkParameters.toString());

    }
}

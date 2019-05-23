package fr.nathanael2611.tutomod.proxy;

import java.io.File;

public class CommonProxy {

    public void preInitialization(File configFile){
        System.out.println("Le common-side est chargé");
    }

    public void initialization(){

    }

}

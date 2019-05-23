package fr.nathanael2611.tutomod.proxy;

import java.io.File;

public class ClientProxy extends CommonProxy{
    @Override
    public void preInitialization(File configFile) {
        super.preInitialization(configFile);
        System.out.println("Le client-side est chargé.");
    }

    @Override
    public void initialization() {
        super.initialization();
    }
}

package fr.nathanael2611.tutomod.proxy;

import java.io.File;

public class ServerProxy extends CommonProxy{
    @Override
    public void preInitialization(File configFile) {
        super.preInitialization(configFile);
        System.out.println("Le server-side est chargé.");
    }

    @Override
    public void initialization() {
        super.initialization();
    }
}

package org.springframework.boot.loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.loader.archive.Archive;

import java.util.ArrayList;
import java.util.List;

public class ExtendLibLoader {

    private static final Logger log = LoggerFactory.getLogger(ExtendLibLoader.class);

    public static List<Archive> getClassPathArchives(){
        try {
            return PropertiesLauncherHolder.launcher.getClassPathArchives();
        } catch (Exception e) {
            log.warn("get extend lib err:",e);
        }
        return new ArrayList<>();
    }

    static class PropertiesLauncherHolder{
      static  PropertiesLauncher launcher = new PropertiesLauncher();
    }
}

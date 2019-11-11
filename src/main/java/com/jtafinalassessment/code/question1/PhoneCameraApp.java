package com.jtafinalassessment.code.question1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class PhoneCameraApp {
    public String getSharePhotos(SharePhotosType sharePhotosType) {
        return (sharePhotosType.sharePhoto());
    }

    public static String capturePhotos() {
        return ("Capture Photo");

    }

    public static String savePhotos() {

        return ("Save Photo");
    }

    public abstract String editPhotos();
}

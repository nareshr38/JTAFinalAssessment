package com.jtafinalassessment.code.question1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PhoneCameraAppTests {


    private static final Logger logger = LogManager.getLogger(PhoneCameraAppTests.class.getName());

    @Test
    public void allTests() {
        String basicCameraAppShareTextExpectedResult = "Share Photo By Text";
        String basicCameraAppEmailExpectedResult = "Share Photos By Email";
        String basicCameraAppTypeExpectedResult = "Basic Camera Share Photo by Face Book";
        String basicCameraAppEditExpectedResult = "Basic Camera Edit Photo";
        String basicCameraAppSaveExpectedResult = "Save Photo";
        String basicCameraAppCaptureExpectedResult = "Capture Photo";
        String cameraPlusAppShareTextExpectedResult = "Share Photo By Text";
        String cameraPlusAppShareEmailExpectedResult = "Share Photos By Email";
        String cameraPlusAppShareTypeExpectedResult = "Camera Plus Share Photo by Google Drive";
        String cameraPlusAppEditExpectedResult = "Camera Plus Edit Photo";
        String cameraPlusAppSaveExpectedResult = "Save Photo";
        String cameraPlusAppCaptureExpectedResult = "Capture Photo";

        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        String basicCameraAppShareTextActualResult = basicCameraApp.getSharePhotos(new SharePhotosByText());
        String basicCameraAppEmailActualResult = basicCameraApp.getSharePhotos(new SharePhotosByEmail());
        String basicCameraAppTypeActualResult = basicCameraApp.getSharePhotos(new SharePhotosType() {
            @Override
            public String sharePhoto() {
                return ("Basic Camera Share Photo by Face Book");
            }
        });
        String basicCameraAppEditActualResult = basicCameraApp.editPhotos();
        String basicCameraAppSaveActualResult = basicCameraApp.savePhotos();
        String basicCameraAppCaptureActualResult = basicCameraApp.capturePhotos();

        PhoneCameraApp cameraPlusApp = new CameraPlusApp();
        String cameraPlusAppShareTextActualResult = cameraPlusApp.getSharePhotos(new SharePhotosByText());
        String cameraPlusAppShareEmailActualResult = cameraPlusApp.getSharePhotos(new SharePhotosByEmail());
        String cameraPlusAppShareTypeActualResult = cameraPlusApp.getSharePhotos(new SharePhotosType() {
            @Override
            public String sharePhoto() {
                return ("Camera Plus Share Photo by Google Drive");
            }
        });
        String cameraPlusAppEditActualResult = cameraPlusApp.editPhotos();
        String cameraPlusAppSaveActualResult = cameraPlusApp.savePhotos();
        String cameraPlusAppCaptureActualResult = cameraPlusApp.capturePhotos();

        Assert.assertEquals(basicCameraAppShareTextActualResult, basicCameraAppShareTextExpectedResult);
        logger.info("Expected Result of Basic Camera Application Text--> " + basicCameraAppShareTextExpectedResult);
        logger.info("Actual Result  of Basic Camera Application Text -->" + basicCameraAppShareTextActualResult);

        Assert.assertEquals(basicCameraAppEmailActualResult, basicCameraAppEmailExpectedResult);
        logger.info("Expected Result of Basic Camera Application Email--> " + basicCameraAppEmailExpectedResult);
        logger.info("Actual Result of Basic Camera Application Email -->" + basicCameraAppEmailActualResult);

        Assert.assertEquals(basicCameraAppTypeActualResult, basicCameraAppTypeExpectedResult);
        logger.info("Expected Result of Basic Camera Application Text--> " + basicCameraAppTypeExpectedResult);
        logger.info("Actual Result of Basic Camera Application Text-->" + basicCameraAppTypeActualResult);

        Assert.assertEquals(basicCameraAppEditActualResult, basicCameraAppEditExpectedResult);
        logger.info("Expected Result of Basic Camera Edit--> " + basicCameraAppEditExpectedResult);
        logger.info("Actual Result of Basic Camera Edit-->" + basicCameraAppEditActualResult);

        Assert.assertEquals(basicCameraAppSaveActualResult, basicCameraAppSaveExpectedResult);
        logger.info("Expected Result of Basic Camera Save--> " + basicCameraAppSaveExpectedResult);
        logger.info("Actual Result of Basic Camera Save-->" + basicCameraAppSaveActualResult);

        Assert.assertEquals(basicCameraAppCaptureActualResult, basicCameraAppCaptureExpectedResult);
        logger.info("Expected Result of Basic Camera Take Photo--> " + basicCameraAppCaptureExpectedResult);
        logger.info("Actual Result of Basic Camera Take Photo-->" + basicCameraAppCaptureActualResult);

        Assert.assertEquals(cameraPlusAppShareTextActualResult, cameraPlusAppShareTextExpectedResult);
        logger.info("Expected Result of Camera Plus Application Text--> " + cameraPlusAppShareTextExpectedResult);
        logger.info("Actual Result  of Camera Plus Application Text -->" + cameraPlusAppShareTextActualResult);

        Assert.assertEquals(cameraPlusAppShareEmailActualResult, cameraPlusAppShareEmailExpectedResult);
        logger.info("Expected Result of Camera Plus Application Email--> " + cameraPlusAppShareEmailExpectedResult);
        logger.info("Actual Result of Camera Plus Application Email -->" + cameraPlusAppShareEmailActualResult);

        Assert.assertEquals(cameraPlusAppShareTypeActualResult, cameraPlusAppShareTypeExpectedResult);
        logger.info("Expected Result of Camera Plus Application Type--> " + cameraPlusAppShareTypeExpectedResult);
        logger.info("Actual Result of Camera Plus Application Type-->" +cameraPlusAppShareTypeActualResult);

        Assert.assertEquals(cameraPlusAppEditActualResult, cameraPlusAppEditExpectedResult);
        logger.info("Expected Result of Camera Plus Edit--> " + cameraPlusAppEditExpectedResult);
        logger.info("Actual Result of Camera Plus Edit-->" + cameraPlusAppEditActualResult);

        Assert.assertEquals(cameraPlusAppSaveActualResult, cameraPlusAppSaveExpectedResult);
        logger.info("Expected Result of Camera Plus Save--> " + cameraPlusAppSaveExpectedResult);
        logger.info("Actual Result of Camera Plus Save-->" + cameraPlusAppSaveActualResult);

        Assert.assertEquals(cameraPlusAppCaptureActualResult, cameraPlusAppCaptureExpectedResult);
        logger.info("Expected Result of Camera Plus Take Photo--> " + cameraPlusAppCaptureExpectedResult);
        logger.info("Actual Result of Camera Plus Take Photo-->" + cameraPlusAppCaptureActualResult);

    }

}

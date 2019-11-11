package com.jtafinalassessment.code.question4;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinimumRopeCostTests {
    private static final Logger logger = LogManager.getLogger(MinimumRopeCostTests.class.getName());

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{2, 3, 5}, 15},
                {new int []{-5,8,3,4},10}
        };
    }

    @Test(dataProvider = "testData")
    public void allTests(int[] ropes, int expectedResult) {

        int actualResult = MinimumRopeCost.toFindMinimumCost(ropes);
        Assert.assertEquals(actualResult, expectedResult);
        logger.info("Actual result :" + actualResult);
        logger.info("Expected Result :" + expectedResult);


    }
}
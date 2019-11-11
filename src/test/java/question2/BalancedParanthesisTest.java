package com.jtafinalassessment.code.question2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BalancedParanthesisTest {
    private static final Logger logger = LogManager.getLogger(BalancedParanthesisTest.class.getName());

    @DataProvider(name = "testData")
    public Object[][] testData() {

        return new Object[][]
                {
                        {"C:\\Naresh\\input.txt\\", "No", 1642},
                        {"C:\\Naresh\\input2.txt\\", "Yes", 5},
                        {"C:\\Naresh\\input3.txt\\", "Yes", 4},
                        {"C:\\Naresh\\input4.txt\\" ,"Yes", 4},
                        {"C:\\Naresh\\input5.txt\\" , "Yes", 2},
                        {"C:\\Naresh\\input6.txt\\", "No", 1},
                        {"C:\\Naresh\\input7.txt\\", "No", 2},
                        {"C:\\Naresh\\input8.txt\\", "No", 0}


                };
    }

    @Test(dataProvider = "testData")
    public void allTests(String filePath, String expectedResult1, int expectedResult2 ) throws FileNotFoundException {

        FileReader fileReader = new FileReader(filePath );
        Scanner inFile = new Scanner(fileReader);
        String line = inFile.nextLine();
        inFile.close();
        String expression = line;
        char[] stringToCharArray = expression.toCharArray();
        StandardExpression expressionResult = BalancedParanthesis.isBalancedExpression(expression);
        String actualResult1 = expressionResult.getBalanceExpression();
        int actualResult2 = expressionResult.getCounter();
        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);
        logger.info("Expected Result Balanced String--> " + expectedResult1);
        logger.info("Actual Result  Balanced String -->" + actualResult1);
        logger.info("Expected Result Count --> " + expectedResult2);
        logger.info("Actual Result  Count -->" + actualResult2);

    }

}

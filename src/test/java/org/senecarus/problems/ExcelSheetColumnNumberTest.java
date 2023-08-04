package org.senecarus.problems;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnNumberTest {

    @Test
    public void titleToNumber() {
        Assert.assertEquals(701, ExcelSheetColumnNumber.titleToNumber("ZY"));
        Assert.assertEquals(28, ExcelSheetColumnNumber.titleToNumber("AB"));
        Assert.assertEquals(1, ExcelSheetColumnNumber.titleToNumber("A"));



    }
}
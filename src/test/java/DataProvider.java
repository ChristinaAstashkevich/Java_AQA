import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class DataProvider {

    @org.testng.annotations.DataProvider(name = "DPAdd")
    public static Object[][] parseDataForAddMethod() {
        return new Object[][]{
                {15, 15, 30},
                {12, 12, 24},
        };
    }

    @org.testng.annotations.DataProvider(name = "DPDeduct")
    public static Object[][] parseDataForDeductMethod() {
        return new Object[][]{
                {16, 15, 1},
                {48, 6, 42},
        };
    }

    @org.testng.annotations.DataProvider(name = "DPMultiply")
    public static Object[][] parseDataForMultiplyMethod() {
        return new Object[][]{
                {15, 15, 225},
                {48, 6, 288},
        };
    }

    @org.testng.annotations.DataProvider(name = "DPDivide")
    public static Object[][] parseDataForDivideMethod() {
        return new Object[][]{
                {15, 5, 3},
                {48, 6, 8},
        };
    }

    public static Object[][] readFile(File file) throws IOException {

        String text = FileUtils.readFileToString(file);
        String[] row = text.split(";");

        int rowNum = row.length;
        int colNum = row[0].split(",").length;

        Object[][] data = new Integer[rowNum][colNum];

        for (int i = 0; i < rowNum; i++) {
            String[] cols = row[i].split(",");

            for (int j = 0; j < colNum; j++) {
                String string = cols[j].trim();
                data[i][j] = Integer.valueOf(string);
                System.out.println("value is " + data[i][j]);
            }
        }
        return data;
    }


    public static Object[][] tryCatchReadFileException(String pathname) {
        Object[][] returnObjectArray = new Object[4][];
        try {
            File file = new File(pathname);
            returnObjectArray = readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnObjectArray;
    }

    @org.testng.annotations.DataProvider(name = "DPAddTxt")
    public static Object[][] parseDataForAddTxt() {
        //File file = new File("src/test/resources/add.txt");
        //System.out.println(file.getAbsolutePath().toString());
        Object[][] returnObjectArray;
        returnObjectArray = tryCatchReadFileException("src/test/resources/add.txt");
//        try {
//            returnObjectArray = readFile(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return returnObjectArray;
    }

    @org.testng.annotations.DataProvider(name = "DPDeductTxt")
    public static Object[][] parseDataForDeductTxt() {
        File file = new File("src/test/resources/deduct.txt");
        System.out.println(file.getAbsolutePath().toString());
        Object[][] returnObjectArray = new Object[0][];
        try {
            returnObjectArray = readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnObjectArray;
    }

    @org.testng.annotations.DataProvider(name = "DPMultiplyTxt")
    public static Object[][] parseDataForMultiplyTxt() {
        File file = new File("src/test/resources/multiply.txt");
        System.out.println(file.getAbsolutePath().toString());
        Object[][] returnObjectArray = new Object[0][];
        try {
            returnObjectArray = readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnObjectArray;
    }

    @org.testng.annotations.DataProvider(name = "DPDivideTxt")
    public static Object[][] parseDataForDivideTxt() {
        File file = new File("src/test/resources/divide.txt");
        System.out.println(file.getAbsolutePath().toString());
        Object[][] returnObjectArray = new Object[0][];
        try {
            returnObjectArray = readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnObjectArray;
    }
}
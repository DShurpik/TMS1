package codewars.eee;

import org.testng.annotations.DataProvider;

public class DataProviderHelper {

    // Метод для конвертации Enum в двумерный массив Object[][]
    public static <T extends Enum<T>> Object[][] enumToDataProvider(Class<T> enumClass) {
        T[] enumConstants = enumClass.getEnumConstants();
        Object[][] data = new Object[enumConstants.length][1];
        for (int i = 0; i < enumConstants.length; i++) {
            data[i][0] = enumConstants[i];
        }
        return data;
    }

    // Пример использования в TestNG
    @DataProvider(name = "enumDataProvider")
    public static Object[][] enumDataProvider() {
        return enumToDataProvider(SomeEnum.class);
    }
}

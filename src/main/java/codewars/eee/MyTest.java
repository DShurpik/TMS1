package codewars.eee;

import org.testng.annotations.Test;

public class MyTest {

    @Test(dataProvider = "enumDataProvider", dataProviderClass = DataProviderHelper.class)
    public void testWithEnum(SomeEnum enumValue) {
        // Ваш тест, использующий значения Enum
        System.out.println("Enum value: " + enumValue);
        System.out.println("Item value: " + enumValue.getItem());
    }

    @Test
    public void test1() {

    }

}

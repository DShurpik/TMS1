package codewars.level7.fundamentals;

public class CatYearsDogYears {
    public static void main(String[] args) {
        int[] arr = ownedCatAndDog(48, 21 );
        for (Integer i : arr) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        int[] arr1 = ownedCatAndDog(92,6);
        for (Integer i : arr1) {
            System.out.println(i);
        }
    }

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int ownedCat = 0;
        int ownedDog = 0;
        if (catYears < 15) {
            ownedCat = 0;
        } else if (catYears >= 15 & catYears < 24) ownedCat = 1;
        else if (catYears >= 24 & catYears < 28) ownedCat = 2;
        else if (catYears == 28) ownedCat = 3;
        else ownedCat = ((catYears - 28) / 4) + 3;

        if (dogYears < 15) ownedDog = 0;
        else if (dogYears >= 15 & dogYears < 24) ownedDog = 1;
        else if (dogYears >= 24 & dogYears < 29) ownedDog = 2;
        else if (dogYears == 29) ownedDog = 3;
        else ownedDog = ((dogYears - 29) / 5) + 3;
        int[] result = new int[] {ownedCat, ownedDog};
        return result;
    }
}

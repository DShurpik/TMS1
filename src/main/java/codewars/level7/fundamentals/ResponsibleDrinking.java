package codewars.level7.fundamentals;

public class ResponsibleDrinking {
    public static String hydrate(String drinkString) {
        String res = drinkString.replaceAll("[^0-9\\s]", "");
        String[] arr = res.split("[,\\s]+");
        int[] array = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            array[i] = Integer.parseInt(arr[i].trim());
            sum += array[i];
        }
        return sum == 1 ? String.format("%d glass of water", sum) : String.format("%d glasses of water", sum);
    }

    public static void main(String[] args) {
        String result = hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer");
        System.out.println(result); // "10 glasses of water"

        String res = hydrate("2     1");
        System.out.println(res);
    }
}

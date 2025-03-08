package codewars;

public class t4 {
    public static void main(String[] args) {
        System.out.println(g(27, 8, "Hello world"));
    }

    public static String g(int i1, int i2, String name) {
        String s = "";
        System.out.println(name.length() + " Lenght");
        int len = (i1 - name.length()) / 2;
        System.out.println(len);
        for (int i = 0; i < i2; i++) {
            for (int j = 0; j < i1; j++) {
                // первая и последн строка
                if (i == 0 || i == i2 - 1) {
                    s += "#";
                } else if (i == i2 / 2) { // Имя строка
                    if (j == 0 || j == i1 - 1) {
                        s += "#";
                    } else if (j < len) {
                        s += " ";
                    } else if (j < len + name.length()) {
                        s += name.charAt(j - len);
                    } else {
                        s += " ";
                    }
                    // по краям
                } else if (j == 0 || j == i1 - 1) {
                    s += "#";
                } else {
                    s += " ";
                }
            }
            s += "\n";
        }
        return s;
    }
}

package alishev;

public class DoWhile {
    public static void main(String[] args) {
        //t1();
        //t2();
        t3();
    }





        public static void t1() {
            // цикл while работает пока условие true
            int i = 0;
            while (i < 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println("\n" + "================");
        }


        public static void t2() {
            int value = 0;
            // do делается по любому один раз, а потом идут условия while
            do {
                System.out.print(value + " ");
                value++;
            } while (value < 10);
        }

        public static void t3() {
            int limit = 10;
            int start = 0;


            while (start < limit) {
                System.out.println(start);
                start = start + 1;
            }
        }

    }


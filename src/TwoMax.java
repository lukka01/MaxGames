public class TwoMax extends MiniJava {
    public static void main(String[] args) {
        int k = readInt();
        System.out.println("please indicate number: " + k );
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int input = 0;

        if (k < 2) {
            System.out.print("Number > 2 excepted");
        } else {
            for (int i = 0; i < k; i++) {
                input = readInt();
                if (max1 < input) {
                    max2 = max1;
                    max1 = input;
                }

            }
            System.out.println("Maximal values: " + max1 + " " + max2);
        }

    }

}

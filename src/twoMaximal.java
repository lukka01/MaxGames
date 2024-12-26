public class twoMaximal extends MiniJava{
    public static void main(String[] args) {
        int k = readInt();
        System.out.println("Please indicate number: " + k );

        int input = 0;
        int[] count = new int[k];
        int max = count[0];
        int max2 = count[0];
        if (k < 2)
            System.out.println("Error: k>= 2 expected" );
        else {
            for (int i = 0; i < k; i++) {
                input = readInt();
                count[i] = input;
                if (max< count[i]) {
                    max2 = max;
                    max = count[i];
                }

            }
            System.out.println("Maximal values: " + max + " " + max2);
        }

    }



}

public class Max extends MiniJava{
    public static void main(String[] args) {
        int k = readInt();
        System.out.println("Please indicate number: " + k);
        if (k < 0) {
            System.out.print("Number >= 0 expected! ");
        }
        int input = 0;
        int max = 0;
        for (int i = 0; i < k; i ++) {
            input = readInt();
            if (i == 0 ) max = input;
            else if (input > max) {
                max = input;
            }
        }
        System.out.println("MAX: " + max);
    }
}

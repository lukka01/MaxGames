// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends MiniJava{
    public static void main(String[] args) {
        int k = readInt();
        System.out.println("Please indicate number: " + k );

        int input = 0;
        int[] count = new int[k];
        int max = count[0];
        if (k < 1)
            System.out.println("Error: k>= 1 expected" );
        else {
            for (int i = 0; i < k; i++) {
                input = readInt();
                count[i] = input;
                if (max< count[i]) max = count[i];
            }
            System.out.println("Maximal value: " +max);
        }




    }
}
package week13;
public class numbers26 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[7];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];


        System.out.println("Panjang array utama: " + myNumbers.length);
        System.out.println("Panjang baris pertama: " + myNumbers[0].length);
        System.out.println("");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }

    }
}

public class ArrayTest05 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];

        int initVal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = initVal++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]:" + arr[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.println();
        }

    } // end main
}

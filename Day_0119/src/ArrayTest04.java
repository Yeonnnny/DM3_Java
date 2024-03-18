public class ArrayTest04 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5]; // 15개의 변수가 생성
        int count = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = ++count;
            }
        } // end 1st for

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%3d ",arr[i][j]);
            }
            System.out.println();
        }

    }// end main
}

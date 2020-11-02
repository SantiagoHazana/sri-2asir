package clases.Marine;

public class Matrices {
    public static void main(String[] args) {
        int[] num1 = new int[4];
        num1[0] = 5;
        num1[1] = 3;
        num1[2] = 6;
        num1[3] = 2;
        int[] nums = {5, 3, 6, 2};
        System.out.println(nums[2]);
        
        int[][] num2 = new int[4][2];
        num2[0][0] = 5;
        num2[3][1] = 2;
        
        int[][] numNums = {{5, 0}, {3, 9}, {6, 7}};

        for (int i = 0; i < numNums.length; i++) {
            for (int j = 0; j < numNums[i].length; j++) {
                System.out.println(numNums[i][j]);
            }
        }
    }
}

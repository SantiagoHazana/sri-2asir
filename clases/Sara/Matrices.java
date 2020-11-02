package clases.Sara;

public class Matrices {
    public static void main(String[] args) {
        int[] num1 = new int[4]; // inicializa una matriz vacia de 4 posiciones
        // Estoy cargando valores a mi matriz
        num1[0] = 5;
        num1[1] = 3;
        num1[2] = 6;
        num1[3] = 2;

        int[] nums = {5, 3, 6, 2};
        System.out.println(nums[2]);

        int[][] num2 = new int[3][2];

        int[][] numsNums = {{2, 8}, {5, 9}, {4, 3}};
        System.out.println(numsNums.length); // muestra las columnas
        System.out.println(numsNums[0].length); // muestra las filas
    }
}

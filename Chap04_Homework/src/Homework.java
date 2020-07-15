import java.util.Arrays;
import java.util.Collections;

public class Homework {
    //练习1
    public void createAndPrintArray (){
        int[] array = new int[]{10,20,30,40,50};
        System.out.println(Arrays.toString(array));
    }

    //练习2
    public void arrayCopy(){
        String originalString = "neusofteducation";
        char[] array_A = originalString.toCharArray();
        char[] array_B = Arrays.copyOf(array_A, array_A.length);
        System.out.println(array_A);
        System.out.println(array_B);
    }

    //练习3
    public void sortArray1 (){
        int[] array = new int[]{1,6,2,3,9,4,5,7,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    //练习4
    public void twoDimensionalArray (){
        double matrix[][]= new double[5][4];
        //打印矩阵
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //练习5
    public void sortArray2 (){
        Integer[] array = {18,25,7,36,13,2,89,63};
        int maxInt = (int) Collections.max(Arrays.asList(array));
        int targetIndex = 0;
        while (array[targetIndex]!=maxInt){
            targetIndex++;
        }
        System.out.println("数组最大值是："+maxInt);
        System.out.println("下标是: "+targetIndex);
    }
}

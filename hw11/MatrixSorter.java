//Dalyan Kosar
//CSE2 - Section 111
//Homework 11 - Poker Hands
//December 4 - 2014

import java.util.Random;

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   
   public static void show(int[][][] matrix){
       for(int i = 0; i<matrix.length;i++){
           System.out.println("-----------------Slab " +i);
           for(int j = 0; j<matrix[i].length;j++){
               for(int k = 0; k<matrix[i][j].length;k++){
                   System.out.print(matrix[i][j][k] + " ");
               }
               System.out.println();
           }
       }
   }
   
   public static int findMin(int[][][] test){
       int minimum = test[0][0][0];
       
       for(int i = 0; i<test.length;i++){
           for(int j = 0; j<test[i].length;j++){
               for(int k = 0; k<test[i][j].length;k++){
                   if(test[i][j][k]<minimum){
                       minimum = test[i][j][k];
                   }
               }
           }
       }
       
       return minimum;
   }
   
   public static int[][] sort(int[][] temporary){
       int[][] test = temporary;
       int counter;
       
       for(int i = 0; i<test.length;i++){
           test[i] = selectionSort(test[i]);
       }
       
       for(int i = 0; i<test.length; i++){
           int[] number = test[i];
           counter = i;
           while(counter>0 && test[counter][0]<test[counter-1][0]){
               test[counter] = test[counter-1];
               counter--;
           }
           test[counter] = number;
       }
       
       return test;
   }
   
   public static int[] selectionSort(int[] temporary){
       int[] test = temporary;
       int minPlace, temp;
       
       for(int i = 0; i<test.length-1; i++){
           minPlace = i;
           for(int j = i+1; j<test.length; j++){
               if(test[j]<test[minPlace]){
                   minPlace = j;
               }
           }
           if(minPlace!=i){
               temp = test[minPlace];
               test[minPlace] = test[i];
               test[i] = temp;
           }
       }
       
       return test;
   }
   
   public static int[][][] buildMat3d() {
       int[][][]test = new int[3][][];
       
       for(int i = 0; i<3;i++){
           test[i] = new int[3+(i*2)][];
       }
       
       for(int i = 0; i<3;i++){
           for(int j = 0; j<test[i].length;j++){
               test[i][j] = new int[i+j+1];
           }
       }
       
       for(int i = 0; i<test.length;i++){
           for(int j = 0; j<test[i].length;j++){
               for(int k = 0; k<test[i][j].length;k++){
                   test[i][j][k] = randomInt(1,99);
               }
           }
       }
       
       return test;
   }
   
   public static int randomInt(int min, int max) { // generate a random number between the two input ints
      Random rand = new Random();
      int randomNum = rand.nextInt((max - min) + 1) + min;
      return randomNum;
  }
}
//Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class Task1 {

            public static void main(String[] args) {
                int[] myArray = {8, 4, 7, 12, 2, 3, 1, 3, 77, 5};
                System.out.println(Arrays.toString(myArray));
                myArray = mergeSort(myArray);
                System.out.println(Arrays.toString(myArray));
            }


            private static int[] mergeSort(int[] inputArray){
                if (inputArray.length == 1)
                    return inputArray;
                else {
                    int middle = inputArray.length/2;
                    int[] left = new int[middle];
                    int[] right = new int[inputArray.length - middle];

                    for (int i = 0; i < middle; i++) {
                        left[i] = inputArray[i];
                    }
                    for (int i = middle; i < inputArray.length; i++){
                        right[i-middle] = inputArray[i];
                    }

                    return merge(mergeSort(left),mergeSort(right));
                }
            }

            private static int[] merge(int[] left, int[] right){
                int[] merged = new int[left.length+right.length];
                int lengthLeft = left.length;
                int lengthRight = right.length;
                while (lengthLeft > 0 && lengthRight > 0){
                    if (left[left.length - lengthLeft] < right[right.length - lengthRight]){
                        merged[merged.length - lengthLeft - lengthRight] = left[left.length - lengthLeft];
                        lengthLeft--;
                    }else{
                        merged[merged.length - lengthLeft-lengthRight] = right[right.length - lengthRight];
                        lengthRight--;
                    }
                }
                while (lengthLeft > 0){
                    merged[merged.length - lengthLeft] = left[left.length-lengthLeft];
                    lengthLeft--;
                }
                while (lengthRight > 0){
                    merged[merged.length - lengthRight] = right[right.length-lengthRight];
                    lengthRight--;
                }
                return merged;
            }
        }


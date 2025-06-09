package dsa_java;

import java.util.Arrays;

class rmdup {
    public static void main(String[] args) {
        int[] arr={2,3,4,4,5,8,2,3};
        Arrays.sort(arr);
        int i=0;
        for (int j=1;j<8;j++){
            if(arr[i]!=arr[j]){
                i++;
            }
            arr[i]=arr[j];
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, i + 1)));
}
}
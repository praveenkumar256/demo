package adddon_dsa;

import java.util.Arrays;
class getnum {
    public static void main(String[] args) {
        int[] arr={4,5,2,6,9,10};
        int target=8;
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println("["+arr[left]+","+arr[right]+"]");
                break;
            }
            else if (arr[left]+arr[right]<target){
                left++;
            }
            else{
                right--;
            }
            
        
        }
    }

}
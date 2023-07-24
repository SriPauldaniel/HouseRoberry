import java.util.*;
public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findNum(arr, n));
    }

    static int findNum(int[] arr,int n) {
        int odd = 0,even = 0;
        for(int i=0;i<n;i++) {
            if(i%2 == 0) {
                even += arr[i];            
            } else {
                odd += arr[i];
            }
        }
        return Math.max(odd, even);
    }
}
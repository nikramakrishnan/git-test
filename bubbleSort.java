package bubblesort;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements to sort:");
		int n = s.nextInt();
		System.out.println("Please input "+n+" numbers");
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter number "+(i+1)+": ");
			int ntemp = s.nextInt();
			nums[i] = ntemp;
		}
		nums = bubbleSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static int[] bubbleSort(int[] arr){
		for(int i =0;i<arr.length;i++){
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					int temp= arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}

}

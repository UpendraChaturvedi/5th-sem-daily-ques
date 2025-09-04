// Last updated: 9/4/2025, 12:08:29 PM
class Solution {
    public void nextPermutation(int[] nums) {
        next_permutation(nums);
    }
    public static void next_permutation(int[] arr) {
		int p=-1;
		int n=arr.length;
		for (int i = n-2; i >=0; i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		
		if(p==-1) {
			Reverse(arr,0,n-1);
			return;
		}
		
		int q=-1;
		for (int i = n-1; i >p; i--) {
			if(arr[i]>arr[p]) {
				q=i;
				break;
			}
		}
		
		//Swap p & q
		int temp=arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		
		//reverse from p+1 to n-1
		Reverse(arr,p+1,n-1);
		
	}
	public static void Reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}
	}
}
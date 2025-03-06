package new_training;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class demo2 {
	public static void main(String []args) {
		int arr[]= {8,6,4,7,9,12,8,10};
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		int arr2[]= {-1,-1,-1,-1,-1,-1,-1,-1};
		for(int i=0;i<8;i++) {
			while(!stack.empty()&& arr[i]>arr[stack.peek()]) {
				arr2[stack.peek()]=arr[i];
				stack.pop();
			}
			stack.push(i);
		}
		 System.out.println(Arrays.toString(arr2));
	}

}

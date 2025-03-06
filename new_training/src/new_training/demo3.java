package new_training;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=7;
		int unit=2;
		int food=r*unit;
		int arr[]= {15,6,1,7,8,2};
		int sum=0;
		int index=0;
		for(int i=0;i<6;i++) {
			if(sum<food) {
				sum=sum+arr[i];
				index=i;
			}
			else
				break;
		}
		System.out.println(index+1);
		

	}

}

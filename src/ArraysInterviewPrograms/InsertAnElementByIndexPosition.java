package ArraysInterviewPrograms;

public class InsertAnElementByIndexPosition {

	public static void main(String[] args) {
	
		int [] a = {10,20,30,40,50,60,70};
		
		 int index_pos=4;
		 int element=100;
		 
		 for(int i=a.length-1;i>index_pos-1;i--) {
			 
			 a[i]=a[i-1];
		 }
		 
		 a[index_pos-1]=element;
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i] + " ");
		 }
	}

}

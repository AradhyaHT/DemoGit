package ArraysInterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementingivenNum {

	public static void main(String[] args) {
		
		int [] a = {3,5,4,3,2,1,2,5};
		
	
//		 
//		Set sh = new HashSet();
//		
//		for(int num : a) {
//			
//			if(sh.add(num)==false) {
//				System.out.println(" The Duplicate Element is :" + num);
//			}
//		}
		
		 for(int i=0;i<a.length-1;i++) {
			 
			 for(int j=i+1;j<a.length;j++) {
				 
				 if(a[i]==a[j]) {
					 
					 System.out.println(" The Duplicate Element is : " + a[j]);
					
				 }
			 }
			 		
		}
		
		 
	}
		 
		 
	}


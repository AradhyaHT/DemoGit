package ArraysInterviewPrograms;

import java.util.HashSet;

public class Find_FirstDuplicateElement {

	public static void main(String[] args) {
		
		int [] a = {6,5,1,2,4,5};
		
//		 int temp=-1;
//		 
//		 HashSet hs = new HashSet();
//		  
//		  for(int i=0;i<=a.length-1;i++) {
//			  
//			  if(hs.contains(a[i])) {
//				  temp=i;
//			  }
//			  else
//			  {
//				  hs.add(a[i]);
//			  }
//		  }
//             if(temp!=-1) {
//            	 System.out.println(" The First Duplicate Element are : -> " + a[temp]);
//             }
//             else
//             {
//            	 System.out.println(" First Duplicate Element not Found ");
//             }
		
		
		 int temp=0;
		 for(int i=0;i<a.length-1;i++) {
			 
			 for(int j=i+1;j<a.length;j++) {
				 
				 if((a[i]==a[j])&&(i!=j)){
					 
					 temp=temp+1;
					 System.out.println(" First Duplicate Element is " + a[j]);
					  break;
				 }
			 }
			 if(temp>0) {
				 break;
			 }
		 }
	}

}

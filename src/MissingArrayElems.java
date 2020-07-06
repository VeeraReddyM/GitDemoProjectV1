

import java.util.HashMap;

public class MissingArrayElems {


	static int missingElement(int[] a,int n) {

		int sum_Org=(n+1)*(n+2)/2;
		System.out.println(sum_Org);
		int sum_act=0;
		for(int i=0;i<n;i++) {
			sum_act=sum_act+a[i];
		}
		int misElement=sum_Org-sum_act;

		// TODO Auto-generated method stub
		return misElement;
	}

	public static void main(String[] args) {

		int[] a= {1,2,3,5};
		int missingElem=missingElement(a,a.length);
		System.out.println("Missing element->"+missingElem);

	}



}

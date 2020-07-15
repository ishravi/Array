package Hard;

public class medianArray {
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] tmp = new int[(nums1.length + nums2.length)];
        int firstPointer =0;
        int secPointer =0;
        for(int i=0;i<tmp.length;i++){
        	if((firstPointer < nums1.length) && (secPointer < nums2.length)) {
        		if((nums1[firstPointer] < nums2[secPointer]) ) {
            		tmp[i] = nums1[firstPointer];
            		firstPointer++;       			
        		}else {
            		tmp[i] = nums2[secPointer];
            		secPointer++;         			
        		}

        	}else if((secPointer < nums2.length) && (firstPointer >= nums1.length)){
            		tmp[i] = nums2[secPointer];
            		secPointer++;       			

        	}else {
        		tmp[i] = nums1[firstPointer];
        		firstPointer++; 
        	}
        	


        }

        System.out.println("tmp.length "+tmp.length);


        for(int i=0;i<tmp.length;i++) {
        	System.out.println("tmp "+i+" "+tmp[i]);
        }
        if(tmp.length%2==0) {
        	int size = tmp.length/2;
            double median = (tmp[size] + tmp[size-1])/(double)2;
            return median;
        }else {
        	int size = (tmp.length-1)/2;
            double median = tmp[size];
            return median;
        }



        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = new int[] {1,3};
		int[] sec = new int[]	{2};	
		System.out.println(findMedianSortedArrays(first,sec));

	}

}

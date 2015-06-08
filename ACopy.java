class ACopy{
	public static void main(String args[]){
		int i;
		int nums1[] = new int[10];
		int nums2[] = new int[10];
	
		System.out.println("The length of nums1 is " + nums1.length);
		System.out.println("The length of nums2 is " + nums2.length + "\n\n");
		for(i = 0; i < nums1.length; i++)
			nums1[i] = i;
		
		if(nums2.length >= nums1.length)
			for(i = 0; i <nums1.length; i++)
				nums2[i] = nums1[i];
		for(i = 0;i < nums2.length; i++)
			System.out.print(nums2[i] + " ");
	}
}

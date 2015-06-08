class myMeth{
	public static void main(String args[]){
		meth();	
	}
	static void meth(){
		int i;
		for(i = 0;i<10;i++){
			if(i==5) 
				return;
			System.out.println();
		}
	}
}

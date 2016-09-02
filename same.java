class same
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int i=0,j=0;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			if(a[i]==i){
				j++;
				System.out.println(a[i]);
			}
		}
		if(j==0){
			System.out.println("The number in array is not equals to its index value");
		}
	}
}

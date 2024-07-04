package TestHello;

public class Hello {
  public static void main(String[] args) {
//	System.out.println(" this is the main ");
	
	int a[]= {10,20,30,40,50};
	int serachElement =30;
	boolean flag=false;
	
	for(int i=0; i<a.length;i++)
	{
		if(a[i]==serachElement) {
			flag=true;
			System.out.println("Elenmt is presnt");
			break;
		}
		
	}
	if(flag==false)
	{
		System.out.println("Element is not presnt");
	}

}
}

class Pattern10
{
public static void main(String args[])
	{int n=5;
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
        if(i==n/2 || j==n/2 || i==0&&j<2 || j==0 && i>2 || i==n-1 && j>2 || j==n-1 && i<2)
        {
	System.out.print("*"+" ");
	}
	else{
        System.out.print(" "+" ");
        }
        }
        System.out.println();
	}








}


}
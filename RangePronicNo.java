class RangePronicNo
{
public static void main(String args[])
{
	int start=100;
	int end=200;
	for(int i=start;i<=end;i++)
	{
	for(int j=0;j<i-1;j++){
	if(j * (j+1)==i){System.out.println(i);
        break;}
	}
	}







}}
class Palindrome10

{
public static void main(String args[])
{
int num=123;
int rev = 0;
int temp = num;
int ans=0;
ans =num/100;		//1
num%=100 ;		//21
int ans1= num/10;		//2
num%=10;				//1
int c = num;
rev = c*100+ans1*10+ans;


if(temp==rev)
{
System.out.println("its a palindrome no");
}
else
{System.out.println("not");
}

}
}


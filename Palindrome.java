class Palindrome{
public static void main(String args[]){

int n=1231;

int temp=n;
int remainder;
int sum=0;
while(temp>0){
remainder=temp%10;
sum=(sum*10)+remainder;
temp=temp/10;
}

if(n==sum){System.out.println("Its a palindrome no");}
else{System.out.println("It is not a palindrome no");}




}




}

import java.util.Scanner;

public class PlayStoreDriver {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	PlayStore ps=new PlayStore();
	ps.product.add(new App("sandeep",123,23));
	ps.product.add(new App("deep",113,213));
	ps.product.add(new App("jay",123,231));
	ps.product.add(new App("yash",1213,223));
	ps.product.add(new App("saurabh",1213,213));
	ps.product.add(new App("nikhar",1232,213));
	
	System.out.println("welcome to playstore");
	System.out.println("Press 1 for add the app");
	System.out.println("press 2 for delete a app");
	int choice=sc.nextInt();

	switch(choice)
	{
	case 1:
	{
	   ps.InstallApp(sc);	
	   break;
	}
	case 2:
	{
		ps.UnInstallApp(sc);
		break;
	}
	default:
	{
		System.out.println("invalid choice");
	}
	}
	
}
}

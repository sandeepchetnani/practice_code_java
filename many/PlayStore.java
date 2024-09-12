
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayStore {
	App app;
	//ListIterator<App> i=product.listIterator();
	ArrayList<App> product =new ArrayList<>(); 
	 void InstallApp(Scanner sc){
		System.out.println("Enter the details of your app");
		System.out.println("Ener the name of app: ");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the version");
		double version=sc.nextDouble();
		System.out.println("Enter the size");
		int size=sc.nextInt();
		ListIterator<App> i=product.listIterator();
		boolean found=false;
		while(i.hasNext())
		{
			App app = i.next();
			if(app.name.equals(name))
			{
				
				System.out.println("App already exists");
				found=true;
				System.out.println(product);
				break;
				
			}
			
		}
		if(!found)
		{
		i.add(new App(name,version,size));
		System.out.println("App added Successfully");
			System.out.println(product);		
		}
		
	}
	void UnInstallApp(Scanner sc)
	{
		System.out.println("Enter the details of your app");
		System.out.println("Ener the name of app: ");
		sc.nextLine();
		String name=sc.nextLine();
		ListIterator<App> i=product.listIterator();
		boolean found=false;
		while(i.hasNext())
		{
			App app = i.next();
			if(app.name.equals(name))
			{
				
				i.remove();
				System.out.println("App removed successfully");
				for (App app2 : product) {
					System.out.println(app2);	
				}
				
				found=true;
				break;
				
			}
			
		}
		if(!found)
		{
		System.out.println("App is not there");
		
		}
	}
		
		

	
	

}

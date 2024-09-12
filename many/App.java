public class App {
	
	@Override
	public String toString() {
		return "name=" +name+  " version=" + version + " size=" + size+"\n";
	}

	String name;
	double version;
	int size;
	
	void showDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Version: "+version);
		System.out.println("Size:" + size);
	}

	public App(String name, double version, int size) {
		super();
		this.name = name;
		this.version = version;
		this.size = size;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	 

}

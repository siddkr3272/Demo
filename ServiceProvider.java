interface interfaces

{
	public abstract void s1();
	public abstract void s2();

}

abstract class ServiceProvider implements interfaces  //( When no all method call in the class so use "abstract" because this class is not complete)

{
	public void s1()
	{}
	

}

class SubServiceProvider extends ServiceProvider

{
	public void s2()
	{}
	
}


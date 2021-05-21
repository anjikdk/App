
public class SingleTon 
{
	private SingleTon()
	{
		System.out.println("Singleton");
	}

	public static SingleTon p = null;

	public static SingleTon getSingleTon()
	{
		if(p == null)
		{
			synchronized (SingleTon.class) {
				if(p == null)
				{
					p = new SingleTon();
				}
			}
		}
		
		return p;
	}
}

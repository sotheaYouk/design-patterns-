package SingletonPattern;

public class LateInstantiation {
	
	private static LateInstantiation lateinstance;
	
	public LateInstantiation() {}
	
	public static LateInstantiation getInstance()
	{
		if(lateinstance == null)
			return lateinstance = new LateInstantiation();
		return lateinstance;
	}

}


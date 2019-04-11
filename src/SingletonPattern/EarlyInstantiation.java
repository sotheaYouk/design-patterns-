package SingletonPattern;

public class EarlyInstantiation {
	private static EarlyInstantiation earlyinstance = new EarlyInstantiation();
	
	private EarlyInstantiation() {} //default constructor 
	
	public static EarlyInstantiation getInstance()
	{
		return earlyinstance;
	}

}

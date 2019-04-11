package SingletonPattern;

public class Main {
	public static void main(String[] args)
	{
		EarlyInstantiation early = EarlyInstantiation.getInstance();
		EarlyInstantiation early1 = EarlyInstantiation.getInstance();
		
		System.out.println(early);
		System.out.println(early1);
		
		
		LateInstantiation late = LateInstantiation.getInstance();
		LateInstantiation late1 = LateInstantiation.getInstance();
		
		System.out.println(late);
		System.out.println(late1);

}
}

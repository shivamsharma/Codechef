/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
class Family
{
	static void SIBLING(String a)
	{
		if(a=="BILL")
		System.out.println("CATHY FRANK");
		else if(a=="CATHY")
		System.out.println("BILL FRANK");
		else if(a=="FRANK")
		System.out.println("BILL CATHY");
		else if(a=="MATT")
		System.out.println("SALLY");
		else if(a=="SALLY")
		System.out.println("MATT");
		else if(a=="BART")
		System.out.println("MARY JANE");
		else if(a=="MARY")
		System.out.println("JANE BART");
		else if(a=="JANE")
		System.out.println("MARY BART");
	}

	static void PARENT(String a)
	{
		if(a=="BILL")
		System.out.println("ANN MARTY");
		else if(a=="CATHY")
		System.out.println("ANN MARTY");
		else if(a=="FRANK")
		System.out.println("ANN MARTY");
		else if(a=="MATT")
		System.out.println("CATHY DON");
		else if(a=="SALLY")
		System.out.println("CATHY DON");
		else if(a=="SARAH")
		System.out.println("JILL FRANK");
		else if(a=="JILL")
		System.out.println("DEBBIE PHIL");
		else if(a=="BETTY")
		System.out.println("DEBBIE PHIL");
		else if(a=="MARY")
		System.out.println("BETTY PAUL");
		else if(a=="JANE")
		System.out.println("BETTY PAUL");
		else if(a=="BART")
	        	System.out.println("BETTY PAUL");
	}

	static void GRANDCHILD(String a)
	{
		if(a=="ANN")
		System.out.println("MATT SALLY SARAH");
		else if(a=="MARTY")
		System.out.println("MATT SALLY SARAH");
		else if(a=="DEBBIE")
		System.out.println("MARY JANE BART");
		else if(a=="PHILL")
	        	System.out.println("MARY JANE BART");
	}

	static void GRANDPARENT(String a)
	{
		if(a=="MATT")
		System.out.println("ANN MARTY");
		else if(a=="SALLY")
		System.out.println("ANN MARTY");
		else if(a=="SARAH")
	        	System.out.println("ANN MARTY");
		else if(a=="MARY")
		System.out.println("DEBBIE PHILL");
		else if (a=="JANE")
		System.out.println("DEBBIE PHILL");
		else if(a=="BART")
		System.out.println("DEBBIE PHILL");	
	}

	public static void main(String arg[])extends Family
	{
		int i,n;
		String s=System.console().readLine("");
		n=Integer.parseInt(s);
		String relation=System.console().readLine("");
		String name=System.console().readLine("");
		if(relation=="SIBLING")
		SIBLING(name);
		else if(relation=="PARENT")
		PARENT(name);
		else if(relation=="GRANDCHILD")
		GRANDCHILD(name);
		else if(relation=="GRANDPARENT")
		GRANDPARENT(name);
	}
}
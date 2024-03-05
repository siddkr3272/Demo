interface RBI
{
int ROI();

}

class BOI implements RBI
{
public int ROI()
	{
	return 7;
	}
}

class CBI implements RBI
{
public int ROI()

	{
	return 8;
	}
}

class Customer
{
public static void main(String[]args)
	{
	BOI b=new BOI();
	System.out.println(b.ROI());

	CBI c=new CBI();
	System.out.println(c.ROI());

	RBI r=new CBI();
	System.out.println(r.ROI());
	}
}
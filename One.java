interface InterfNumber

{
void number1();
void number2();
}

class One implements InterfNumber
{
public void number1()
	{
	System.out.println("Hello i am Interface Number1");
	}


public void number2()

	{
	System.out.println("Hello i Interface Number2");
	}

public static void main(String[]args)

	{
	One o=new One();
	o.number1();
	o.number2();	
	}
}
package methosAndObjects;

class Fan
{
	public int cost;           //instance variables 
	
	public String brand;
	
	void disp()
	{
		System.out.println(cost);
	}
	void disp1(int a)
	{
		System.out.println(a);
	}
	int disp2()
	{
		int c=5;   // local variables 
		System.out.println("In disp2 testing");
		return c;
	}
	int disp3(int k)//methods
	{
		int k1=10;
		System.out.println("in disp3");
		return k1;
	}
	
}


public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Fan f =new Fan();           // object creation
		f.brand ="Usha";
		f.cost=20000;
		f.disp();
		f.disp1(0);
		int l=f.disp2();
		int m=f.disp3(l);
	}

}

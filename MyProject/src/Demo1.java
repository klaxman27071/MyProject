
public class Demo1 {

	public static void main(String[] args) {
		int a=20,B=20;
		int c=0;
		c=a+B;
		System.out.println("Value of A and B is: "+a+" "+B);		
		System.out.println("Result of addition is: "+c);
		System.out.println("Completed...");
		AddDemo ad=new AddDemo();
		SubstrationDemo sd=new SubstrationDemo();
		ad.add(20, 50);
		ad.addThreenum(20, 50,50);
		sd.sub(40, 20);
		sd.subThree(70, 20, 30);
		sd.subThree1(70, 20, 30);

	}

}

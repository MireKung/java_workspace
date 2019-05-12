public class Test {
	public static void main (String[]args){
		Robot robot1 = new Robot();
		Robot robot2 = new Robot(5,"No.2");
		Robot robot3 = new Robot(10,"No.3",'C');
		robot1.setID(3);
		robot1.setName("No.1");
		robot1.setVersion('A');
		System.out.println("robot1 ID is : "+robot1.getID());
		System.out.println("robot1 Name is : "+robot1.getName());
		System.out.println("robot1 Version is : "+robot1.getVersion());
		System.out.println("robot1 is moveing forward "+robot1.goForwardN(5)+" step \nthen go backward "+
		robot1.goBackwardN(0)+" step \nthen go left "+robot1.goLeftN(0)+" step \nthen go right "+robot1.goRightN(0)+" step");
		System.out.println("*******************************************");
		robot2.setVersion('B');
		System.out.println("robot2 ID is : "+robot2.getID());
		System.out.println("robot2 Name is : "+robot2.getName());
		System.out.println("robot2 Version is : "+robot2.getVersion());
		System.out.println("robot2 is moveing forward "+robot2.goForwardN(0)+" step \nthen go backward "+
		robot2.goBackwardN(3)+" step \nthen go left "+robot2.goLeftN(10)+" step \nthen go right "+robot2.goRightN(0)+" step");
		System.out.println("*******************************************");
		System.out.println("robot3 ID is : "+robot3.getID());
		System.out.println("robot3 Name is : "+robot3.getName());
		System.out.println("robot3 Version is : "+robot3.getVersion());
		System.out.println("robot3 is moveing forward "+robot3.goForwardN(0)+" step \nthen go backward "+
		robot3.goBackwardN(0)+" step \nthen go left "+robot3.goLeftN(0)+" step \nthen go right "+robot3.goRightN(8)+" step");
	

	}
}
package HomeWork;

public class MyPower {
	public static void main(String[]args){
		long x =3 ,y=17;
		System.out.println("Pow( " + x +" , " + y + " ) = " + myPower(x,y));
	}
	public static long myPower(long x,long y){
		System.out.println("x= "+ x +" , y = "+ y);
		long ans = x;
		
		if( y !=1){
			if(y%2!=0){
				ans = x*myPower(x*x , y/2);
			}
			else{
			ans = myPower(x*x , y/2);
			}
			System.out.println("Returning : " + ans + ", x =" + x + ", y = "+ y);
			return ans;
		}
		else {
			System.out.println("Returning : " + ans + ", x =" + x + ", y = "+ y);
			return ans;
		}
	}
}

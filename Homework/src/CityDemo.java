public class CityDemo {
	public static void main (String[]args){
		City[] c = new  City[4];
		c[0] = new City("Chonburi");
		c[1] = new City("Lobburi",1,2);
		c[2] = new City("Bangkok",true);
		c[3] = new City("Inw Za");
		for(int i=0;i<c.length;i++){
		System.out.println("lati : "+c[i].getLati());
		System.out.println("longi : "+c[i].getLongi());
		System.out.println("name : "+c[i].getName());
		
		System.out.println(c[i].toString());
		}}}
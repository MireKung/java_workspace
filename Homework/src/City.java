public class City {
	private int lati,longi;
	private String name;
	public boolean isCapitalCity;
	City(String newName){
		name=newName;
	}
	City(String newname,int newLati,int newLongi){
		name=newname;
		lati=newLati;
		longi=newLongi;
	}
	City(String newname,boolean newCapitalCity){
		name=newname;
		isCapitalCity=newCapitalCity;
	}
	public int getLati(){
	return lati;	
	}
	public int getLongi(){
		return longi;
	}
	public String getName (){
		return name;
	}
	public String toString(){
		String inwza = "Lati : "+lati+"\nLongi : "+longi+"\nname : "+name+"\nisCapitalCity : "+isCapitalCity;
		return inwza;
	}
}

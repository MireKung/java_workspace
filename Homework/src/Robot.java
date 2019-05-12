public class Robot {
	private int ID;
	public int forward=0,backward=0,left=0,right=0,numberOfRobot=0;
	private char version='|';
	private String name;
	public Robot(){}
	public Robot(int newID,String newName){
		ID=newID;
		name=newName; }
	public Robot(int newID,String newName,char newVerstion){
		ID=newID;
		name=newName;
		version=newVerstion; }
	public int getID(){
	return ID;	}
	public void setID(int newID){
		ID=newID; }
	public String getName(){
		return name; 
	}
	public void setName(String newName){
		name=newName;
	}
	public char getVersion(){
		return version;
	}
	public void setVersion(char newVersion){
		version=newVersion;
	}
	public int goForwardN(int n){
		return forward+n;
	}
	public int goBackwardN(int n){
		return backward+n;
	}	
	public int goLeftN(int n){
		return left+n;
	}	
	public int goRightN(int n){
		return right+n;
	}}

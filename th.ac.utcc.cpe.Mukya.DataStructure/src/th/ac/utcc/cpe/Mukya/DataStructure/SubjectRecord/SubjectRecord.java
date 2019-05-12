package th.ac.utcc.cpe.Mukya.DataStructure.SubjectRecord;

public class SubjectRecord {
	private String code;
	private String name;
	private float unit;
	private String grade;
	private SubjectRecord []a;
	
	public SubjectRecord(){
		
	}
	public SubjectRecord(int size) {
	if(size>0){
		 a = new SubjectRecord[size];
	}
	else{
		a = new SubjectRecord[10];
	}
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getUnit() {
		return unit;
	}
	public void setUnit(float unit) {
		this.unit = unit;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public static void main(String[] args) {
		SubjectRecord a = new SubjectRecord();
		a.setCode("NC252");
		a.setName("Data Structure");
		a.setUnit(3);
		a.setGrade("A");
		
		SubjectRecord b = new SubjectRecord();
		b.setCode("NC253");
		b.setName("Electric Circuit");
		b.setUnit(3);
		b.setGrade("B+");
		
		SubjectRecord c = new SubjectRecord();
		c.setCode("NC255");
		c.setName("Digital");
		c.setUnit(3);
		c.setGrade("B");
		
		/*SubjectRecordArray arr = new SubjectRecordArray(10);
		arr.insert(a);
		arr.insert(b);
		arr.insert(c);
		
		arr.display();
		
		arr.delete("NC253");
		System.out.println("\nAfter deletion of NC253");
		arr.display();*/
	}
}

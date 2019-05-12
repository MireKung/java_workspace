package softwareEngi;
/**
 ** @author Mukya_Wongdaraphanich 5907101012
 **
 */
public class useCase {
	
	public String uml,index;
	
	public useCase() {};
	
	public useCase(String uml , String useCase){
		this.uml = uml;
		this.index = useCase;
	}

	public String getUml() {
		return uml;
	}

	public void setUml(String uml) {
		this.uml = uml;
	}

	public String getUseCase() {
		return index;
	}

	public void setUseCase(String useCase) {
		this.index = index;
	}

	public String toString() {
		return "useCase [uml=" + uml + ", index=" + index + "]";
	}
	
	

}

package devices;

public class ComboDevice extends Device implements Scanner, Printer {
	
	public ComboDevice(String serialnumber) {
		super(serialnumber);	
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo Printer: " + doc);
		
	}

	@Override
	public String Scan() {
		
		return "Combo Scan result" ;
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo Process: " + doc);
		
	}
}

package practice2;



public class EncapTest {

	private String scode;
	private String bname;
	private String bcode;
	private String dname;
	private String dcode;
	
	 
	public String getScode() {
		return scode;
	}


	public void setScode(String scode) {
		this.scode = scode;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getBcode() {
		return bcode;
	}


	public void setBcode(String bcode) {
		this.bcode = bcode;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getDcode() {
		return dcode;
	}


	public void setDcode(String dcode) {
		this.dcode = dcode;
	}


	public static void main(String[] args) 
	{
		EncapTest e = new EncapTest();
		e.setBcode("123");
		e.setBname("bacha");
		e.setDcode("d123");
		e.setDname("mannick");
		e.setScode("112234457");
		

		System.out.println(e.getBcode()+e.getBname()+e.getDcode()+e.getDname()+e.getScode());
	}

}

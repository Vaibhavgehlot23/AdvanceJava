package MarksheetModel;

public class MarksheetBean {
	private int id;
	private String Rollno;
	private String Fname;
	private String Lname;
	private int phy;
	private int Chem;
	private int Maths;

	public MarksheetBean() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRollno() {
		return Rollno;
	}

	public void setRollno(String rollno) {
		Rollno = rollno;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChem() {
		return Chem;
	}

	public void setChem(int chem) {
		Chem = chem;
	}

	public int getMaths() {
		return Maths;
	}

	public void setMaths(int maths) {
		Maths = maths;
	}

}

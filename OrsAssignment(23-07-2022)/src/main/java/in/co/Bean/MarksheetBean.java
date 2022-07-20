package in.co.Bean;

public class MarksheetBean {

	private int id;
	private String Rollno;
	private String Name;

	private int phy;
	private int Chem;
	private int Maths;

	public MarksheetBean() {

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

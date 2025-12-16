package day1127;

public class DataDTO {
	private String name;
	private int myAge;

	public DataDTO() {
		System.out.println("DataDTO의 기본 생성자");
	}

	public DataDTO(String name, int myAge) {
		this.name = name;
		this.myAge = myAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getmyAge() {
		return myAge;
	}

	public void setmyAge(int myAge) {
		this.myAge = myAge;
	}

	@Override
	public String toString() {
		return "DataDTO [name=" + name + ", myAge=" + myAge + "]";
	}

}// class

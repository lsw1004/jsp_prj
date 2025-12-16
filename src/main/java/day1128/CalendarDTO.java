package day1128;

public class CalendarDTO {
	private String paramMonth, paramYear;

	public CalendarDTO() {
		super();
	}

	public String getParamMonth() {
		return paramMonth;
	}

	public void setParamMonth(String paramMonth) {
		this.paramMonth = paramMonth;
	}

	public String getParamYear() {
		return paramYear;
	}

	public void setParamYear(String paramYear) {
		this.paramYear = paramYear;
	}

	@Override
	public String toString() {
		return "CalendarDTO [paramMonth=" + paramMonth + ", paramYear=" + paramYear + "]";
	}


	
	
}

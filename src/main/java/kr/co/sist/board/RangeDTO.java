package kr.co.sist.board;

public class RangeDTO {
	private int startNum, endNum;// 시작번호, 끝번호
	private String field, keyword;// 검색필드 1,2,3, 검색 값
	private String fieldStr;// 검색 필드값의 대응되는 컬럼명의 문자열
	private String url;// 이동할 url
	private int currentPage=1;// 현재 페이지
	private int totalPage = 0;// 총 페이지
	
	

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFieldStr() {
		String[] fieldTitle = { "title", "content", "id" };
		int tempField = Integer.parseInt(field);
		if (!(tempField > 0 && tempField < 4)) {
			tempField = 1;
		} // end if
		fieldStr = fieldTitle[Integer.parseInt(field) - 1];
		return fieldStr;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "RangeDTO [startNum=" + startNum + ", endNum=" + endNum + ", field=" + field + ", keyword=" + keyword
				+ ", fieldStr=" + fieldStr + ", url=" + url + ", currentPage=" + currentPage + "]";
	}
	
	

}

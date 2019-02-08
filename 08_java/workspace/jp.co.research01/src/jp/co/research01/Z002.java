package jp.co.research01;

public class Z002 {
	private String detail;
	private String k01_change_cnt;
	private String k02_change_cnt;		

	public Z002(String c1 , String c2, String c3) {
		this.detail = c1;
		this.k01_change_cnt = c2;
		this.k02_change_cnt = c3;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getK01_change_cnt() {
		return k01_change_cnt;
	}

	public void setK01_change_cnt(String k01_change_cnt) {
		this.k01_change_cnt = k01_change_cnt;
	}

	public String getK02_change_cnt() {
		return k02_change_cnt;
	}

	public void setK02_change_cnt(String k02_change_cnt) {
		this.k02_change_cnt = k02_change_cnt;
	}

	
}

package jp.co.research01;

public class Z001 {
	private String midasi;
	private String detail;
	private String k01_change_cnt;
	private String k02_change_cnt;
	
	public Z001(String data) {		
		midasi         = data + "_midasi";
		detail         = data + "_detail";
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

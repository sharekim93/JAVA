package abstract006;

class ScoreDto extends Score {
	private String jang, star, pass;
	
	ScoreDto(){super();}
	
	public ScoreDto(String name,int kor,int eng, int math) {
		super();
		super.setName(name);
		super.setKor(kor);
		super.setEng(eng);
		super.setMath(math);
	}

	@Override
	public String toString() {
		return "ScoreDto [jang=" + jang + ", star=" + star + ", pass=" + pass + "]";
	}

	public String getJang() {
		return jang;
	}

	public String getStar() {
		return star;
	}

	public String getPass() {
		return pass;
	}

	public void setJang(String jang) {
		this.jang = jang;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}

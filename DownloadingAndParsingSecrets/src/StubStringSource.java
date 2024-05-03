
public class StubStringSource extends StringSource {
	private String s;
	
	public StubStringSource(String s) {
		this.s = s;
	}
	
	@Override
	public String obtainString() {
		return s;
	}

}

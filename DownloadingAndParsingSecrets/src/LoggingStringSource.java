
public class LoggingStringSource extends StringSource {
	private StringSource s;

	public LoggingStringSource(StringSource s) {
		this.s = s;
	}

	@Override
	public String obtainString() {
		String input = s.obtainString();
		System.out.println("Input obtained: " + input);
		return input;
	}
	
}

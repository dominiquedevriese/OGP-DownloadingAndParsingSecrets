
public class EnvStringSource extends StringSource {
	private String envname;
	
	public EnvStringSource(String envname) {
		this.envname = envname;
	}

	@Override
	public String obtainString() {
		return System.getenv(envname);
	}

}

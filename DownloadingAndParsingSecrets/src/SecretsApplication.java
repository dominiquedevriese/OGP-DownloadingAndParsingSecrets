public class SecretsApplication {
	StringSource ss;
	
	public SecretsApplication(StringSource source) {
		//ss = new EnvStringSource("SECRET");
		//ss = new StubStringSource("SECRET NUMBER: 43");
		ss = source;
	}
	
	public static void main(String[] args) {
		SecretsApplication app = new SecretsApplication(new HttpStringSource());
		app.run();
	}
	
	public void run() {
		int secret = obtainInput();
		System.out.println("The secret is: " + secret);
	}

	public int obtainInput() {
		String result = ss.obtainString();
		String[] words = result.split(" ");
		return Integer.parseInt(words[2]);
	}
	
}

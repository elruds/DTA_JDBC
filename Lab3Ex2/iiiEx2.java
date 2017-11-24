import FormatIO.*;

	public class iiiEx2 {

		public static void main (String[] arg)
		{
			Console con = new Console();
			
			con.println("Please enter a line of text.");
			String userLine = con.readLine();
			
			StringIn sin = new StringIn(userLine);
			String word;
			word = sin.readWord();
			System.err.println(word);
			
			double doub = sin.readDouble();
			System.err.println("" + doub);
			
			
			
			
			
}
		}
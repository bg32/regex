package reg;


public class otherTest {

public String getRegEx(String arg) {
	String [] strArray = arg.split(" ");
	for (String s: strArray) {
		if (s.matches("(J|W|COM|HB)[0-9]{4}")){
			System.out.println(s);
			return s;

		}
	}
	return null;

}

}

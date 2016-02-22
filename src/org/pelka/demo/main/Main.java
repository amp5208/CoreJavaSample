package org.pelka.demo.main;
import java.util.ArrayList;
import java.util.List;

import org.pelka.demo.util.NumberParser;

public class Main {

	public static void main(String[] args) {

	    if (args != null && args.length >0)
	    {
	        args[0].isEmpty();
	        String x = getHelloStatement(args[0]);
	        NumberParser nparse = new NumberParser();
	        List<String> list = new ArrayList<String>();
	        System.out.println(x);

	        int y = nparse.getIntValue(args[1]);
	    }

	}

	private static String getHelloStatement(String x) {
		System.out.println("TRACE: [" + x + "]");
		return x;
	}

}

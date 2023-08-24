package org.testing.utilities;

import java.util.regex.Pattern;

public class replacevalue 
{
	public static String assignvalue(String responsedata, String variablename, String variablevalue)
	{
		return responsedata.replaceAll(Pattern.quote("{{"+variablename+"}}"), variablevalue);
	}
}

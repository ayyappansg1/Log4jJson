import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonREad {
	public static void main(String[] args) throws IOException,ClassCastException,ParseException {
		
		JSONParser jsonparser=new JSONParser();
		FileReader filereader=new FileReader("E:\\Agnikarthi.json");
		Object parse = jsonparser.parse(filereader);
		
		JSONObject jsonobject=(JSONObject) parse;
		String name=(String) jsonobject.get("Name");
		Long age=(Long) jsonobject.get("Age");
		System.out.println(name);
		System.out.println(age);
		
		JSONArray array=(JSONArray) jsonobject.get("Special");
		Iterator sangar=array.iterator();
		
		while(sangar.hasNext()) {
			System.out.println(sangar.next());
		}
		
	}

}

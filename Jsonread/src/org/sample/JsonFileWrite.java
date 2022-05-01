package org.sample;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonFileWrite {

	public static void main(String[] args) throws JSONException, IOException {
		
		JSONObject jsonboys=new JSONObject();
		jsonboys.put("Name", "Ayyappan");
		jsonboys.put("Age", 29);
		
		JSONArray array=new JSONArray();
		array.put("Sangar");
		array.put("Karthi");
		jsonboys.put("Special", array);
		
		FileWriter filewriter=new FileWriter("Agnikarthi");
		filewriter.write(jsonboys.toString());
		
		filewriter.close();
		
		
		
		
		
		
		
		
		
		
	}

}

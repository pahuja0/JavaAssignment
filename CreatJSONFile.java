package jsonproject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreatJSONFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		JSONObject obj= new JSONObject();	 
		obj.put("name", "Harshita");
		obj.put("city", "Gurgaon");
		
		
		JSONArray list= new JSONArray();
		list.add("Java");
		list.add("JSP");
		list.add("JSS");
		
		obj.put("courses", list);
		
		try(FileWriter file= new FileWriter(".//jsonfiles//mPerson.json"))
		{
				file.write(obj.toString());
				file.flush();
		}
		catch(IOException e)
		{
		  e.printStackTrace();
		}
		System.out.println(obj);
		System.out.println(list);
	}

}

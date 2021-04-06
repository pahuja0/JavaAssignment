package jsonproject;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ReadDataFromJsonFile { 

public static void main(String[] args) throws IOException , ParseException
			{
				//to parse the json file
				JSONParser  jsonparser= new JSONParser();
				
				// to read the json file
				FileReader reader=  new FileReader(".//jsonfiles//emp.json");
				
				// to parse the data present in reader as data is present in form of string and we convert in object
				Object obj= jsonparser.parse(reader); 
				
				//typecasting object as JSON object  
				JSONObject empjsonobj = (JSONObject)obj;
				
				//typecasting into string
				String fname = (String)empjsonobj.get("firstname");
				String lname = (String)empjsonobj.get("lastname");
				
				System.out.println("First name:"+ fname);
				System.out.println("Last name:"+ lname);
				
				//address is a JSON array so we typecaste using JSONArray
				JSONArray array = (JSONArray)empjsonobj.get("address");	
				
				for(int i=0; i< array.size(); i++)
				{
					JSONObject address = (JSONObject)array.get(i);
					String street= (String)address.get("street");
					String city= (String)address.get("city");
					String state = (String)address.get("state");
					
					System.out.println("Street:"+ street);
					System.out.println("City:"+ city);
					
					System.out.println("State:"+ state);
					
					
					
				}
				
			}
	
		}



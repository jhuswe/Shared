package objects;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;

public class MessageBuilder {
	public MessageBuilder() {
	}
	
	public static String SerializeMsg(Message message) {
		String test = JsonWriter.objectToJson(message);
		
		return test;
	}
	
	public static Message DeserializeMsg(String message) {
		Message test = (Message) JsonReader.jsonToJava(message);
		
		return test;
	}
}

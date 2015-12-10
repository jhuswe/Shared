package objects;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;

public class MessageBuilder {
	public MessageBuilder() {
	}
	
	public static String SerializeMsg(Message message) {
		return JsonWriter.objectToJson(message);
	}
	
	public static Message DeserializeMsg(String message) {
		return (Message) JsonReader.jsonToJava(message);
	}
}

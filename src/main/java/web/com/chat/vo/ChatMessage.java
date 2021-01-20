package web.com.chat.vo;

import web.com.chat.vo.MessageType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ChatMessage {

	private MessageType type;
	private String content;
	private String sender;
	
}

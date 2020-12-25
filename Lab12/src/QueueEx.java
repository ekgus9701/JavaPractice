import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","±èÀÌÈ­"));
		messageQueue.offer(new Message("sendSMS","BTS"));
		messageQueue.offer(new Message("sendKakaotalk","Æë¼ö"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"´Ô¿¡°Ô ¸ŞÀÏÀ» º¸³À´Ï´Ù!");
				break;
			case "sendSMS":
				System.out.println(message.to+"´Ô¿¡°Ô SMS¸¦ º¸³À´Ï´Ù!");
				break;
			case "sendKakaotalk":
				System.out.println(message.to+"´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù!");
				break;
				
				
			}
		}
		

	}

}

import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","����ȭ"));
		messageQueue.offer(new Message("sendSMS","BTS"));
		messageQueue.offer(new Message("sendKakaotalk","���"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"�Կ��� ������ �����ϴ�!");
				break;
			case "sendSMS":
				System.out.println(message.to+"�Կ��� SMS�� �����ϴ�!");
				break;
			case "sendKakaotalk":
				System.out.println(message.to+"�Կ��� īī������ �����ϴ�!");
				break;
				
				
			}
		}
		

	}

}

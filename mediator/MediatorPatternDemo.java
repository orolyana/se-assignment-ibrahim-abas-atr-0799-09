public class MediatorPatternDemo {

	public static void main(String args[]) {

		ChatRoom chat = new ChatRoomImpl();

		User1 u1 = new User1(chat);
		u1.setname("ibrahim abas");
		u1.sendMsg("Hi ibrahim! how are you?");

		User2 u2 = new User2(chat);
		u2.setname("gifti abas");
		u2.sendMsg("I am Fine! You tell?");
	}

}

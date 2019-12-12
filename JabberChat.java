
public class JabberChat {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String username = "ajithc1861@jabb3r.org";
        String password = "lakshimi";
        
        JabberConnection jabberConnection = new JabberConnection("jabber.hot-chilli.net", 5222);
        
        jabberConnection.init();

        jabberConnection.performLogin(username, password);
        System.out.println("reached");

        jabberConnection.setStatus(true, "Hello everyone");
        String buddyJID = "ajithcofficial@jabb3r.org";
        String buddyName = "testuser2";
        jabberConnection.createEntry(buddyJID, buddyName);
         
        jabberConnection.sendMessage("Hello mate", buddyJID);
         
        boolean isRunning = true;
         
        while (isRunning) {
            Thread.sleep(50);
        }
         
        jabberConnection.destroy();

	}

}

package springbootmcpizza.mcpizza;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSMS {
    public static final String Account_SID = "";
    public static final String Autho_Token = "";

    public boolean sendMessage(String twilioNumber, String yourNumber, String messageToSend){
        Twilio.init(Account_SID,Autho_Token);
        Message message = Message.creator(new PhoneNumber(twilioNumber), new PhoneNumber(yourNumber), messageToSend).create();
        return message.getStatus().toString()==null;
    }

}

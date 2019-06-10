package app.sms.com.smsapp.modal;

public class SMS {
    private String Sender;
    private String Messag;
    private String SenderImg;

    public SMS(String sender, String messag) {
        this.Sender = sender;
        this.Messag = messag;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public String getMessag() {
        return Messag;
    }

    public void setMessag(String messag) {
        Messag = messag;
    }

    public String getSenderImg() {
        return SenderImg;
    }

    public void setSenderImg(String senderImg) {
        SenderImg = senderImg;
    }
}

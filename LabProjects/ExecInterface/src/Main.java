import Mensageiros.Sms;

public class Main {
    public static void main(String[] args) {

        Sms sms1 = new Sms("31983757749","31984472223");

        sms1.envioSms(sms1.getNumeroRemetente(), sms1.getNomeRemetente(), sms1.getNumeroDestinatario(), sms1.getNomeDestinatario(), sms1.getMensagem());
    }
}
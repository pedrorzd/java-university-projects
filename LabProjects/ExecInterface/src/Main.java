import Mensageiros.Email;
import Mensageiros.Push;
import Mensageiros.Sms;

public class Main {
    public static void main(String[] args) {

        Sms sms1 = new Sms(
                "11999999999",
                "11888888888",
                "João",
                "Maria",
                "Bom dia, Maria!"
        );
        Sms sms2 = new Sms(
                "11977777777",
                "11966666666",
                "Ana",
                "Carlos",
                "Como você está?"
        );
        Sms sms3 = new Sms(
                "11955555555",
                "11944444444",
                "Pedro",
                "Lucas",
                "Vamos nos encontrar amanhã?"
        );
        Sms sms4 = new Sms(
                "11933333333",
                "11922222222",
                "Laura",
                "Fernanda",
                "Parabéns pelo seu aniversário!"
        );
        Sms sms5 = new Sms(
                "11911111111",
                "11900000000",
                "Rafael",
                "Bruna",
                "Boa noite, Bruna!"
        );

        sms1.envioSms(
                sms1.getNumeroRemetente(),
                sms1.getNomeRemetente(),
                sms1.getNumeroDestinatario(),
                sms1.getNomeDestinatario(),
                sms1.getMensagem()
        );
        sms2.envioSms(
                sms1.getNumeroRemetente(),
                sms1.getNomeRemetente(),
                sms1.getNumeroDestinatario(),
                sms1.getNomeDestinatario(),
                sms1.getMensagem()
        );
        sms3.envioSms(
                sms1.getNumeroRemetente(),
                sms1.getNomeRemetente(),
                sms1.getNumeroDestinatario(),
                sms1.getNomeDestinatario(),
                sms1.getMensagem()
        );
        sms4.envioSms(
                sms1.getNumeroRemetente(),
                sms1.getNomeRemetente(),
                sms1.getNumeroDestinatario(),
                sms1.getNomeDestinatario(),
                sms1.getMensagem()
        );
        sms5.envioSms(
                sms1.getNumeroRemetente(),
                sms1.getNomeRemetente(),
                sms1.getNumeroDestinatario(),
                sms1.getNomeDestinatario(),
                sms1.getMensagem()
        );

        Email email1 = new Email(
                "joao@email.com",
                "João",
                "maria@email.com",
                "Maria",
                "Reunião de amanhã",
                "Olá Maria, tudo bem? Confirmando a nossa reunião de amanhã às 10h."
        );

        Email email2 = new Email(
                "ana@email.com",
                "Ana",
                "carlos@email.com",
                "Carlos",
                "Entrega do relatório",
                "Oi Carlos, estou enviando o relatório conforme combinado."
        );

        Email email3 = new Email(
                "pedro@email.com",
                "Pedro",
                "lucas@email.com",
                "Lucas",
                "Parabéns!",
                "Feliz aniversário, Lucas! Tudo de bom sempre!"
        );

        Email email4 = new Email(
                "laura@email.com",
                "Laura",
                "fernanda@email.com",
                "Fernanda",
                "Convite para evento",
                "Oi Fernanda, gostaria de convidá-la para um evento no sábado."
        );

        Email email5 = new Email(
                "rafael@email.com",
                "Rafael",
                "bruna@email.com",
                "Bruna",
                "Saudades",
                "Oi Bruna, faz tempo que não nos falamos. Como você está?"
        );

        email1.envioEmail(
                email1.getEmailRemetente(),
                email1.getNomeRemetente(),
                email1.getEmailDestinatario(),
                email1.getNomeDestinatario(),
                email1.getAssuntoEmail(),
                email1.getCorpoMensagem()
        );

        email2.envioEmail(
                email2.getEmailRemetente(),
                email2.getNomeRemetente(),
                email2.getEmailDestinatario(),
                email2.getNomeDestinatario(),
                email2.getAssuntoEmail(),
                email2.getCorpoMensagem()
        );

        email3.envioEmail(
                email3.getEmailRemetente(),
                email3.getNomeRemetente(),
                email3.getEmailDestinatario(),
                email3.getNomeDestinatario(),
                email3.getAssuntoEmail(),
                email3.getCorpoMensagem()
        );

        email4.envioEmail(
                email4.getEmailRemetente(),
                email4.getNomeRemetente(),
                email4.getEmailDestinatario(),
                email4.getNomeDestinatario(),
                email4.getAssuntoEmail(),
                email4.getCorpoMensagem()
        );

        email5.envioEmail(
                email5.getEmailRemetente(),
                email5.getNomeRemetente(),
                email5.getEmailDestinatario(),
                email5.getNomeDestinatario(),
                email5.getAssuntoEmail(),
                email5.getCorpoMensagem()
        );

        Push push1 = new Push(
                "push-001",
                "Bem-vindo!",
                "Obrigado por se cadastrar no nosso aplicativo."
        );

        Push push2 = new Push(
                "push-002",
                "Promoção Especial",
                "Aproveite 50% de desconto em todos os produtos até amanhã!"
        );

        Push push3 = new Push(
                "push-003",
                "Atualização Disponível",
                "Uma nova versão do app já está disponível para download."
        );

        Push push4 = new Push(
                "push-004",
                "Alerta de Segurança",
                "Detectamos uma tentativa de login suspeita na sua conta."
        );

        Push push5 = new Push(
                "push-005",
                "Mensagem Importante",
                "Não se esqueça da sua reunião marcada para hoje às 15h."
        );

        push1.enviaPush(push1.getTituloMensagem(), push1.getHorario(), push1.getCorpoMensagem());
        push2.enviaPush(push2.getTituloMensagem(), push2.getHorario(), push2.getCorpoMensagem());
        push3.enviaPush(push3.getTituloMensagem(), push3.getHorario(), push3.getCorpoMensagem());
        push4.enviaPush(push4.getTituloMensagem(), push4.getHorario(), push4.getCorpoMensagem());
        push5.enviaPush(push5.getTituloMensagem(), push5.getHorario(), push5.getCorpoMensagem());
    }
}
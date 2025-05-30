import FormGeo.formaCirculo;
import FormGeo.formaQuad;
import FormGeo.formaRetangulo;
import Mensageiros.Email;
import Mensageiros.Push;
import Mensageiros.Sms;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

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

        push1.enviaPush(
                push1.getTituloMensagem(),
                push1.getHorario(),
                push1.getCorpoMensagem()
        );
        push2.enviaPush(
                push2.getTituloMensagem(),
                push2.getHorario(),
                push2.getCorpoMensagem()
        );
        push3.enviaPush(
                push3.getTituloMensagem(),
                push3.getHorario(),
                push3.getCorpoMensagem()
        );
        push4.enviaPush(
                push4.getTituloMensagem(),
                push4.getHorario(),
                push4.getCorpoMensagem()
        );
        push5.enviaPush(
                push5.getTituloMensagem(),
                push5.getHorario(),
                push5.getCorpoMensagem()
        );

        formaCirculo circulo1 = new formaCirculo(
                "Circulo 1",
                2.7
        );
        formaCirculo circulo2 = new formaCirculo(
                "Circulo 2",
                3
        );
        formaCirculo circulo3 = new formaCirculo(
                "Circulo 3",
                5.99
        );
        formaCirculo circulo4 = new formaCirculo(
                "Circulo 4",
                1.72
        );
        formaCirculo circulo5 = new formaCirculo(
                "Circulo 5",
                3.58
        );

        circulo1.calculaArea(
                circulo1.getRaio(),
                circulo1.getPi()
        );
        circulo2.calculaArea(
                circulo2.getRaio(),
                circulo2.getPi()
        );
        circulo3.calculaArea(
                circulo3.getRaio(),
                circulo3.getPi()
        );
        circulo4.calculaArea(
                circulo4.getRaio(),
                circulo4.getPi()
        );
        circulo5.calculaArea(
                circulo5.getRaio(),
                circulo5.getPi()
        );

        formaQuad quadrado1 = new formaQuad("Quadrado Azul", 5.0, 5.0);
        formaQuad quadrado2 = new formaQuad("Quadrado Vermelho", 7.5, 7.5);
        formaQuad quadrado3 = new formaQuad("Quadrado Verde", 10.0, 10.0);
        formaQuad quadrado4 = new formaQuad("Quadrado Amarelo", 12.0, 12.0);
        formaQuad quadrado5 = new formaQuad("Quadrado Roxo", 15.5, 15.5);

        quadrado1.calculaArea(
                quadrado1.getAltura(),
                quadrado1.getLargura()
        );
        quadrado2.calculaArea(
                quadrado2.getAltura(),
                quadrado2.getLargura()
        );
        quadrado3.calculaArea(
                quadrado3.getAltura(),
                quadrado3.getLargura()
        );
        quadrado4.calculaArea(
                quadrado4.getAltura(),
                quadrado4.getLargura()
        );
        quadrado5.calculaArea(
                quadrado5.getAltura(),
                quadrado5.getLargura()
        );

        formaRetangulo retangulo1 = new formaRetangulo("Retângulo 1", 5.0, 10.0);
        formaRetangulo retangulo2 = new formaRetangulo("Retângulo 2", 8.0, 12.0);
        formaRetangulo retangulo3 = new formaRetangulo("Retângulo 3", 15.0, 7.5);
        formaRetangulo retangulo4 = new formaRetangulo("Retângulo 4", 20.0, 5.0);
        formaRetangulo retangulo5 = new formaRetangulo("Retângulo 5", 9.0, 14.0);

        retangulo1.calculaArea(
                retangulo1.getLargura(),
                retangulo1.getAltura()
        );
        retangulo2.calculaArea(
                retangulo2.getLargura(),
                retangulo2.getAltura()
        );
        retangulo3.calculaArea(
                retangulo3.getLargura(),
                retangulo3.getAltura()
        );
        retangulo4.calculaArea(
                retangulo4.getLargura(),
                retangulo4.getAltura()
        );
        retangulo5.calculaArea(
                retangulo5.getLargura(),
                retangulo5.getAltura()
        );

        formaTrapezio trapezio1 = new formaTrapezio("Trapézio 1", 10.0, 6.0, 5.0);
        formaTrapezio trapezio2 = new formaTrapezio("Trapézio 2", 15.0, 8.0, 7.0);
        formaTrapezio trapezio3 = new formaTrapezio("Trapézio 3", 12.5, 5.5, 6.0);
        formaTrapezio trapezio4 = new formaTrapezio("Trapézio 4", 20.0, 10.0, 8.0);
        formaTrapezio trapezio5 = new formaTrapezio("Trapézio 5", 18.0, 9.0, 7.5);

        trapezio1.calculaArea(
                trapezio1.getbaseMaior(),
                trapezio1.getbaseMenor(),
                trapezio1.getaltura()
        );
        trapezio2.calculaArea(
                trapezio2.getbaseMaior(),
                trapezio2.getbaseMenor(),
                trapezio2.getaltura()
        );
        trapezio3.calculaArea(
                trapezio3.getbaseMaior(),
                trapezio3.getbaseMenor(),
                trapezio3.getaltura()
        );
        trapezio4.calculaArea(
                trapezio4.getbaseMaior(),
                trapezio4.getbaseMenor(),
                trapezio4.getaltura()
        );
        trapezio5.calculaArea(
                trapezio5.getbaseMaior(),
                trapezio5.getbaseMenor(),
                trapezio5.getaltura()
        );
    }
}
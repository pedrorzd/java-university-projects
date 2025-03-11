package People;

public class Clients {
    private String name;
    private int old;
    private String paymentMethod;

    public String getName(){
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int getOld(){
        return old;
    }

    public int setOld(int old) {
        return this.old = old;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }

    public String setPaymentMethod(String paymentMethod) {
        return this.paymentMethod = paymentMethod;
    }

    public void imprimir(){
        System.out.println(
                "Nome: " + getName() + "\n" +
                "Idade: " + getOld() + "\n" +
                "Pagamento: " + getPaymentMethod() +"\n"
        );
    }
}


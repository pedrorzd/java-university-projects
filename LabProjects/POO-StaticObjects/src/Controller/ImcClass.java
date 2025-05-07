package Controller;

public class ImcClass {
    private double peso;
    private double altura;

    public static double calcularImc(double peso, double altura){
        double resultadoImc = peso/(Math.pow(altura,2));
        return resultadoImc;
    }
}

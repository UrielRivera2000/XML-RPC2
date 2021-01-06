public class Metodos {

    public double IMC( double peso, double altura){
        double resultado;
        altura = altura * altura;
        resultado = peso / altura;

        return resultado;
    }

}

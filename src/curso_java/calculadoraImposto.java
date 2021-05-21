public class calculadoraImposto {
    public static void main(String[] arg){
        float salario = 2500.00F;
        float porcentagem = 30;
        float porcentamgemDoSalario = salario * (porcentagem / 100);
        System.out.println(porcentamgemDoSalario);
    }
}

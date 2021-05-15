/*|Dado um determinado salário
se o salário for mais do que 4500 imprima 30% do valor
 senão, imprima 10% do valor*/
public class CalculadoraImpostoCondicional {
    public static void main(String[] args) {
        float salario = 4700.50F;
        if(salario > 4500){
            float trintaPorCento = salario * 0.3F;
            System.out.println("30% = "+ trintaPorCento);
        }else{
            float dezPorCento = salario * 0.1F;
            System.out.println("10% = "+dezPorCento);
        }
    }
}

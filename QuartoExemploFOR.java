public class QuartoExemploFOR{
    public static void main(String args []){
        double emprestimo = Teclado.leDouble("Informe um valor para o emprestimo: ");
        double parcelas = Teclado.leDouble("Informe a qt de parcelas para o emprestimo (1-12): ");
        double valorParcela = emprestimo/parcelas;
        
        for(int contador = 1; contador <= parcelas; contador++){
            valorParcela += valorParcela*0.05;
            System.out.printf("O valor da parcela %d é: %4.2f \n", contador, valorParcela);
        }
    }
}
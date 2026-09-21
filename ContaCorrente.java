public class ContaCorrente{
    private double saldo;
    
    public ContaCorrente(double s){
        saldo = s;
    }
    
    public void consultaSaldo() {
    System.out.println("O seu saldo atual é: " + saldo);
    }
    
    public void retirada(double valor){
        while(valor>saldo){
            System.out.print("Saldo indisponivel para retirada: ");
            valor = Teclado.leDouble("Informe um novo valor para retirada: ");
        }
        saldo-=valor;
    }
    
    public void deposito(double valor){
        while(valor<=0){
            System.out.print("Valor incorreto para deposito.");
            valor = Teclado.leDouble("Informe um novo valor para deposito: ");
        }
        saldo+=valor;
    }
    
    public void emprestimo(double valor, int parcelas){
        while(parcelas<=0){
            System.out.print("Valor incorreto para parcelas.");
            parcelas = Teclado.leInt("Informe a qt de parcelas (1-12): ");
        }
        
        double valorParcela = valor/parcelas;
        
        for(int contador = 1; contador <= parcelas; contador++){
            valorParcela += valorParcela*0.05;
            System.out.printf("O valor da parcela %d é: %4.2f \n", contador, valorParcela);
        }
             
        saldo+=valor;
    }
    
    public void opcoes(){
        System.out.println("Bem-vindo ao Caixa Eletronico!");
        System.out.println("As opções disponiveis são: ");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Empréstimo");
        System.out.println("4 - Consulta Saldo");
        System.out.println("0 - Encerrar");
    }
    
}
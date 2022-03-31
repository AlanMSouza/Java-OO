public class Conta
{
    double saldo = 0.0;

    public boolean depositar(double valor){

        System.out.println("Depositando: " + valor);

        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println ("Saldo atual: " + saldo);
            return true;
        }
        else{
            System.out.println ("Inválido"); 
            return false;
        }
    }
    
    public boolean sacar (double valor){
        
        System.out.println ("Sacando: " + valor);
        
        if (saldo >= valor && valor > 0){
            saldo = saldo - valor;
            System.out.println ("Saldo atual: " + saldo);
            return true;
        }
        else{
            System.out.println ("Transação inválida");
            return false;
        }
        
    }
    
    public boolean transferir (double valor, Conta conta2){
        
        if (sacar(valor)){
            conta2.depositar(valor);
            return true;
        }
        else{
            System.out.println ("Transferência inválida");
            return false;
        }
    }
    
    public void mostrarSaldo (double valor){
        System.out.println("Saldo conta 2: " + saldo);
    }
}

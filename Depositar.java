
public class Depositar
{
    public static void main (String [] args){
        Conta conta = new Conta();
        
        //System.out.println(conta.saldo);
        
        conta.saldo = 0.0;
        
        conta.depositar(500.0);
        
        conta.sacar (100.0);
    
        Conta conta2 = new Conta();
        conta2.saldo = 0.0;
        
        conta.transferir(100.0, conta2); 
        
        
    }
}

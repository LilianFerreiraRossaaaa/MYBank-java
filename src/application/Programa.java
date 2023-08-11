package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta minhaConta = new Conta();
		Conta meuSonho = new Conta();
		
		meuSonho.titular = "Lilian Ferrreira Rosa";
		meuSonho.numero = 55566678;
		meuSonho.saldo = 200;
		

		minhaConta.titular = "Lilian Ferrreira Rosa";
		minhaConta.numero = 55566678;
		minhaConta.saldo = 200;
	
		minhaConta.sacar(110);
		
		System.out.println("Saldo atual:   " + minhaConta.saldo);
		
		//TODO: Adicionar mensagem caso o cliente não consiga sacar ou uma mensagem de sucesso!
		
		
		if(minhaConta.sacar(234.89)) {
			System.out.println("OPERAÇÃO EFETUADA COM SUCESSO!");
		}else{
			System.out.println("Erro..Verificar...!");
		}
		
		
		System.out.println("Saldo depois de sacar:"+ minhaConta.saldo);
		
		
		
		minhaConta.depositar(89);
	
		System.out.println("Saldo depois de depositar:   " + minhaConta.saldo);
		
		
		
	}

}




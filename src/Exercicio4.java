	import java.util.Scanner;

	public class Exercicio4 {
   	public static void main(String []args) {
   	Scanner sc =new Scanner(System.in);	
    
   
   	
   	
   	System.out.println("Digite um número");	
   	int n = 1;
	int contadorPrimo =1;
   	boolean verificaPrimo;
   	 n = sc.nextInt();
     
   	
   	while(contadorPrimo < n){
   	verificaPrimo = true;
   	for(int i=2; i < n;i++) {
   	  if(n % i == 0) {
   		verificaPrimo =false;
   		break;
   	  }
   	}
   	if(verificaPrimo == true) {
   		contadorPrimo++;
   	}
   	 n++;
   	}
   	System.out.println(n);	
   	
   	sc.close();
   	}
   	
	}


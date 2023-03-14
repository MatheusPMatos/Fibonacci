import java.util.Scanner;

public class fibo {


	public static void main (String[] args) {
		
		
		int  n, s, i, fi, ff, fo;
		Scanner sc = new Scanner(System.in);

			ff = 0;
			fi = 0;
			fo = 0;
		
			System.out.print("Digite o numero inicial da sequencia: ");
			n = sc.nextInt();
			System.out.print("Qual o tamanho da sequencia?");
			s = sc.nextInt();
			int [] vet = new int [s];
			fi = n;

			for (i=0; (i < s); i++) {
				
				fo = (ff+fi);
				vet [i] = fo;
				i++;
        
				if ( i < s) {
				
						fi =(fo+ff);
						vet[i] = fi;
						i++;
				
				if (i < s) {	
						ff = (fi+fo);
						vet [i]=ff;	
				  }
				}
			} 
			System.out.println("Esta é a sequencia fibonaci para "+ n + " como inicio e "+ s + " casas.");
				for (i = 0; i < s; i++) {
				System.out.print( vet [i]+ " ");
				}		
				sc.close();			
	}
}

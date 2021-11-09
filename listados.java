import java.util.Scanner;

public class listados{
	/**
	* Comentario de documentación metodo
	* @param args Arreglo de cadenas
	* 
	* */

	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		Integer [] list=new Integer[10];
		int j=0, k=0;
		boolean iguales = false;
		for(int i=0;i<10;i++){
			System.out.println("Dame un numero:");
			Integer num=teclado.nextInt();
			list[i]=num;
		}
		for(j=0, k=1;(j<10 && k<10);j++, k++){
			if(list[j]==list[k]){
				iguales = true;
				System.out.println("Son iguales");
			}else{
				iguales = false;
				int aux;
				int k1;
				int k2;
				for(k1=0;k1<10;k1=k1+1){
				   for(k2=0;k2<10;k2=k2+1){
				      if(list[k1]>list[k2]){
					    aux=list[k1];
			    		list[k1]=list[k2];
						list[k2]=aux;
						}
					}
				}
			}
		}

		if(!iguales){	
			System.out.println("este es orden");
			for(int l=0;l<10;l++){
				System.out.println(list[l]);
			}
		}else System.out.println("Los numeros son iguales");
	}
}

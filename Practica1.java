public class Practica1{
	public static void main(String args[]){
		boolean exit;
		String resp;
		do{
		System.out.print("Desea salir de la aplicacion? S/N");
		resp = KbInput.read();
		if (resp == S,s,n,N)
		}while();
	}//main

public static void initializeVector(int vector[]){
	for(int i = 0;i < 4;i++){
		vector[i] = 0;
	}//for (i)
}//inicializeVector


public static void fillMatrix(int matrix[4][5]){
	for(int i = 0;i < 4;i++){
		for(int j = 0;j < 5;j++){
		System.out.print("\nElement[" + i +"][" + j + " = ");
		matrix[i][j] = Integer.ParseInt(KbInput.read());
		}//for (j)
	}//for (i)
}//fillMatrix

}//class
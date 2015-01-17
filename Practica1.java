public class Practica1{
	public static void main(String args[]){
		boolean exit;
		char resp;
		int[][] matrix = new int[4][5];
		do{
		System.out.print("\n\nDesea salir de la aplicacion? S/N");
		resp = Char.ParseChar(KbInput.read());
		if ((resp == 'S' )||(resp ==  's' )|| (resp == 'n' )||(resp == 'N')){
			exit = false;
		}//end if
		else{
			exit = true;
		}// end else
		}while(exit);
	}//main

public static void initializeVector(int vector[]){
	for(int i = 0;i < 4;i++){
		vector[i] = 0;
	}//for (i)
}//inicializeVector


public static void fillMatrix(int matrix[][]){
	for(int i = 0;i < 4;i++){
		for(int j = 0;j < 5;j++){
		System.out.print("\nElement[" + i +"][" + j + " = ");
		matrix[i][j] = Integer.ParseInt(KbInput.read());
		}//for (j)
	}//for (i)
}//fillMatrix

}//class
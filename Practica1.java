public class Practica1{
	public static void main(String args[]){
		boolean exit;
		byte resp;
		int[][] matrix = {
             {2000,4000,3000,2500,5000},
             {2000,3000,2000,2500,4500},
             {1200,5000,3200,4000,3000},
             {3000,2500,7000,2000,2550}
             };
		byte selec;
		do{
		cls();
		System.out.println("----------------------------------------------------");
		System.out.println("Practica 1 hecha en Java por Nestor Luis Tobon");
		System.out.println("Seleccione alguna opcion");
		System.out.println("1.- Ingresar nuevos datos a la Tabla");
		System.out.println("2.- Mostrar el numero de personas incritas en el mes");
		System.out.println("3.- Mostrar el numero de personas inscritas en cada semana");
		System.out.println("4.- Mostrar el dia mas efectivo");
		System.out.println("5.- Mostrar tabla por defecto");
		System.out.println("NOTA: Se utilizara la tabla por defecto si no se ingresan datos nuevos(opcion 1)");
		System.out.print("Seleccion: ");
		selec = Byte.parseByte(KbInput.read());
		cls();
		switch(selec){
		case 1:
			System.out.println("1.- Ingresar nuevos datos a la Matriz");
			int[][] matriz = new int[4][5];
			fillMatrix(matriz);
		case 2:
			

		default:
			System.out.println("Seleccion incorrecta");

		}//switch
		System.out.print("\n\nSi desea volver al menu presione 1 y luego Enter: ");
		resp = Byte.parseByte(KbInput.read());
		if (resp == 1){
			exit = true;
		}//end if
		else {
			exit = false;
		}// end else
		}while(exit);
	}//main

public static void initializeVector(int vector[]){
	for(int i = 0;i < 4;i++){
		vector[i] = 0;
	}//for (i)
}//inicializeVector

public static int 


public static void fillMatrix(int matrix[][]){
	for(int i = 0;i < 4;i++){
		for(int j = 0;j < 5;j++){
		System.out.print("\nElement[" + i +"][" + j + "] = ");
		matrix[i][j] = Integer.parseInt(KbInput.read());
		}//for (j)
	}//for (i)
}//fillMatrix - refinar!!

public static void cls(){
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
}//cls

}//class


/* El Consejo Nacional Electoral, organismo  encargado  de realizar los procesos
   electorales a nivel nacional, requiere conocer cierta información estadística
   del mes de mayo, respecto  al  número  de  inscritos. Dicho  organismo  desea
   cuantificar:
   => El número de personas inscritas en el mes
   => El número de personas inscritas cada una de las semanas del mes.
   => Y por último desea determinar cuál de los días de inscripción resulta  más
      efectivo, es decir, reporta mayor cantidad de inscritos
   => Los datos suministrados son:

     	LUNES	MARTES	MIÉRCOLES	JUEVES	VIERNES
   1	2000	4000		3000	 2500	 5000
   2	2000	3000		2000	 2500	 4500
   3	1200	5000		3200	 4000	 3000
   4	3000	2500		7000	 2000	 2550

*/
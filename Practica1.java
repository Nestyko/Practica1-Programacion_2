//import java.util.Vector;

public class Practica1{
	public static void main(String args[]){
		boolean exit = true;
		boolean jump = false;
		byte resp;
		final int[][] MATRIZ_ORIGINAL = {
             {2000,4000,3000,2500,5000},
             {2000,3000,2000,2500,4500},
             {1200,5000,3200,4000,3000},
             {3000,2500,7000,2000,2550}
             };
		int matriz[][] = MATRIZ_ORIGINAL;

		final String[] DIAS = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		final String[] DIAS_INI = {"LUN", "MAR" , "MIE", "JUE", "VIE" , "SAB" , "DOM"};
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
		System.out.println("5.- Mostrar tabla actual");
		System.out.println("6.- Cargar la tabla por defecto");
		System.out.println("NOTA: Se utilizara la tabla por defecto si no se ingresan datos nuevos(opcion 1)");
		System.out.print("Seleccion: ");
		selec = Byte.parseByte(KbInput.read());
		cls();
		switch(selec){
		case 1:
			System.out.println("1.- Ingresar nuevos datos a la Matriz");
			fillMatrix(matriz, DIAS);
			jump = true;
			break;
		case 2:
			System.out.println("2.- Mostrar el numero de personas incritas en el mes");
			System.out.println("\nTotal = " + totalMatrixSum(matriz));
			break;
		case 3:
			System.out.println("3.- Mostrar el numero de personas inscritas en cada semana \n");
			int[] semanaSum = new int[4];
			initializeVector(semanaSum);
			rowSum(matriz,semanaSum);
			for(int i = 0;i<4;i++){
			System.out.println("Semana " + i + ": " + semanaSum[i] + "\n");
			}//for (i)
			break;
		case 4:
			System.out.println("4.- Mostrar el dia mas efectivo \n");
			int[] diaSum = new int[5];
			columnSum(matriz,diaSum);
			System.out.println("El Dia mas efectivo es el " + DIAS[highestPos(diaSum)] +
			"\nCon un total de " + diaSum[highestPos(diaSum)] + " inscripciones en el mes");
			break;
			
		case 5:
			System.out.println("5.- Mostrar tabla actual");
			endl(1);
			printMatrix(matriz, DIAS_INI);
			break;
		case 6:
			for(int i = 0;i<4;i++){
				for(int j = 0;j<5;j++){
					matriz[i][j] = MATRIZ_ORIGINAL[i][j];
				}//end for(j)
			}//end for(i)
			
			System.out.println("6.- Tabla por defecto cargada exitosamente");
			break;

		default:
			System.out.println("Seleccion incorrecta");
			break;

		}//switch
		if(!jump){
		System.out.print("\n\nSi desea volver al menu presione 1 y luego Enter");
		System.out.println("\nDe lo Contrario Presione otro numero: ");
		resp = Byte.parseByte(KbInput.read());
		if (resp == 1){
			exit = true;
		}//end if
		else {
			exit = false;
		}// end else
		}//end if
		jump = false;
		}while(exit);
	}//main

public static void initializeVector(int vector[]){
	for(int i = 0;i < vector.length;i++){
		vector[i] = 0;
	}//for (i)
}//inicializeVector
//Coloca todos los valores del vector en 0

public static int totalMatrixSum(int matrix[][]){
	int sum = 0;
	for(int i = 0;i < 4;i++){
		for(int j = 0;j < 5;j++){
		sum += matrix[i][j];
		}//for (j)
	}//for (i)
	return sum;
}//totalMatrixSum
//Retorna el valor de la suma de cada elemento de la matriz


public static void fillMatrix(int matrix[][], String[] DIAS){
	for(int i = 0;i < 4;i++){
	System.out.println("Semana " + (i+1) + ": ");
	endl(1);
		for(int j = 0;j < 5;j++){
		System.out.print(DIAS[j]+"= ");
		//System.out.print("\nElement[" + i +"][" + j + "] = ");
		matrix[i][j] = Integer.parseInt(KbInput.read());
		endl(1);
		}//for (j)
	endl(1);
	}//for (i)
}//fillMatrix
//Permite al usuario introducir cada elemento de la matriz uno a uno

public static void cls(){
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
}//cls
//Inserta 30 lineas nuevas de modo que simule que limpia la pantalla

public static void columnSum(int matrix[][], int[] vector){
	for(int i = 0;i < 4;i++){
		for(int j = 0;j < 5;j++){
		vector[j] = matrix[i][j];
		}//for (j)
	}//for (i)
}//columnSum
//Sumatoria de columnas


public static void rowSum(int matrix[][], int[] vector){
	for(int i = 0;i < 4;i++){
		for(int j = 0;j < 5;j++){
		vector[i] = matrix[i][j];
		}//for (j)
	}//for (i)
}//rowSum
//Sumatoria de filas

public static short highestPos(int[] vector){
	short aux = 0;
	for(short i = 1;i < (vector.length)-1; i++){
		if(vector[aux] < vector[i] ){
			aux = i;
		}//if
	}//for (i)
	return aux;
}//highestPos
//returns La posicion que contiene el mayor valor del vector

public static void endl(int cant){
	if(cant >= 0){
	for(int i = 0; i < cant; i++){
		System.out.print("\n");
	}//for (i)
	}//end if
}//endl
//Agrega tantas lineas vacias como lo indique <cant>

public static void printMatrix(int[][] matrix, String[] DIAS_INI){
	System.out.print("          ");
	for(int i = 0;i<5;i++){
		System.out.print(DIAS_INI[i] + "\t");
	}//for(i)
	endl(1);
	for(int i = 0; i < 4;i++){
		System.out.print("Semana " + (i+1) + ": ");
		for(int j = 0;j < 5 ; j++){
			System.out.print(matrix[i][j] + "\t");
		}//end for(j)
	endl(1);
	}//end for(i)
}//printMatrix

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

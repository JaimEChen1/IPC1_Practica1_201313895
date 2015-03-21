import java.util.Scanner;

public class PracticaIPC {
	private Scanner teclado;
	
	public void menu(){
		teclado=new Scanner(System.in);
		int opcion;
		System.out.println("\n   PROBLEMAS NIVEL 1\n"
				+ "     1. PROBLEMA 1\n"
				+ "     2. PROBLEMA 2\n"
				+ "     3. PROBLEMA 3\n"
				+ "     4. PROBLEMA 4\n"
				+ "     5. PROBLEMA 5");
		System.out.println("\n   PROBLEMAS NIVEL 2\n"
				+ "     6. PROBLEMA 6\n"
				+ "     7. PROBLEMA 7\n"
				+ "     8. PROBLEMA 8\n"
				+ "     9. PROBLEMA 9\n"
				+ "    10. PROBLEMA 10\n"
				+ "    11. PROBLEMA 11\n"
				+ "    12. PROBLEMA 12\n"
				+ "    13. PROBLEMA 13\n"
				+ "    14. PROBLEMA 14\n"
				+ "    15. PROBLEMA 15\n");
		System.out.println("   PARA SALIR PRESIONE 0");
		System.out.print("\nElija el problema que quiere visualizar: ");
		opcion=teclado.nextInt();
		switch(opcion){
		case 1: problema01();; break;
		case 2: problema02(); break;
		case 3: problema03(); break;
		case 4: problema04(); break;
		case 5: problema05(); break;
		case 6: problema06(); break;
		case 7: problema07(); break;
		case 8: problema08(); break;
		case 9: problema09(); break;
		case 10: problema10(); break;
		case 11: System.out.println("PROBLEMA 11"); break;
		case 12: problema12(); break;
		case 13: problema13(); break;
		case 14: problema14(); break;
		case 15: problema15(); break;
		case 0: System.out.println("USTED VA A SALIR DE LA PRACTICA 1.\n"); break;
		default: System.out.println("NO EXITE ESE PROBLEMA."); menu(); break;
		}
	}
	
	public void submenu(){
		int subopcion;
		System.out.println("0. VOLVER AL MENU PRINCIPAL");
		subopcion=teclado.nextInt();
		switch(subopcion){
		case 1: problema01(); break;
		case 2: problema02(); break;
		case 3: problema03(); break;
		case 4: problema04(); break;
		case 5: problema05(); break;
		case 6: problema06(); break;
		case 7: problema07(); break;
		case 8: problema08(); break;
		case 9: problema09(); break;
		case 10: problema10(); break;
		case 11: System.out.println("PROBLEMA 11"); break;
		case 12: problema12(); break;
		case 13: problema13(); break;
		case 14: problema14(); break;
		case 15: problema15(); break;
		case 0: menu(); break;
		default: System.out.println("ESTA OPCION NO EXISTE."); submenu(); break;
		}
	}
	
	public void problema01(){
		System.out.println("\nPROBLEMA 01\n");
		for(int i=0;i<5;i++){
			for(int j=0;j<4-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=5-2;k>=0;k--){
			for(int j=0;j<4-k;j++){
				System.out.print(" ");
			}
			for(int i=0;i<2*k+1;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n1. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema02(){
		teclado=new Scanner(System.in);
		int nota, suma, media;
		suma=0;
		System.out.println("\nPROBLEMA 02\n");
		System.out.println("Ingrese las 6 notas del estudiante de IPC");
		for(int f=1;f<7;f++){
			System.out.print("Nota "+f+": ");
			nota=teclado.nextInt();
			if(nota>=0 && nota<=100){
				suma=suma+nota;
			} else{
				System.out.println("NOTA INCORRECTA");
				System.out.print("Vuelva a ingresar la ");
				f--;
			}
		}
		media=suma/6;
		System.out.println("La media es: "+media);
		if(media>=0 && media<=59){
			System.out.println("La puntuación es E.");
		}else{
			if(media>=60 && media<=69){
				System.out.println("La puntuación es D.");
			}else{
				if(media>=70 && media<=79){
					System.out.println("La puntucación es C.");
				}else{
					if(media>=80 && media<=89){
						System.out.println("La puntuación es B.");
					}
					else{
						System.out.println("La puntuación es A.");
					}
				}
			}
		}
		System.out.println("\n2. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema03(){
		teclado=new Scanner(System.in);
		String hora;
		int horas, minutos;
		System.out.println("\nPROBLEMA 03\n");
		do{
			System.out.print("Ingrese hora en formato 24 hrs.(Ej. 13:45): ");
			hora=teclado.next();
		} while(hora.length()<5);
		
		horas=Integer.parseInt(hora.substring(0,hora.indexOf(":")));
		minutos=Integer.parseInt(hora.substring(hora.indexOf(":")+1,hora.length()));
		if(minutos>=00 && minutos<60){
			if(horas==0){
				System.out.println((horas+12)+":"+minutos+" AM.");
			} else{
				if(horas>00 && horas<12){
					System.out.println(horas+":"+minutos+" AM.");
				} else{
					if(horas==12){
						System.out.println(horas+":"+minutos+" PM.");
					} else{
						if(horas>12 && horas<25){
							System.out.println((horas-12)+":"+minutos+" PM:");
						} else{
							System.out.println("HORA NO VALIDA");
						}
					}
				}
			} 
		} else{
			System.out.println("HORA NO VALIDA");
		}
		System.out.println("\n3. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema04(){
		teclado=new Scanner(System.in);
		String figura;
		double x, area, perimetro;
		System.out.println("\nPROBLEMA 04\n");
		System.out.println("Hallar área y perímetro de\n"
				+ "c. Círculo\n"
				+ "u. Cuadrado\n"
				+ "t. Triángulo");
		figura=teclado.next();
		switch(figura){
		case "c":
			System.out.println("Ingrese el radio del círculo: ");
			x=teclado.nextDouble();
			area=Math.PI * Math.pow(x, 2);
			perimetro=2 * Math.PI * x;
			System.out.println("El área del círculo es: "+area);
			System.out.println("El perímetro del círculo es: "+perimetro);
			break;
		case "u":
			System.out.println("Ingrese el lado del cuadrado: ");
			x=teclado.nextDouble();
			area=Math.pow(x, 2);
			perimetro=4*x;
			System.out.println("El área del cuadrado es: "+area);
			System.out.println("El perímetro del cuadrado es: "+perimetro);
			break;
		case "t":
			System.out.println("Ingrese el lado del triángulo equilatero: ");
			x=teclado.nextDouble();
			area=(Math.sqrt(3)/4)*x;
			perimetro=3*x;
			System.out.println("El area del triángulo es: "+area);
			System.out.println("El perimetro del triángulo es: "+perimetro);
			break;
		default: System.out.println("OPCION INCORRECTA"); break;
		}
		System.out.println("\n4. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema05(){
		teclado=new Scanner(System.in);
		String fecha1, fecha2;
		int dia1, dia2, mes1, mes2, anio1, anio2, diferencia;
		System.out.println("\nPROBLEMA 05\n");
		System.out.print("Ingrese fecha 1 (Ej. dd/mm/aa): ");
		fecha1=teclado.next();
		System.out.print("Ingrese fecha 2 (Ej. dd/mm/aa): ");
		fecha2=teclado.next();
		dia1=Integer.parseInt(fecha1.substring(0,2));
		mes1=Integer.parseInt(fecha1.substring(3,5));
		anio1=Integer.parseInt(fecha1.substring(6,fecha1.length()));
		dia2=Integer.parseInt(fecha2.substring(0,2));
		mes2=Integer.parseInt(fecha2.substring(3,5));
		anio2=Integer.parseInt(fecha2.substring(6,fecha2.length()));
		if(dia1<31 && dia2<31 && mes1<13 && mes2<13){
			diferencia=(dia2-dia1)+(30*(mes2-mes1))+(360*(anio2-anio1));
			System.out.println("Número de dias que hay de diferencia: "+diferencia);
		} else{
			System.out.println("FEHA(S) INCORRECTA(S)");
		}
		System.out.println("\n5. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema06(){
		teclado=new Scanner(System.in);
		String operacion;
		float num1, num2;
		System.out.println("\nPROBLEMA 06\n");
		System.out.println("Ingrese dos números cualesquiera: ");
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		System.out.println("Que quiere hacer:\n"
				+ "s. Sumar\n"
				+ "r. Resta\n"
				+ "m. Multiplicar\n"
				+ "d. Dividir");
		operacion=teclado.next();
		switch(operacion){
		case "s": System.out.println("La suma es: "+(num1+num2)); break;
		case "r": System.out.println("La diferencia es: "+(num1-num2)); break;
		case "m": System.out.println("El producto es: "+(num1*num2)); break;
		case "d": System.out.println("El cociente es: "+(num1/num2)); break;
		default: System.out.println("Esa opcion no existe.");
		}
		System.out.println("\n6. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema07(){
		teclado=new Scanner(System.in);
		int num, i;
		i=10;
		System.out.println("\nPROBLEMA O7\n");
		System.out.print("Ingrese un número entre 0 y 10: ");
		num=teclado.nextInt();
		if(num>=0 && num<=10){
			for(int j=num*10;j>0;j=j-num){
				System.out.println(num+" * "+i+" = "+j);
				i--;
			}
		} else{
				System.out.println("Número fuera de rango.");
			}
		System.out.println("\n7. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema08(){
		teclado=new Scanner(System.in);
		String Unidad[]={"CERO", "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
				"OCHO", "NUEVE", "DIEZ"};
		String Especial[]={"ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS",
				"DIECISIETE", "DIECIOCHO", "DIECINUEVE"};
		String Decena[]={"VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA",
				"SETENTA", "OCHENTA", "NOVENTA"};
		System.out.println("\nPROBLEMA 08\n");
		System.out.print("Ingrese el limite inferior (0-100): ");
		int inferior=teclado.nextInt();
		System.out.print("Ingrese el limite superior (0-100): ");
		int superior=teclado.nextInt();
		if(inferior>=0 && inferior<=100 && superior>=0 && superior<=100){
			int num=(int)(Math.random()*(superior-inferior+1)+inferior);
			int u=num%10;
			int d=num/10;
			if(num>=0 && num<11){
				System.out.println(Unidad[num]);
			}else{
				if(num<20){
					System.out.println(Especial[num-11]);
				}else{
					if(num<100){
						if(u==0){
							System.out.println(Decena[d-2]);
						}else{
							System.out.println(Decena[d-2]+" Y "+Unidad[u]);
						}
					}
				}
			}
		}else{
			System.out.println("LIMITE(S) INCORRECTOS(S)");
		}
		System.out.println("\n8. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema09(){
		teclado=new Scanner(System.in);  
	      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
	      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
	      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	      String Mil[]={"", "M", "MM", "MMM"};
	      System.out.println("\nPROBLEMA 09\n");
	      System.out.print("Ingrese un número entre 1 y 3999: ");  
	      int num=teclado.nextInt();  
	      int u=num%10;  
	      int d=(num/10)%10;  
	      int c=(num/100)%10;
	      int m=num/1000;
	      if(num>999 && num<4000){
	    	  System.out.println(Mil[m]+Centena[c]+Decena[d]+Unidad[u]);
	      }else{
	    	  if(num>99 && num<1000){           
		          System.out.println(Centena[c]+Decena[d]+Unidad[u]);  
		      }else{  
		          if(num>9 && num<100){  
		              System.out.println(Decena[d]+Unidad[u]);            
		          }else{
		        	  if(num>0 && num<10){
		        		  System.out.println(Unidad[num]);  
		        	  }else{
		        		  System.out.println("NUMERO MUY GRANDE");
		        	  }
		          }            
		      }
	      }
	      System.out.println("\n9. REPETIR PROBLEMA");
			submenu();
	}
	
	public void problema10(){
		teclado=new Scanner(System.in);
		int filas;
		System.out.println("\nPROBLEMA 10\n");
		System.out.print("Ingrese el numero de filas para la piramide: ");
		filas=teclado.nextInt();
		for (int i=1; i<=filas; i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for (int k=filas; k>i-1; k--){
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		System.out.println("\n10. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema12(){
		teclado=new Scanner(System.in);
		String palabra;
		System.out.println("\nPROBLEMA 12\n");
		System.out.println("Ingrese una palabra: ");
		palabra=teclado.nextLine();
		for(int i=0;i<palabra.length();i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.println(palabra);
		System.out.println("\n12. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema13(){
		teclado=new Scanner(System.in);
		String letra, otraletra;
		System.out.println("\nPROBLEMA 13\n");
		System.out.print("Ingrese una letra: ");
		letra=teclado.next();
		do{
			System.out.print("Ingrese otra letra: ");
			otraletra=teclado.next();
			if(otraletra.charAt(0)<letra.charAt(0)){
				System.out.println("Después");
			}else{
				if(otraletra.charAt(0)>letra.charAt(0)){
					System.out.println("Antes");
				}
			}
		}while(letra.charAt(0)!=otraletra.charAt(0));
		System.out.println("Las letras son iguales.");
		System.out.println("USTED ACERTÓ.");
		System.out.println("\n13. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema14(){
		teclado=new Scanner(System.in);
		int lado;
		System.out.println("\nPROBLEMA 14\n");
		System.out.print("Ingrese el lado del cuadrado: ");
		lado=teclado.nextInt();
		for(int i=1;i<=lado;i++){
			for(int j=1;j<=lado;j++){
				if(j==1 || j==lado || i==1 || i==lado){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n14. REPETIR PROBLEMA");
		submenu();
	}
	
	public void problema15(){
		teclado=new Scanner(System.in);  
        int modulo,num,primos;
        primos=0;
        System.out.println("\nPROBLEMA 15\n");
        System.out.print("Ingrese número: ");  
        num=teclado.nextInt();
        for(int n=num;n>0;n--){
        	modulo=0;
        	for(int i=1;i<=n;i++){  
                if(n%i==0){  
                    modulo++;  
                   }  
                }
        	if(modulo==2){  
                  primos++;
              }
        } 
        System.out.println("La cantidad de números primos entre 1 y "+num+" es: "+primos);
        System.out.println("\n15. REPETIR PROBLEMA");
        submenu();
	}

	public static void main(String[] args){
		PracticaIPC practica=new PracticaIPC();
		System.out.println("PRACTICA 1");
			practica.menu();
	}
		
}

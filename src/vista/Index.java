package vista;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.swing.text.AbstractDocument.BranchElement;

import calculadora.Calculadora;
import tienda.Cliente;
import tienda.Producto;

public class Index {

	public static void main(String[] args) {
		Integer menu = 0;
		Integer submenu = 0;
		Integer subsubmenu = 0;
		Integer contador = 0 ;
		String categoria = "";
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println("-------------mennu--------------");
			System.out.println("Calculadora -------------------:1");
			System.out.println("Tienda      -------------------:2");
			System.out.println("Salir 	    -------------------:0");
			menu= leer.nextInt();
			
			switch (menu) {
			
			case 1:
				//Ejercicio numero 1 
					String num1 = "", num2 = "";
					do {
					System.out.println("----- CALCULADORA --------");
					System.out.println("Sumar       ------------: 1");
					System.out.println("Restar      ------------: 2");
					System.out.println("Multiplicar ------------: 3");
					System.out.println("Dividir     ------------: 4");
					System.out.println("Salir       ------------: 0"); 
					submenu = leer.nextInt();
						do {
							System.out.print("Ingrese primer  valor : ");
							num1 = leer.next();	
						}while(Calculadora.validar(num1)!=true);
						
					     do {
								System.out.print("Ingrese segundo valor : ");
								num2 = leer.next(); 
					     }while(Calculadora.validar(num2)!=true);
							
						System.out.println("-------------------------");
					
					switch (submenu) {
					case 1:
						System.out.println("Total----------------:"+Calculadora.sumar(Double.parseDouble(num1) ,Double.parseDouble(num2)));
						break;
					case 2:
						 System.out.println("Total----------------:"+Calculadora.restar(Double.parseDouble(num1) ,Double.parseDouble(num2)));
						break;
					case 3:
						 System.out.println("Total----------------:"+Calculadora.multiplicar(Double.parseDouble(num1) ,Double.parseDouble(num2)));
						break;
					case 4:
						if(Double.parseDouble(num2) != 0 ) {
							System.out.println("Total----------------:"+Calculadora.dividir(Double.parseDouble(num1) ,Double.parseDouble(num2)));
						}else {
							System.err.print("No se puede dividir entre 0");
						}
						 
						break;
	
					default:
						break;
					}
					}while(submenu != 0);
		      break;
			
			case 2:
				ArrayList<Producto> listPro = new  ArrayList<>();
			
				Cliente objClie = new Cliente();
				
				//Ejercicio nnumero 2
				do {
					System.out.println("-------------- TIENDA  --------------");
					System.out.println("Registrar un cliente   ------------: 1");
					System.out.println("Nueva venta            ------------: 3");
					System.out.println("Salir                  ------------: 0");
					submenu = leer.nextInt();
					switch (submenu) {
					case 1:
						System.out.print("Ingrese nombre del cliente  --------: ");
						objClie.setNombre(leer.next());
						break;
					case 2:
						
						break;
					case 3:
						
							do {
								System.out.println("---------------- NUEVA VENTA  ------------------");
								System.out.println("Listar  productos                ------------: 1");
								System.out.println("Agregar venta                    ------------: 2");
								System.out.println("totalizar                        ------------: 3");
								System.out.println("Salir                            ------------: 0");
								subsubmenu = leer.nextInt();
								
								switch (subsubmenu) {
								case 1:
									contador = 0;
									for(Producto p : listPro) {
										contador ++;
										System.out.println(contador+"      " + p.getNombre() +"       "+p.getCategoria()+"       "+ +p.getPrecio());
									}
									break;
								case 2:
									Producto objPro = new Producto();
									System.out.print("Ingrese nombre del producto    --------: ");
									objPro.setNombre(leer.next());
									do {
										System.out.println("Elija entre las siguientes categorias [frutas, verduras, carnes, Lacteos, Granos_básicos , otros]");
										System.out.print("Ingrese categoria del producto --------: ");
										categoria = leer.next();
										objPro.setCategoria(categoria);
									}while(!(categoria.equals("frutas") || categoria.equals("verduras") || categoria.equals("carnes") || categoria.equals("Lacteos") || categoria.equals("Granos_básicos") || categoria.equals("otros"))) ;

									System.out.print("Ingrese categoria del precio   --------: ");
									objPro.setPrecio(leer.nextFloat());
									listPro.add(objPro);
														
									break;
								case 3: 
									double catOtros = 0 , 
										   catPro = 0 , 
										   total= 0 ,
										   acumulador = 0, 
										   subt = 0,
										   descuento = 0;
									System.out.println( "NOMBRE DEL CLIENTE "+objClie.getNombre());
									for(Producto p : listPro) {
										if(p.getCategoria().equals("otros")) {
											catOtros = catOtros + p.getPrecio();
										}else {
											catPro = catPro + p.getPrecio();
										}
										subt = subt+p.getPrecio();
										System.out.println(p.getNombre()+"     "+p.getCategoria()+"    "+p.getPrecio());
										
									}
									System.out.println("sub total :  " + acumulador);
									if(catPro >= 20 && catPro < 50 ) {
										System.out.println("descuuento del 5% "+(subt*0.05));
										System.out.println("Total es "+(subt-(subt*0.05)));
									}else if(catPro >= 50) {
										System.out.println("descuuento del 7% "+(subt*0.07));
										System.out.println("Total es "+(subt-(subt*0.07)));
									}else {
										System.out.println("sin descuento :(");
										System.out.println("Total es "+subt);
									}
									
									
									break;
									
								default:
									break;
								}
								
							} while(subsubmenu !=0 );
						break;

					default:
						break;
					}
					
					
				}while(submenu != 0);
				
				
				break;
				

			default:
				break;
			}
			
		}while(menu !=0);
	}

}

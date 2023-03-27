package org.example;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import modelo.Pronostico;
import modelo.Resultado;


public class Main {

	public static void main(String[] args) {
		//En la variable args va a viajar la ruta del archivo que queremos que abra el programa
		if(args.length == 0){
			System.out.println("ERROR: No ingresaste ningun archivo como argumento!");
			System.exit(88);
		}
		List <Resultado> listaResultados;
		List <Pronostico> listaPronosticos;
		
		int puntajeTotal = 0;
		// En esta primera línea definimos el archivos que va a ingresar
		
		try {
			listaResultados = new CsvToBeanBuilder(new FileReader(args[0]))     
					   // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
					.withType(Resultado.class)
					.build()
					.parse();

			listaPronosticos = new CsvToBeanBuilder(new FileReader(args[1]))                   
					.withType(Pronostico.class)
					.build()
					.parse();

			 //El resultado de este método nos da una lita del objetos
			for (Resultado resultado : listaResultados) {
				String ganador;
				String gana = "x";				
				String empateEq1Eq2= "x";
							

				if(resultado.getGolesDelEquipo1() > resultado.getGolesDelEquipo2()) {
					ganador = resultado.getEquipo1();					
					System.out.println("El ganador del partido es "+ ganador);

					for (Pronostico pronostico : listaPronosticos) {
						if(pronostico.getGana1().equals(gana)) {
							puntajeTotal++;							
						}
					}	

				} else if (resultado.getGolesDelEquipo1() < resultado.getGolesDelEquipo2()){
					ganador = resultado.getEquipo2();    					
					System.out.println("El ganador del partido es "+ ganador);

					for (Pronostico pronostico : listaPronosticos) {
						if(pronostico.getGana2().equals(gana)) {
							puntajeTotal++;
						}
					}
					
				}else { 					
					System.out.println("El partido entre "+resultado.getEquipo1()+" vs "+resultado.getEquipo2()+" termino en empate");

					for (Pronostico pronostico : listaPronosticos) {
						if(pronostico.getEmpata().equals(empateEq1Eq2)) {
							puntajeTotal++;							       			
						}
					}
				}		
				
			}			

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("el puntaje total obtenido por  segun los partidos acertados hasta el momento es "+ puntajeTotal);
	}


}


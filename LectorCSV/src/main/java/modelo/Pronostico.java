package modelo;

import com.opencsv.bean.CsvBindByPosition;


public class Pronostico {
	
	@CsvBindByPosition(position = 0)
	private String Participante;
	
    @CsvBindByPosition(position = 1)
    private String equipo1;
    
    @CsvBindByPosition(position = 2)
    private String Gana1;
    
    @CsvBindByPosition(position = 3)
    private String Empata;
    
    @CsvBindByPosition(position = 4)
    private String Gana2;
    
    @CsvBindByPosition(position = 5)
    private String equipo2;

	public String getParticipante() {
		return Participante;
	}

	public void setParticipante(String participante) {
		Participante = participante;
	}

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public String getGana1() {
		return Gana1;
	}

	public void setGana1(String gana1) {
		Gana1 = gana1;
	}

	public String getEmpata() {
		return Empata;
	}

	public void setEmpata(String empata) {
		Empata = empata;
	}

	public String getGana2() {
		return Gana2;
	}

	public void setGana2(String gana2) {
		Gana2 = gana2;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
    

	}
	

	



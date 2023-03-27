package modelo;

import java.time.LocalDate;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class Pronostico {
    @CsvBindByPosition(position = 0)
    private String equipo1;
    
    @CsvBindByPosition(position = 1)
    private String Gana1;
    
    @CsvBindByPosition(position = 2)
    private String Empata;
    
    @CsvBindByPosition(position = 3)
    private String Gana2;
    
    @CsvBindByPosition(position = 4)
    private String equipo2;
    

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public String getGana1()  {
		return Gana1;
	}
    public void setGana1(String Gana1) {
    	this.Gana1= Gana1;
    }
    public String getEmpata()  {
		return Gana1;
	}
    public void setEmpata(String Empata) {
    	this.Empata= Empata;
    }
    public String getGana2()  {
		return Gana2;
	}
    public void setGana2(String Gana2) {
    	this.Gana2= Gana2;
    }

    
	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
}
    



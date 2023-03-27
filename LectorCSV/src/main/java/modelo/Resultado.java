package modelo;

import java.time.LocalDate;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class Resultado {
    @CsvBindByPosition(position = 0)
    private String equipo1;
    
    @CsvBindByPosition(position = 1)
    private Integer golesDelEquipo1;
    
    @CsvBindByPosition(position = 2)
    private Integer golesDelEquipo2;
    
    @CsvBindByPosition(position = 3)
    private String equipo2;

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public Integer getGolesDelEquipo1() {
		return golesDelEquipo1;
	}

	public void setGolesDelEquipo1(Integer golesDelEquipo1) {
		this.golesDelEquipo1 = golesDelEquipo1;
	}

	public Integer getGolesDelEquipo2() {
		return golesDelEquipo2;
	}

	public void setGolesDelEquipo2(Integer golesDelEquipo2) {
		this.golesDelEquipo2 = golesDelEquipo2;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
}
    

   
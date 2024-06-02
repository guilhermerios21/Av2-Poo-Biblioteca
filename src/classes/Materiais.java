package classes;
import java.time.*;

public class Materiais {
	private int codigo;
	private String desc;

	public Materiais(int codigo, String desc) {
		this.codigo = codigo;
		this.desc = desc;
	}
	
	public void listarInfo() {
		System.out.println("codigo: " + this.codigo);
		System.out.println("descrição: " + this.desc);
	}
	
	public int calcMulta(LocalDate diaEmp, LocalDate diaDev) {
		return 0;
	}
	
}

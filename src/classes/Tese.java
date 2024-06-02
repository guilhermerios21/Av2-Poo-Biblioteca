package classes;
import java.time.*;

public class Tese extends Materiais {
	private int anoAprv;

	public Tese(int codigo, String desc, int anoAprv) {
		super(codigo, desc);
		this.anoAprv = anoAprv;
	}

	public int getAnoAprv() {
		return anoAprv;
	}

	public void setAnoAprv(int anoAprv) {
		this.anoAprv = anoAprv;
	}
	
	@Override
	public int calcMulta(LocalDate diaEmp, LocalDate diaDev) {
		int diaTot = diaDev.compareTo(diaEmp);
		if(diaTot > 10 && diaTot <= 15) {
			return (diaTot - 10) * 10;
		}
		else if(diaTot > 15) {
			return 100;
		}
		else return 0;
	}
	
	@Override
	public void listarInfo() {
		System.out.println("Material; Tese de doutorado");
		super.listarInfo();
		System.out.println("Ano de aprovação: "+ this.anoAprv);
	}
}

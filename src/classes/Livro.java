package classes;
import java.time.*;

public class Livro extends Materiais {
	private int anoLanc;

	public Livro(int codigo, String desc, int anoLanc) {
		super(codigo, desc);
		this.anoLanc = anoLanc;
	}

	public int getAnoLanc() {
		return anoLanc;
	}

	public void setAnoLanc(int anoLanc) {
		this.anoLanc = anoLanc;
	}
	
	@Override
	public int calcMulta(LocalDate diaEmp, LocalDate diaDev) {
		int diaTot = diaDev.compareTo(diaEmp);
		if(diaTot > 5 && diaTot <= 8) {
			return (diaTot - 5) * 5;
		}
		else if(diaTot > 5 && diaTot > 8) {
			return (diaTot - 5) * 7;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public void listarInfo() {
		System.out.println("Material: livro"); 
		super.listarInfo();
		System.out.println("Ano de lançamento: "+ this.anoLanc);
	}
}

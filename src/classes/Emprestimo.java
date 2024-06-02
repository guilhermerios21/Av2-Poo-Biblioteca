package classes;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;

public class Emprestimo {
	private int numero;
	private LocalDate dataEmp;
	private LocalDate dataDev = null;
	private ArrayList<Materiais> mats = new ArrayList<Materiais>();
	
	public Emprestimo(int numero, LocalDate dataEmp, ArrayList<Materiais> mats) {
		this.numero = numero;
		this.dataEmp = dataEmp;
		this.mats = mats;
	}
	
	
	public void setDevolução(LocalDate dataDev) {
		this.dataDev = dataDev;
	}
	
	public int multaTotal(LocalDate diaEmp, LocalDate diaDev) {
		int multa = 0;
		for(Materiais a : mats) {
			multa += a.calcMulta(diaEmp, diaDev);
		}
		return multa;
	}
	
	
	public void imprimeEmprestimo() {
		System.out.println("numero do emprestimo: "+ this.numero);
		System.out.println("data do emprestimo: "+ dataEmp.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("---------------------------------------");
		if(dataDev != null) {
			System.out.println("data da devolução: "+ dataDev.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			System.out.println("Multa: "+ multaTotal(dataEmp, dataDev) + " reais");
			System.out.println("---------------------------------------");
		}
		else {
			System.out.println("Materiais não devolvidos!!!");
		}
		
		for(Materiais a: mats) {
			a.listarInfo();
			System.out.println("---------------------------------------");
		}
		
	}
	
}

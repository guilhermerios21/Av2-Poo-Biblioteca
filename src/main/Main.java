package main;
import classes.*;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		ArrayList<Materiais> mats = new ArrayList<Materiais>();
		
		mats.add(new Livro(187, "frankenstein", 1818));
		mats.add(new Tese (135, "os impactos de sofrer por ex na sociedade contemporanea", 2021));
		mats.add(new Livro(233, "diario de um banana 8", 2012));
		
		LocalDate dataEmp = LocalDate.parse("2024-05-14");
		LocalDate dataDev = dataEmp.plusDays(14);
		
		Emprestimo e1 = new Emprestimo(54, dataEmp, mats);
		
		e1.setDevolução(dataDev);
		e1.imprimeEmprestimo();
	}
}

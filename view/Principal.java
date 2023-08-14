package view;
import controller.CalculaSerie;
public class Principal {

	public static void main(String[] args) {
		CalculaSerie cs = new CalculaSerie();
		double somaSerie = cs.somaSerie(7);
		System.out.println("A soma da série se da por: "+ somaSerie);
	}

}

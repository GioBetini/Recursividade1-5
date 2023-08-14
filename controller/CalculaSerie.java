package controller;

public class CalculaSerie {

	public CalculaSerie() {
		super();
	}

	public double somaSerie(int num) {
		// quando o num for 1 a recursão se encerra
		if (num == 1) {
			return 1.0;
		}
		
		//chamamos a recursão enquanto decrementamos o num
		return 1.0/(double)num +somaSerie(num-1);
	}

}

package desafioJava;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static int toOrderNumbers(int number) {
		String valorAtual = "";
		int totalNumRep = 0;

		String numString = Integer.toString(number);
		String auxString = String.join("-", numString.split(""));

		String[] arrOfStr = auxString.split("-");
		List<Integer> numConvert = new ArrayList<>();

		for (int i = 0; i < arrOfStr.length; i++) {

			numConvert.add(Integer.parseInt(arrOfStr[i]));

		}

		int i = 0;
		while (!numConvert.isEmpty()) {
			boolean alterarIncrement = true;
			for (int j = 0; j < numConvert.size(); j++) {
				
				if (numConvert.get(i) <= numConvert.get(j)) {

					totalNumRep++;
				}
			}

			if (totalNumRep == numConvert.size()) {
				valorAtual += Integer.toString(numConvert.get(i));
				numConvert.remove(i);
				i = 0;
				alterarIncrement = false;
				

			}
			if (alterarIncrement) {
				i++;
			}
			totalNumRep = 0;
			
		
		}
		number = Integer.parseInt(valorAtual);

		
		return number;
	}

	public static void main(String[] args) {

		int orderNumber = 987454438;

		int result = toOrderNumbers(orderNumber);

		System.out.println(result);

	}

}

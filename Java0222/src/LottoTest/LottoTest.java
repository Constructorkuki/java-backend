package LottoTest;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size() < 6) {
			Random random = new Random();
			int randomNumber = random.nextInt(45) + 1;
			lotto.add(randomNumber);
		}
		
		System.out.println(lotto.toString());
	}

}

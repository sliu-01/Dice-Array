
public class DiceArrayMain {

	public static void main(String[] args) {
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		
		int[] roll = new int[1000];
		int[] counter = new int[11];
		
		for (int i = 0; i < 1000; i++)
		{
			int currentRoll = die1.roll() + die2.roll();
			roll [i] = currentRoll;
			
			for (int j = 0; j < 11; j++)
			{
				if (currentRoll - 2 == j)
				{
					counter[j] ++;
				}
			}
			
			
		}
		
		for (int i = 0; i < 11; i++)
		{
			System.out.printf("%-2s: %3d\n", (i+2), counter[i]);
		}

	}

}

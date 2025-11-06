// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1])/100;
		int n = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow(rate+1,n);

		System.out.println("After "+ n + " years, $" + currentValue + " saved at " + rate*100 + "% will yield $" + (int) futureValue);
			//After 2 years, $100 saved at 10.0% will yield $121

	}
}
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Design patterns used: Strategy Design Pattern, Adapter Design Pattern
		
		/**
		 * Data preparation step. It is assumed as data retrieved from a database
		 * Finally, rows retrieved from the database is stored in array list 'items' 
		 */
		ArrayList<PortfolioItem> items = new ArrayList<PortfolioItem>();
		items.add(new PortfolioItem("0001", 1, "BIREYSEL", 0.02565, 0.0526, 0.052, 15.52, 0.028, 0, 0 , 4321.56, 3216.293));
		items.add(new PortfolioItem("0002", 2, "BIREYSEL", 0.02565, 0.0526, 0.052, 18.52, 0, 0, 0.0025, 4701.324, 4623.45847));
		items.add(new PortfolioItem("0002", 3, "BIREYSEL", 0.02565, 0.00526, 0.0052, 15.52, 0, 0, 0.0017, 4321.56, 3216.293));
		items.add(new PortfolioItem("0003", 1, "KURUMSAL", 0.02565, 0.00526, 0.0052, 15.52, 0.028, 123.45, 0.0017, 4321.56, 3216.293));
		items.add(new PortfolioItem("0004", 2, "KURUMSAL", 0.02565, 0.00526, 0.0052, 15.52, 0.13, 135.14, 0.0017, 4321.56, 3216.293));
		items.add(new PortfolioItem("0005", 3, "KURUMSAL", 0.02565, 0.00526, 0.0052, 15.52, 0.18, 183.01, 0.0017, 4321.56, 3216.293));

		/**
		 * Strategies for items that retrieved from the database are assigned by their attributes 'INSTTYPE' and 'STAGE'
		 */
		Portfolio port = new Portfolio();
		
		for(int i=0;i<items.size();i++) {
			PortfolioItem item = items.get(i);
			PortfolioItemAdapter itemAdapter = null;
			if ((item.getStage() == 1 || item.getStage() == 2) && (item.getInsttype().equals("BIREYSEL"))){
				itemAdapter = new PortfolioItemAdapter(item, new PerformingStrategy(), StrategyTypes.PERFORMING_MG);
			} else if ((item.getStage() == 1 || item.getStage() == 2) && (item.getInsttype().equals("KURUMSAL"))) {
				itemAdapter = new PortfolioItemAdapter(item, new PerformingCorpStrategy(), StrategyTypes.PERFORMING_CORP_MG);
			} else if (item.getStage() == 3) {
				itemAdapter = new PortfolioItemAdapter(item, new NonperformingStrategy(), StrategyTypes.NONPERFORMING_MG);
			}
			port.addItem(itemAdapter);
		}
		
		/**
		 * ECL (Expected Credit Loss) Calculation part
		 */
		ECLCalculator calculator = new ECLCalculator(port);
		ArrayList<Double> results = calculator.calculate();
		
		/**
		 * Results
		 */
		for(int i = 0; i<results.size();i++) {
			System.out.println(port.getItem(i).toString() + " | ECL Result: " + String.valueOf(results.get(i))); 
		}
	}

}

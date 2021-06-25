import java.util.ArrayList;

public class ECLCalculator {
	private Portfolio port;
	public ECLCalculator(Portfolio port) {
		this.port = port;
	}
	
	public void setPortfolio(Portfolio port) {
		this.port = port;
	}
	
	public ArrayList<Double> calculate(){
		ArrayList<Double> results = new ArrayList<Double>();
		PortfolioItemAdapter currentItem = this.port.getNext();
		while(currentItem != null) {
			results.add(currentItem.getStrategy().method(currentItem));
			currentItem = this.port.getNext();
		}
		return results;
	}
}

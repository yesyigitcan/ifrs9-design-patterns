import java.util.ArrayList;

public class Portfolio {
	private ArrayList<PortfolioItemAdapter> portfolioList = new ArrayList<PortfolioItemAdapter>();
	private int currentIndex = 0;
	
	public void addItem(PortfolioItemAdapter item) {
		portfolioList.add(item);
	}
	
	public PortfolioItemAdapter getNext() {
		if (currentIndex >= this.portfolioList.size()){
			currentIndex = 0;
			return null;
		}
		PortfolioItemAdapter currentItem = portfolioList.get(currentIndex);
		currentIndex = currentIndex + 1;
		return currentItem;	
	}
	
	public int size() {
		return this.portfolioList.size();
	}
	
	public PortfolioItemAdapter getItem(int index) {
		return this.portfolioList.get(index);
	}
}

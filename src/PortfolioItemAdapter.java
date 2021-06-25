
public class PortfolioItemAdapter {
	private PortfolioItem item;
	private IComputationStrategy strategy;
	private StrategyTypes strategyType;
	
	public PortfolioItemAdapter(PortfolioItem item, IComputationStrategy strategy, StrategyTypes type) {
		this.item = item;
		this.strategy = strategy;
		this.strategyType = type;
	}
	
	public PortfolioItem getItem() {
		return this.item;
	}
	
	public IComputationStrategy getStrategy() {
		return this.strategy;
	}
	
	public String toString() {
		return this.item.toString() + " | Strategy " +  this.strategyType;
	}
}

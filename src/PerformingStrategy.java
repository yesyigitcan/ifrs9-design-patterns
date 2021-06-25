
public class PerformingStrategy implements IComputationStrategy {

	@Override
	public double method(PortfolioItemAdapter item) {
		// TODO Auto-generated method stub
		double pd_value_m3 = item.getItem().getC_month3faizusd() * item.getItem().getMonth3faizusd();
		double pd_value_gsyh = item.getItem().getC_gsyh() * (item.getItem().getGsyh1() / item.getItem().getGsyh2());
		double pd_value = item.getItem().getIntercept() + pd_value_m3 + pd_value_gsyh;
		return pd_value * item.getItem().getPd12m();
	}

}

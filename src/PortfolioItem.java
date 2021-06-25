
public class PortfolioItem {
	private String instid;
	private int stage;
	private String insttype;
	private double pd12m;
	private double intercept;
	private double month3faizusd;
	private double c_month3faizusd;
	private double c_gsyh;
	private double c_mev1yfaiz;
	private double mev1yfaiz;
	private double gsyh1;
	private double gsyh2;
	
	public PortfolioItem(String instid, int stage, String insttype, double pd12m, double intercept, double c_month3faizusd, double month3faizusd, double c_mev1yfaiz, double mev1yfaiz, double c_gsyh, double gsyh1, double gsyh2) {
		this.instid = instid;
		this.stage = stage;
		this.insttype = insttype;
		this.pd12m = pd12m;
		this.intercept = intercept;
		this.c_month3faizusd = c_month3faizusd;
		this.month3faizusd = month3faizusd;
		this.c_gsyh = c_gsyh;
		this.gsyh1 = gsyh1;
		this.gsyh2 = gsyh2;
		this.c_mev1yfaiz = c_mev1yfaiz;
		this.mev1yfaiz = mev1yfaiz;
	}
	public double getC_mev1yfaiz() {
		return c_mev1yfaiz;
	}
	public void setC_mev1yfaiz(double c_mev1yfaiz) {
		this.c_mev1yfaiz = c_mev1yfaiz;
	}
	public double getMev1yfaiz() {
		return mev1yfaiz;
	}
	public void setMev1yfaiz(double mev1yfaiz) {
		this.mev1yfaiz = mev1yfaiz;
	}
	public double getC_gsyh() {
		return c_gsyh;
	}
	public void setC_gsyh(double c_gsyh) {
		this.c_gsyh = c_gsyh;
	}
	public double getC_month3faizusd() {
		return c_month3faizusd;
	}
	public void setC_month3faizusd(double c_month3faizusd) {
		this.c_month3faizusd = c_month3faizusd;
	}
	public double getPd12m() {
		return pd12m;
	}
	public void setPd12m(double pd12m) {
		this.pd12m = pd12m;
	}
	public double getIntercept() {
		return intercept;
	}
	public void setIntercept(double intercept) {
		this.intercept = intercept;
	}
	public double getMonth3faizusd() {
		return month3faizusd;
	}
	public void setMonth3faizusd(double month3faizusd) {
		this.month3faizusd = month3faizusd;
	}
	public double getGsyh1() {
		return gsyh1;
	}
	public void setGsyh1(double gsyh1) {
		this.gsyh1 = gsyh1;
	}
	public double getGsyh2() {
		return gsyh2;
	}
	public void setGsyh2(double gsyh2) {
		this.gsyh2 = gsyh2;
	}
	public String getInstid() {
		return instid;
	}
	public void setInstid(String instid) {
		this.instid = instid;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public String getInsttype() {
		return insttype;
	}
	public void setInsttype(String insttype) {
		this.insttype = insttype;
	}
	public String toString() {
		return "Object " + this.instid + " | Insttype: " + this.insttype + " | Stage: " + String.valueOf(this.stage);
	}
	
}

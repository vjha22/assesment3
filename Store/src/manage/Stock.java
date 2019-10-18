package manage;

public class Stock {
	private int code;
	private String name;
	private float cost;
	private int quant;
	
	
	public Stock(int code, String name, float cost, int quant) {
		super();
		this.code = code;
		this.name = name;
		this.cost = cost;
		this.quant = quant;
	}
	public int getcode() {
		return code;
	}
	public void setcode(int code) {
		this.code = code;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	@Override
	public String toString() {
		return "Stock [code=" + code + ", name=" + name + ", cost=" + cost + ", quant=" + quant
				+ "]";
	}
	

}
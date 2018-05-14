package java02;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;

	public WuMingFen() {
		this.theMa = "麻辣";
		this.quantity = 2;
		this.likeSoup = true;
	}

	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		super();
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}

	public void check() {
		System.out.println(
				"面码:" + this.theMa + "\n粉的分量:" + this.quantity + "两" + "是否带汤:" + ((this.likeSoup == true) ? "是" : "否"));
	}
}

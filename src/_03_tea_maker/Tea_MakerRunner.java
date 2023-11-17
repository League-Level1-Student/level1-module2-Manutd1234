package _03_tea_maker;

public class Tea_MakerRunner {
	public final static String GREEN = "Green";
	private String flavor;
	Tea_MakerRunner(String flavor) {
		
		this.flavor = flavor;
		void boil() {
			this.water.isHot = true;
		}
		class Water {

			private boolean isHot = false;

			public boolean isHot() {
				return this.isHot;
			}
	}
}

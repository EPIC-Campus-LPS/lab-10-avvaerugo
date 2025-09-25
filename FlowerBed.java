package lab10;

public class FlowerBed {
	private Flower[] bed;
	public FlowerBed(Flower[] b) {
		bed = b;
	}
	public FlowerBed(int n) {
		bed = new Flower[n];
	}
	public void setBed(Flower[] b) {
		bed = b;
	}
	public Flower[] getBed() {
		return bed;
	}
	public int plantFlower(Flower f) {
		for (int i = 0; i < bed.length; i++) {
			if (i > 0 && i < bed.length - 1) {
				if (bed[i - 1] == null && bed[i] == null && bed[i + 1] == null) {
					bed[i] = f;
					return i;
				}
			} else if (i == 0) {
				if (bed[i] == null && bed[i + 1] == null) {
					bed[i] = f;
					return i;
				}
			} else {
				if (bed[i - 1] == null && bed[i] == null) {
					bed[i] = f;
					return i;
				}
			}
		}
		return -1;
	}
	public void flipBed() {
		Flower[] temp = new Flower[bed.length];
		for (int i = 0; i < bed.length; i++) {
			temp[i] = bed[bed.length - i - 1];
		}
		bed = temp;
	}
	public String toString() {
		String temp = "";
		for (int i = 0; i < bed.length; i++) {
			if (i > 0) {temp += ", ";}
			if (bed[i] == null) {temp += "null";} else {temp += bed[i].toString();}
		}
		return "FlowerBed{" + temp + "}";
	}
}

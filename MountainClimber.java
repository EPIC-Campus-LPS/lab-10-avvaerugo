package lab10;

public class MountainClimber {
	private Mountain[] wantToClimb;
	public MountainClimber(Mountain[] a) {wantToClimb = a;}
	public Mountain[] getWantToClimb() {return wantToClimb;}
	public void setWantToClimb(Mountain[] a) {wantToClimb = a;}
	public Mountain mostDifficultClimb() {
		Mountain diff = wantToClimb[0];
		for (int i = 1; i < wantToClimb.length; i++) {
			if (diff.getClimbDifficulty() < wantToClimb[i].getClimbDifficulty()) {diff = wantToClimb[i];} 
		}
		return diff;
	}
	public Mountain[] sortClimbLowToHigh() {
		Mountain temp;
		for (int i = 0; i < wantToClimb.length; i++) {
			for (int j = 0; j < wantToClimb.length - i - 1; j++) {
				if (wantToClimb[j].getClimbDifficulty() > wantToClimb[j+1].getClimbDifficulty()) {
					temp = wantToClimb[j];
					wantToClimb[j] = wantToClimb[j+1];
					wantToClimb[j+1] = temp;
				}
			}
		}
		return wantToClimb;
	}
	public Mountain[] sortClimbHighToLow() {
		Mountain temp;
		for (int i = 0; i < wantToClimb.length; i++) {
			for (int j = 0; j < wantToClimb.length - i - 1; j++) {
				if (wantToClimb[j].getClimbDifficulty() < wantToClimb[j+1].getClimbDifficulty()) {
					temp = wantToClimb[j];
					wantToClimb[j] = wantToClimb[j+1];
					wantToClimb[j+1] = temp;
				}
			}
		}
		return wantToClimb;
	}
	public MountainClimber getFourteeners() {
		int temp1 = 0;
		for (int i = 0; i < wantToClimb.length; i++) {
			if (wantToClimb[i].getElevation() > 13999) {temp1++;}
		}
		MountainClimber temp2 = new MountainClimber(new Mountain[temp1]);
		temp1 = 0;
		Mountain[] temp3;
		for (int i = 0; i < wantToClimb.length; i++) {
			if (wantToClimb[i].getElevation() > 13999) {
				temp3 = temp2.getWantToClimb();
				temp3[temp1] = wantToClimb[i];
				temp2.setWantToClimb(temp3);
				temp1++;
			}
		}
		return temp2;
	}
	public String toString() {
		String temp = "";
		for (int i = 0; i < wantToClimb.length; i++) {
			if (i > 0) {temp += ", ";}
			if (wantToClimb[i] == null) {temp += "null";} else {temp += wantToClimb[i].toString();}
		}
		return "MountainClimber{" + temp + "}";
	}
}

public class SimpleInterest {

	private double principal, rate, finalAmount;
	private String periodName, typeOfRate;
	private int choice2, period, choice1;

	public SimpleInterest() { // default constructor

	}

	public SimpleInterest(double principal, double rate, int choice2, int choice1, int period) { // constructor
		this.setPrincipal(principal);
		this.setRate(rate);
		this.setPeriod(choice2, period);
		this.setTypeOfRate(choice1);
		
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int choice2, int period) {
		this.period = period;
		this.choice2 = choice2;
		switch (this.choice2) {
		case 1:
			setPeriodYears(this.period);
			break;
		case 2:
			setPeriodMonths(this.period);
			break;
		default:
			setPeriodDays(this.period);
			break;
		}
	}

	public String getTypeOfRate() {
		return typeOfRate;

	}

	public void setTypeOfRate(int choice1) {
		this.choice1 = choice1;
		if (this.choice1 == 1) {
			typeOfRate = "p.a.";
		} else if (this.choice1 == 2) {
			typeOfRate = "p.m.";
		} else {
			typeOfRate = "p.d.";
		}

	}

	private void setPeriodYears(int period) {
		this.period = period;
		periodName = "years";

	}

	private void setPeriodMonths(int period) {
		this.period = period;
		periodName = "months";

	}

	private void setPeriodDays(int period) {
		this.period = period;
		periodName = "days";

	}

	public void setSimpleInterest(int choice1, int choice2) {
		this.choice1 = choice1;
		if (choice1==1) {
			if (choice2 == 1) {
				finalAmount = principal * (rate / 100) * (double)this.period;
			} else if (choice2 == 2) {
				finalAmount = principal * (rate / 100) * ((double)this.period / 12);
			} else {
				finalAmount = principal * (rate / 100) * ((double)this.period / 365);
			}
		}else if(choice1 == 2) {	
			if (choice2 == 1) {
				finalAmount = principal * (rate / 100) * ((double)this.period * 12);
			} else if (choice2 == 2) {
				finalAmount = principal * (rate / 100) * (double)this.period;
			} else {
				finalAmount = principal * (rate / 100) * ((double)this.period / 30);
			}
		}else {
			if (choice2 == 1) {
				finalAmount = this.principal * (rate / 100) * ((double)this.period * 365);
			} else if (choice2 == 2) {
				finalAmount = this.principal * (rate / 100) * ((double)this.period * 30);
			} else {
				finalAmount = this.principal * (rate / 100) * (double)this.period;
			}
		}

		}
	

	public double getSimpleInterest() {
		return finalAmount;
	}

	public double getMaturityValue() {
		return principal += finalAmount;
	}

	@Override
	public String toString() {
		return "Simple interest for $" + String.format("%.2f", principal) + " at " + String.format("%.2f", rate) + "% "
				+ getTypeOfRate() + " for " + String.format("%d ", getPeriod()) + periodName + " is $"
				+ String.format("%.2f", getSimpleInterest()) + String.format("%s %n", ".") + "The Maturity Value of $"
				+ String.format("%.2f", principal) + " at an interest rate of " + String.format("%.2f", rate) + "% "
				+ getTypeOfRate() + " after " + String.format("%d ", getPeriod()) + periodName + " is $"
				+ String.format("%.2f", getMaturityValue());
	}

	
	
	
}
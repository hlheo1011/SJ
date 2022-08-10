package quiz04_employee;

public class Temporary {
	private int pay;
	private int workTimes;
	
	public Temporary(int empNo, String name) {
		super(empNo, name);
	}
	// Temporary�� pay�� workTimes�� �ʵ尪�� ���� �߰� �Ϸ���, �����ڿ� �߰����� �ʾҴ�.


	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getWorkTimes() {
		return workTimes;
	}
	public void setWorkTimes(int workTimes) {
		this.workTimes = workTimes;
	}

	@Override
	public String toString() {
		return super.toString() + ", pay=" + pay + ", workTimes=" + workTimes + "]";
	}
	
}

package Chapter20;

public class Ex3 {

	public static void main(String[] args) {
		Ex1_Worker[] workers = new Ex1_Worker[10];
		
		
		
		for (int i = 0; i < 10; i++) {
			workers[i] = new Ex1_Worker("Matei" + i, "Kazijski" + 1, 500 - i, 22 - i);
		}
		
		for (int i = 1; i < workers.length; i++) {
			for (int j = workers.length - 1; j >= i; j--) {
				if (workers[j].getSalary() > (workers[j-1].getSalary())){
					Ex1_Worker temp = workers[j-1];
					workers[j-1] = workers[j];
					workers[j] = temp;
				}
			}	
		}
		
		for (Ex1_Worker worker : workers) {
			System.out.println(worker.getFirstName() + " " + worker.getSalary());
		}
	}

}

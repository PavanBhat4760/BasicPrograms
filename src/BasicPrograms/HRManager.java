package BasicPrograms;

public class HRManager {
	
	void work() {
        System.out.println("HR Manager is managing HR tasks");
    }

    void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
    
    
	public static void main(String[] args) {
		
		  HRManager obj = new HRManager();
	       obj.work();
	       obj.addEmployee();
	}

}

package oops.encapuslation;

public class EmployeeId {
    private int empyId;

    public void setEmpyId(int x){
        empyId = x;
    }
   public int getEmpyId(){

        return empyId;
    }
      public static void main(String[] args) {
        EmployeeId employeeId = new EmployeeId();
        employeeId.setEmpyId(2);

    }
}

public class Employee {
    private int empNum;
    private String empName;
    private String empJob;
    private String empDeptName;
    private double empSalary;
    private String empGender;
    private int empAge;
    public int getEmpNum() {
        return empNum;
    }
    public void setEmpNum(int empNum) {
        this.empNum = empNum; 
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpJob() {
        return empJob;
    }
    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }
    public double getEmpSalary() {
      return empSalary;
    }
    public void setEmpSalary(double empSalary) {
      this.empSalary = empSalary;
    }
    public String getEmpDeptName() {
      return empDeptName;
    }
    public void setEmpDeptName(String empDeptName) {
      this.empDeptName = empDeptName;
    }
    public String getEmpGender() {
      return empGender;
    }
    public void setEmpGender(String empGender) {
      this.empGender = empGender;
    }
    public int getEmpAge() {
      return empAge;
    }
    public void setEmpAge(int empAge) {
      this.empAge = empAge;
    }
    @Override
    public String toString() {
      return empNum + "\t" + empName + "\t" + empJob + "\t" + empSalary + "\t" + empDeptName + "\t" + empGender + "\t" + empAge;
    }
}

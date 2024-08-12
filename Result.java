import java.util.ArrayList;
import java.util.Iterator;
public class Result {
  public static void main(String[] args) 
  {
    String [] records = {
          "1001,ajay,manager,account,45000,male,38",
          "1002,aiswrya,clerk,admin,25000,female,30",
          "1003,varun,manager,sales,50000,male,35",
          "1004,amit,manager,account,47000,male,40",
          "1005,kareena,executive,sales,15000,female,24",
          "1006,deepak,clerk,admin,23000,male,30",
          "1007,sunil,accountant,sales,13000,male,29",
          "1008,satvik,director,purchase,80000,male,45"
    };
    ArrayList <Employee> empDataList = new ArrayList <Employee>();
    for( String record : records )
    {
        String [] fields = record.split(",");
        Employee employee = new Employee();
        employee.setEmpNum( Integer.parseInt( fields[0] ) );
        employee.setEmpName( fields[1] );
        employee.setEmpJob( fields[2]);
        employee.setEmpDeptName( fields[3] );
        employee.setEmpSalary( Double.parseDouble( fields[4]));
        employee.setEmpGender( fields[5]);
        employee.setEmpAge( Integer.parseInt( fields[6]));
        empDataList.add( employee ); 
    }
    System.out.println("no of records loaded = "+ empDataList.size());
    Iterator<Employee> iterator = empDataList.iterator();
    while( iterator.hasNext() )
    {
        Employee emp = iterator.next();
        System.out.println( emp );
    }
    }
}

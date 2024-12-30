import java.util.*;
class Student{
    int id;
    String name;
    double cgpa;
    public Student(int id,String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
}
public class JavaSortExample{
    public static void main (String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        List<Student> students=new ArrayList<>();
        for(int i=0;i<n;i++){
            int id=scn.nextInt();
            String name=scn.next();
            double cgpa=scn.nextDouble();
            students.add(new Student(id,name,cgpa));
        }
        
        students.sort((s1,s2) -> {
            if(Double.compare(s2.cgpa,s1.cgpa) !=0){
                return Double.compare(s2.cgpa,s1.cgpa);
            }else if(!s1.name.equals(s2.name)){
                return s1.name.compareTo(s2.name);
            }else{
                return Integer.compare(s1.id,s2.id);
            }
            
        });
        
        for(Student student:students){
            System.out.println(student.name);
        }
        scn.close();
    }
}
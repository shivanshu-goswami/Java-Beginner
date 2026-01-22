class Student{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String a[]){
        Student s1= new Student();
        s1.name="Shivanshu";
        s1.rollno=1;
        s1.marks=85;

        Student s2= new Student();
        s2.name="Saurabh";
        s2.rollno=2;
        s2.marks=88;

        Student s3= new Student();
        s3.name="Shivam";
        s3.rollno=3;
        s3.marks=90;

        //it dont create 3 array objects, instead it creates an array which store references of 3 objects
        // i.e, s1,s2,s3
        Student students[]= new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+" "+students[i].marks);
        }
    }
}

class oops{
    public static void main(String[] args) {
        Student std1 =new Student();
        std1.rollno=12;
        std1.name="saurabh";
        std1.marks=88.4f;
        System.out.println(std1.rollno);
        System.out.println(std1.name);
        System.out.println(std1.marks);
    }
}
class Student{
    int rollno;
    String name;
    float marks=90;

}
//package Heaps;
//
//public class customComparator {
//    public static void print(Student [] arr){
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i].rno);
//            System.out.println(arr[i].marks);
//            System.out.println(arr[i].name);
//        }
//    }
//    class  Student implements Comparable<Student>{
//        int rno;
//        double marks;
//        String name;
//        Student(int rno,double marks,String name){
//            this.rno=rno;
//            this.marks=marks;
//            this.name=name;
//        }
//        public int compareTo(Student s){
//            return this.rno-s.rno;
//        }
//    }
//    public static void main(String[] args) {
//        Student [] s=new Student[4];
//        s[0]=new Student(76,89.2,"Raghav");
//        s[1]=new Student(88,78.1,"Prachi");
//        s[2]=new Student(13,95.9,"krish");
//        s[3]=new Student(83,89.2,"Himanshu");
//        System.out.println(s);
//    }
//}

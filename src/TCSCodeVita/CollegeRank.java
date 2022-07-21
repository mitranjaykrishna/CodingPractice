package TCSCodeVita;

import java.util.*;


public class CollegeRank {
    static class Student{
        public int student_id;
        public  float percentage;
       public String c1;
        public String c2;
        public String c3;
        public String allot;

        public Student(int student_id, float percentage, String c1, String c2, String c3,String allot) {
            this.student_id = student_id;
            this.percentage = percentage;
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
            this.allot=allot;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();                   // no of colleges
        int n= sc.nextInt();                    //np. of Students
        int[] s=new int[c];                     //Seat quata college[c]
        Student[] stud=new Student[n];

        //Quata input
        for(int i=0;i<c;i++)
        {
            s[i]= sc.nextInt();
        }
        //Student details
        for(int i=0;i<n;i++)
        {
//
            int id= sc.nextInt();
            float per= sc.nextFloat();
            String c1=sc.nextLine();
            String c2=sc.nextLine();
            String c3=sc.nextLine();
            sc.nextLine();
            stud[i]=new Student(id,per,c1,c2,c3,"");
        }
        int[] check=new int[n];
        per(stud,check);
//        int j=0;
        for(int i=0;i< stud.length;i++)
        {
            for (int j=0;j< stud.length;j++) {
                if (check[i] == stud[j].student_id) {


                    {


                    }

                }
            }

        }






    }

    public static void per(Student[] stud,int[] check)
    {
        float[] per=new float[stud.length];

        for(int i=0;i< stud.length;i++)
        {
            per[i]=stud[i].percentage;
        }
        Arrays.sort(per);
        int j=0;
        int k=0;
        int i=0;
        while (true)
        {

                if(stud[i].percentage==per[j])
                {
                    check[k]=stud[i].student_id;
                    k++;
                    j++;
                    i++;
                }
                i++;


        }

    }




}

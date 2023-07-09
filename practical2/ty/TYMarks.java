package practical2.ty;

import java.util.Scanner;

public class TYMarks {
    float total_marks;
    float theory,practical;
    Scanner scan =  new Scanner(System.in);

    class TotalTheory
    {
        float cmp_theory_total;
        float math_theory_total;
        float elc_theory_total;

        /* 
        public void setTheoryMarks(float cmp,float elc,float math)
        {
            this.com_theory_total = cmp;
            this.elc_theory_total = elc;
            this.math_theory_total = math;
        }*/
        public void setTheoryMarks()
        {
        System.out.print("Enter Computer-1 theory marks out of 400 :");
        float cmp1 = scan.nextFloat();
        
        System.out.print("ENter Computer-2 theory marks  out of 400:");
        float cmp2 = scan.nextFloat();

        this.cmp_theory_total = cmp1 + cmp2 ;
      
        System.out.print("Enter Electronic-1 theory marks  out of 400:");
        float elc1 = scan.nextFloat();
        
        System.out.print("ENter Electronic-2 theory marks  out of 400:");
        float elc2 = scan.nextFloat();

        this.elc_theory_total = elc1 + elc2 ;

        System.out.print("Enter Maths-1 theory marks  out of 400:");
        float m1 = scan.nextFloat();
        
        System.out.print("ENter Maths-2 theory marks  out of 400:");
        float m2 = scan.nextFloat();

        this.math_theory_total = m1 + m2 ;

       }

       public void setTheoryMarks1()
       {
         System.out.print("Enter Theory marks  out of 400  :");
         theory = scan.nextFloat();
       }
        public float getTotalTheoryMarks()
        {
            return this.cmp_theory_total + this.elc_theory_total + this.math_theory_total;
        }

    } 

    class TotalPractical
    {
        float cmp_prc_total;
        float math_prc_total;
        float elc_prc_total;    

        // public void setPracticalMarks(float cmp,float elc ,float math)
        // {
        //     this.com_prc_total = cmp;
        //     this.elc_prc_total = elc;
        //     this.math_prc_total = math;
        // }
        public float getTotalPracticalMarks()
        {
          return this.cmp_prc_total + this.elc_prc_total + this.math_prc_total;
        }

        public void setPracticalMarks()
        {
        //  Scanner scan =  new Scanner(System.in);
         System.out.print("Enter Computer-1 practical marks  out of 100 :");
         float cmp1 = scan.nextFloat();
        
        System.out.print("ENter Computer-2 practical marks out of 100 :");
        float cmp2 = scan.nextFloat();

        this.cmp_prc_total = cmp1 + cmp2 ;
      
        System.out.print("Enter Electronic-1 practical marks out of 100 :");
        float elc1 = scan.nextFloat();
        
        System.out.print("ENter Electronic-2 practical marks  out of 100:");
        float elc2 = scan.nextFloat();

        this.elc_prc_total = elc1 + elc2 ;

        System.out.print("Enter Maths-1 practical marks out of 100 :");
        float m1 = scan.nextFloat();
        
        System.out.print("ENter Maths-2 practical marks  out of 100:");
        float m2 = scan.nextFloat();

        this.math_prc_total = m1 + m2 ;

      }
      //on the basis of 400  and 200
       public void setPracticalMarks1()
       {
         System.out.print("Enter practical marks  out of 200  :");
         practical = scan.nextFloat();
       }
    }

    public void setTYMarks()
    {
        TotalTheory th = new TotalTheory();
        th.setTheoryMarks1();

        System.out.println();

        TotalPractical tp = new TotalPractical();
        tp.setPracticalMarks1();

        // this.total_marks = tp.getTotalPracticalMarks() + th.getTotalTheoryMarks();
        this.total_marks = this.theory + this.practical;
    }
    public float getTYTotalMarks()
    {
        return this.total_marks;

    }
}

package practical2.sy;

import java.util.Scanner;

public class SYMarks {
    float total_marks;

    Scanner scan = new Scanner(System.in);
    
     class ComputerTotal
    {
        float computer_total;
        public void setComputerMarks()
        {
         //calculate the computer subject marks 
         /* 
          System.out.print("Enter computer-1 marks  out of 100:");
          float cmp1 = scan.nextFloat();

          System.out.print("Enter computer-2 marls  out of 100:");
          float cmp2 = scan.nextFloat();

         this.computer_total = cmp1 + cmp2;
         */
        System.out.print("ENter computer marks out of 200 :");
        computer_total = scan.nextFloat();
        }

        public float getComputerMarks()
        {
            return this.computer_total;
        }
    }

    class MathsTotal
    {
        float maths_total;
        public void setMathsMarks()
        {
            //calculate the maths subject marks
            /*System.out.print("Enter Maths-1 marks out of 100 :");
            float m1 = scan.nextFloat();

            System.out.print("Enter Maths-2 marks  out of 100:");
            float m2 = scan.nextFloat();

            this.maths_total = m1 + m2;*/

            System.out.print("Enter maths marks out of 200 :");
            maths_total = scan.nextFloat();
        }

        public float getMathsMarks()
        {
            return this.maths_total;
        }
    }

    class ELectronicTotal
    {
        float elc_total;
        public void setElcMarks()
        {
           //calculate Electronics marks
            /*System.out.print("Enter ELC-1 marks  out of 100 :");
            float elc1 = scan.nextFloat();

            System.out.print("Enter ELC-2 marks  out of 100:");
            float elc2 = scan.nextFloat();

            this.elc_total = elc1 + elc2;*/

            System.out.print("Enter Electronic marks out of 200 :");
            elc_total = scan.nextFloat();
        }

        public float getElcMarks()
        {
            return this.elc_total;
        }
    }

    public void setSYMarks()
    {
        ComputerTotal cmp = new ComputerTotal();
        cmp.setComputerMarks();
        
        MathsTotal mt = new MathsTotal();
        mt.setMathsMarks();

        ELectronicTotal elc=  new ELectronicTotal();
        elc.setElcMarks();

        this.total_marks = cmp.getComputerMarks() + elc.getElcMarks() + mt.getMathsMarks();
    }
    
    public float getSYTotalMarks()
    {
        return total_marks;
    }

}

package practical1.setA;

/*
 * a) Using javap, view the methods of the following classes from the lang package: 
    java.lang.Object , java.lang.String and java.util.Scanner. and also Compile sample 
    program 8. Type the following command and view the bytecodes. javap -c MyClass
 */
class MyClass {
    int num;

    public MyClass() {
        num = 0;
    }

    public MyClass(int num) {
        this.num = num;
    }

}

public class Ex1 {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            MyClass m2 = new MyClass(n);
            System.out.println(m1.num);
            System.out.println(m2.num);
        }
        else{
            System.out.println("Argument insufficient ");
        }

    }
}

/* 
//Byte code for java.lang.Object
PS C:\Users\haris\OneDrive\Desktop\JavaPractice> javap -c  java.lang.Object       
Compiled from "Object.java"
public class java.lang.Object {
  public java.lang.Object();
    Code:
       0: return

  public final native java.lang.Class<?> getClass();

  public native int hashCode();

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     9
       5: iconst_1
       6: goto          10
       9: iconst_0
      10: ireturn

  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;  

  public java.lang.String toString();
    Code:
       0: new           #1                  // class java/lang/StringBuilder
       3: dup
       4: invokespecial #3                  // Method java/lang/StringBuilder."<init>":()V
       7: aload_0
       8: invokevirtual #7                  // Method getClass:()Ljava/lang/Class;        
      11: invokevirtual #13                 // Method java/lang/Class.getName:()Ljava/lang/String;
      14: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      17: ldc           #23                 // String @
      19: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: aload_0
      23: invokevirtual #25                 // Method hashCode:()I
      26: invokestatic  #29                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      29: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      32: invokevirtual #35                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: areturn

  public final native void notify();

  public final native void notifyAll();

  public final void wait() throws java.lang.InterruptedException;
    Code:
       0: aload_0
       1: lconst_0
       2: invokevirtual #38                 // Method wait:(J)V
       5: return

  public final native void wait(long) throws java.lang.InterruptedException;

  public final void wait(long, int) throws java.lang.InterruptedException;
    Code:
       0: lload_1
       1: lconst_0
       2: lcmp
       3: ifge          16
       6: new           #42                 // class java/lang/IllegalArgumentException   
       9: dup
      10: ldc           #44                 // String timeoutMillis value is negative     
      12: invokespecial #46                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      15: athrow
      16: iload_3
      17: iflt          26
      20: iload_3
      21: ldc           #49                 // int 999999
      23: if_icmple     36
      26: new           #42                 // class java/lang/IllegalArgumentException   
      29: dup
      30: ldc           #50                 // String nanosecond timeout value out of range
      32: invokespecial #46                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      35: athrow
      36: iload_3
      37: ifle          52
      40: lload_1
      41: ldc2_w        #54                 // long 9223372036854775807l
      44: lcmp
      45: ifge          52
      48: lload_1
      49: lconst_1
      50: ladd
      51: lstore_1
      52: aload_0
      53: lload_1
      54: invokevirtual #38                 // Method wait:(J)V
      57: return

  protected void finalize() throws java.lang.Throwable;
    Code:
       0: return
}
*/

//Byte code of the class
/* 
PS C:\Users\haris\OneDrive\Desktop\JavaPractice> javap -c  practical1.setA.MyClass 
Compiled from "Ex1.java"
class practical1.setA.MyClass {
  int num;

  public practical1.setA.MyClass();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #7                  // Field num:I
       9: return

  public practical1.setA.MyClass(int);
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #7                  // Field num:I
       9: return
}
*/
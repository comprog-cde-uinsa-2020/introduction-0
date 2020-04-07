/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasrows;

/**
 *
 * @author 
 */

/** reference:
 * 1. https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
 * 2. https://www.geeksforgeeks.org/java-lang-math-class-in-java-set-1/
 * 3. https://github.com/Evinuria/Phytagoras-FIX/blob/master/Phytagoras3.java
 **/

// real koding
//import java.util.Scanner;
//class Phytagoras3 {
//    double pilih[]={1,2,3};
//    //float a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
//    //float b[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
//    double a;
//    double b;
//    double c;
//    double pitagoras;
//public Phytagoras3(){}
//    public void pitagoras1(){
//        Scanner input = new Scanner(System.in);
//        System.out.prdoubleln("Masukkan a =  ");
//        a=input.nextInt();
//        System.out.prdoubleln("Masukkan b =  ");
//        b=input.nextInt();
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//        System.out.prdoubleln("c =" + c);
//    }
//    public void pitagoras2(){
//        Scanner input = new Scanner(System.in);
//        System.out.prdoubleln("Masukkan c =  ");
//        c=input.nextInt();
//        System.out.prdoubleln("Masukkan b =  ");
//        b=input.nextInt();
//        a = Math.sqrt(Math.pow(c,2) - Math.pow(b,2));
//    System.out.prdoubleln("a =" + a);
//    }
//    public void pitagoras3(){
//        Scanner input = new Scanner(System.in);
//        System.out.prdoubleln("Masukkan c =   ");
//        c=input.nextInt();
//        System.out.prdoubleln("Masukkan a =   ");
//        a=input.nextInt();
//        b = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
//    System.out.prdoubleln("b =" + b);
//    }
//}

// Revision and Improved 1-2307-742020
// class phytagoras
class Pythagoras {
    
    // variable untuk menerima nilai
    double sisiA;
    double sisiB;
    double sisiC;

    // class construct tanpa memasukan nilai dari construct kosong, dilakukan oleh fungsi lain
    public Pythagoras() { }

    // cara 2. void dengan dua variable sekaligus variable A dan B
    public void pythagorasAB(double parameterA, double parameterB){
        this.sisiA = parameterA;
        this.sisiB = parameterB;
    }

    // cara 2. void dengan dua variable sekaligus variable B dan C
    public void pythagorasBC(double parameterB, double parameterC){
        this.sisiB = parameterB;
        this.sisiC = parameterC;
    }
    
    // cara 2. void dengan dua variable sekaligus variable C dan A
    public void PythagorasCA(double parameterC, double parameterA){
        this.sisiC = parameterC;
        this.sisiA = parameterA;
    }
    
    // cara 1. class construct tanpa memasukan nilai dari construct
    public void setSisiA(double parameterA) {
        this.sisiA = parameterA;
    }

    // cara 1. class construct tanpa memasukan nilai dari construct
    public void setSisiB(double parameterB) {
        this.sisiB = parameterB;
    }

    // cara 1. class construct tanpa memasukan nilai dari construct
    public void setSisiC(double parameterC) {
        this.sisiB = parameterC;
    }

    // function menghitung pythagoras sisi miring segitiga siku - siku
    public double sisiMiringSegitigaSiku() {
        return Math.sqrt(Math.pow(this.sisiA, 2) + Math.pow(this.sisiB, 2));
    }
    
    // function menghitung pythagoras sisi miring segitiga siku - siku
    public double tinggiSegitigaSiku() {
        return Math.sqrt(Math.pow(this.sisiC, 2) - Math.pow(this.sisiB, 2));
    }
    
    // function menghitung pythagoras sisi miring segitiga siku - siku
    public double alasSegitigaSiku() {
        return Math.sqrt(Math.pow(this.sisiC, 2) - Math.pow(this.sisiA, 2));
    }
}

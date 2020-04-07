/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasrows;

/**
 * Tugas Kuliah Minggu ke 10
 * @author Evinuria Filuyunistiara (D74217080) 
 * @edited Subhan Nooriansyah (Dosen)
 **/

/**
 * references
 * 
 * 1. https://www.tutorialspoint.com/How-to-read-data-from-scanner-to-an-array-in-java
 * 2. https://github.com/Evinuria/Phytagoras-FIX/blob/master/main.java
 **/

// real koding by Evinuria Filuyunistiara (D74217080)
//import java.util.Scanner;
//public class main{
//    public static void main(String args[]){
//        Scanner input = new Scanner(System.in);
//        System.out.println("PITAGORAS");
//        System.out.println("1. Mencari sisi miring segitiga siku-siku / Nilai c");
//        System.out.println("2. Mencari tinggi segitiga siku-siku / Nilai a");
//        System.out.println("3. Mencari alas segitiga siku-siku / Nilai b");
//        System.out.println("Pilih nomer berapa = ");
//        int pilih = input.nextInt();
//        Phytagoras3 Soal;
//        Soal = new Phytagoras3();
//        if (pilih==1){Soal.pitagoras1();}
//        if (pilih==2){Soal.pitagoras2();}
//        if (pilih==3){Soal.pitagoras3();} 
//        }
//    }

// Revision and Improved 1-2307-742020

// import library java array untuk variable dan fungsi array
import java.util.Arrays;
// import library java scanner untuk menerima nilai ketika dimasukan dari command prompt
import java.util.Scanner;

// class main untuk menjalankan class lain atau eksekusi class lain
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // inisialisasi scanner object untuk memanggil fungsi yang dapat mengambil nilai dari screen    
    Scanner input = new Scanner(System.in);

    // variable untuk menerima masukan panjang baris
    System.out.println("Masukan panjang baris untuk baris A, B dan C= ");
    int lengthRow = input.nextInt();
    
    // variable untuk menerima nilai array untuk baris A, B dan C    
    double[] rowOfNumberA = new double[lengthRow];
    double[] rowOfNumberB = new double[lengthRow];
    double[] rowOfNumberC = new double[lengthRow];
    
    // variable untuk menerima masukan nilai dari pilihan
    System.out.println("Masukan nilai untuk baris A berdasarkan jumnlah element: ");
    
    // Looping untuk menerima nilai masukan kedalam variable rowOfNumberA     
    for(int indexRowA = 0; indexRowA < lengthRow; indexRowA++) {
      rowOfNumberA[indexRowA] = input.nextInt();
    }
    
    System.out.println("Masukan nilai untuk baris B berdasarkan jumnlah element: ");
    
    // Looping untuk menerima nilai masukan kedalam variable rowOfNumberB     
    for(int indexRowB = 0; indexRowB < lengthRow; indexRowB++) {
      rowOfNumberB[indexRowB] = input.nextInt();
    }
    
    System.out.println("Masukan nilai untuk baris C berdasarkan jumnlah element: ");
    
    // Looping untuk menerima nilai masukan kedalam variable rowOfNumberC     
    for(int indexRowC = 0; indexRowC < lengthRow; indexRowC++) {
      rowOfNumberC[indexRowC] = input.nextInt();
    }
    
    // cetak hasil masukan baris angka
    System.out.println("cetak baris angka A"+Arrays.toString(rowOfNumberA));
    System.out.println("cetak baris angka B"+Arrays.toString(rowOfNumberB));
    System.out.println("cetak baris angka C"+Arrays.toString(rowOfNumberC));
    
    System.out.println("PITAGORAS");
    System.out.println("1. Mencari sisi miring segitiga siku-siku / Nilai c");
    System.out.println("2. Mencari tinggi segitiga siku-siku / Nilai a");
    System.out.println("3. Mencari alas segitiga siku-siku / Nilai b");

    // variable untuk menerima masukan nilai dari pilihan
    System.out.println("Pilih nomer berapa = ");
    
    int choose = input.nextInt();

    // cara pertama
    Pythagoras pythagoras = new Pythagoras();

    // conditional atau branching salah satu alternatif lain dari if else if else atau if else 
    switch (choose) {
      case 1:
        
        // print cara pertama
        System.out.println("cara pertama dalam OOP");
        System.out.println("hasil dari pencarian pythagoras pilihan "+choose);
        
        // menerapkan looping dan memanggil fungsi dari class (OOP)        
        // cara pertama memasukan nilai dengan looping berdasarkan baris angka
        for (int indexA = 0; indexA < rowOfNumberA.length; indexA++) {
          pythagoras.setSisiA(rowOfNumberA[indexA]);
          
          for (int indexB = 0; indexB < rowOfNumberB.length; indexB++) {
            pythagoras.setSisiB(rowOfNumberB[indexB]);

            System.out.println("C: "+pythagoras.sisiMiringSegitigaSiku());
          }
        }
      
        System.out.println("\n");
        System.out.println("----------");
        
        // print cara kedua
        System.out.println("cara kedua dalam OOP");
        System.out.println("hasil dari pencarian pythagoras pilihan "+choose);
        for (int indexCaseOne = 0; indexCaseOne < rowOfNumberA.length; indexCaseOne++) {
          
          for (int indexCaseTwo = 0; indexCaseTwo < rowOfNumberB.length; indexCaseTwo++) {
            pythagoras.pythagorasAB(rowOfNumberA[indexCaseOne], rowOfNumberB[indexCaseTwo]);

            System.out.println("C: "+pythagoras.sisiMiringSegitigaSiku());
          }
        }

        break;
      case 2:
        
        // print cara pertama
        System.out.println("cara pertama dalam OOP");
        System.out.println("hasil dari pencarian pythagoras pilihan "+choose);
        
        // menerapkan looping dan memanggil fungsi dari class (OOP)        
        // cara pertama memasukan nilai dengan looping berdasarkan baris angka
        for (int indexB = 0; indexB < rowOfNumberB.length; indexB++) {
          pythagoras.setSisiB(rowOfNumberB[indexB]);
          
          for (int indexC = 0; indexC < rowOfNumberC.length; indexC++) {
            pythagoras.setSisiC(rowOfNumberC[indexC]);

            System.out.println("A: "+pythagoras.tinggiSegitigaSiku());
          }
        }
      
        System.out.println("\n");
        System.out.println("----------");
        
        // print cara kedua
        System.out.println("cara kedua dalam OOP");
        System.out.println("hasil dari pencarian pythagoras pilihan "+choose);
        for (int indexB = 0; indexB < rowOfNumberB.length; indexB++) {
          
          for (int indexC = 0; indexC < rowOfNumberC.length; indexC++) {
            pythagoras.pythagorasBC(rowOfNumberB[indexB], rowOfNumberC[indexC]);

            System.out.println("A: "+pythagoras.tinggiSegitigaSiku());
          }
        }
        
        break;
      case 3:
        
        // print cara pertama
        System.out.println("cara pertama dalam OOP");
        System.out.println("hasil dari pencarian pythagoras pilihan "+choose);
        
        // menerapkan looping dan memanggil fungsi dari class (OOP)        
        // cara pertama memasukan nilai dengan looping berdasarkan baris angka
        for (int indexA = 0; indexA < rowOfNumberA.length; indexA++) {
          pythagoras.setSisiA(rowOfNumberA[indexA]);
          
          for (int indexC = 0; indexC < rowOfNumberC.length; indexC++) {
            pythagoras.setSisiC(rowOfNumberC[indexC]);

            System.out.println("B: "+pythagoras.alasSegitigaSiku());
          }
        }
      
        System.out.println("\n");
        System.out.println("----------");
        
        // print cara kedua
        System.out.println("cara kedua dalam OOP");
        System.out.println("hasil dari pencarian pythagoras pilihan "+choose);
        for (int indexC = 0; indexC < rowOfNumberC.length; indexC++) {
          
          for (int indexA = 0; indexA < rowOfNumberA.length; indexA++) {
            pythagoras.PythagorasCA(rowOfNumberC[indexC], rowOfNumberC[indexA]);

            System.out.println("B: "+pythagoras.sisiMiringSegitigaSiku());
          }
        }
        
        break;
      default:
        System.out.println("Please choose another between number 1-3");
        break;
    }
  }
  
}

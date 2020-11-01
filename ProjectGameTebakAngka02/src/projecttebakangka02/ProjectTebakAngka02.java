/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangka02;

/**
 *
 * @author User
 */
public class ProjectTebakAngka02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Game Tebak Angka");
        System.out.println("==============================================================================================");
        System.out.println("Hello... Nama saya Lestari Rahayu, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak yaaa!!!");
        System.out.println("Score awal anda adalah 100.");
        System.out.println("Total Score minimal adalah 0.");
        System.out.println("Apabila tebakan salah maka score anda berkurang 2.");
        System.out.println("Dan apabila anda berhasil menebak secara benar tidak lebih dari 5 kali tebakan, maka anda mendapat bonus score 50.");
        System.out.println("==============================================================================================");
        
        TebakAngka02 TB02 = new TebakAngka02();
        TB02.angkaRandom();
        TB02.tebakan();
        TB02.bonus();
        TB02.totalScore();
    }
    
}

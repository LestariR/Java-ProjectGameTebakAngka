
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangka02;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TebakAngka02 {
    int kunci;
    int tebakan;
    int score=100;
    int banyakTebakan=0;
    int bonus=0;
    int totalScore;
    
    void angkaRandom() {
        this.kunci = (int) (Math.random() *101);
    }
    void tebakan(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Tebakan Anda : ");
            this.tebakan = input.nextInt();
            banyakTebakan += 1;
            if (tebakan == kunci) {
                System.out.println("Horeeee... Tebakan Anda benar !!! Selamat Anda dapat menebak bilangan dengan benar dalam " + this.banyakTebakan + " kali tebakan");
                System.out.println("==============================================================================================");
                System.out.println("Score Anda : " + this.score);
            }else {
                if (this.score > 0) {
                    this.score -= 2;
                    if (tebakan < kunci) {
                        System.out.println("Yaaaahhh... Tebakan Anda terlalu kecil :(");
                    }else if (tebakan > kunci){
                        System.out.println("Yaaaahhh... Tebakan Anda terlalu besar :(");
                    }
                }else {
                    System.out.println("Yaaaahhh... Kamu gagal menebak sampai score kamu nol :( jawabannya adalah " + this.kunci);
                    System.out.println("==============================================================================================");
                    break;
                }
            }
        }while (tebakan != kunci);
    }
    void bonus(){
        if (this.banyakTebakan <= 5){
            this.bonus += 50;
        }
        System.out.println("Bonus Anda : " + this.bonus);
    }
    void totalScore(){
        this.totalScore = this.score + this.bonus;
        System.out.println("Total Score Anda : "+ this.totalScore);
    }
}

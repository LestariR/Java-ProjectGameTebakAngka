/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgametebakangka01;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TebakAngka01 {
    int kunci;
    int tebakan;
    
    void angkaRandom() {
        this.kunci = (int) (Math.random() *101);
    }
    void tebakan(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Tebakan Anda : ");
            this.tebakan = input.nextInt();
            if (tebakan < kunci) {
                System.out.println("Yaaaahhh... Tebakan Anda terlalu kecil :(");                
                }else if (tebakan > kunci){
                    System.out.println("Yaaaahhh... Tebakan Anda terlalu besar :(");
                }else {
                    System.out.println("Horeeee... Tebakan Anda benar !!!");
                }
        } while (tebakan != kunci);
    }
}

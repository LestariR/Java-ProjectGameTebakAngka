/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgametebakangka01;

/**
 *
 * @author User
 */
public class ProjectGameTebakAngka01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello... Nama saya Lestari Rahayu, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak yaaa!!!");
        TebakAngka01 TA = new TebakAngka01();
        TA.angkaRandom();
        TA.tebakan();
    }
    
}

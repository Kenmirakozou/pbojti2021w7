/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

/**
 *
 * @author Bedman
 */
public class inheritance1 {
    public static void main(String[] args) {
        staffTetap ST = new staffTetap("Puff", "Malang", "Lelaki", 20, 2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetap();
        
        staffHarian SH = new staffHarian("Memukau", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
 
}

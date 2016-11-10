/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.project.mahasiswa;

import java.util.List;
import sample.project.mahasiswa.entity.Mahasiswa;
import sample.project.mahasiswa.service.MahasiswaService;


public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MahasiswaService service = new MahasiswaService();
        
        List<Mahasiswa> list = service.selectAll();
        for(Mahasiswa m : list){
            System.out.println(m.getNim());
            System.out.println(m.getNama());
        }
    }
}

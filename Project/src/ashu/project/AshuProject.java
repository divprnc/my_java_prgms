/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ashu.project;

/**
 *
 * @author ASHU SINGH
 */
public class AshuProject implements Cloneable
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        AshuProject ap = new AshuProject();
        AshuProject ap1 = (AshuProject)ap.clone();
        System.out.println(ap == ap1);
    }
}

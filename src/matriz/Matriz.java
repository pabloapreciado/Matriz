/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class Matriz {

    private static int i;
    private static int j;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { // Declaracion de variables
        int [][] M ;
        int [] A;
        int [] B;
        int m, n, a=0,b=0,na=0,nb=0;
        String rta ="";
        String rtab="";
        String rtam="";
        
        //Entrada Datos
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas de la matriz:"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas de la matriz:"));
        
        //Proceso
        M = new int [m][n];
        
        //Patron recorrido
        for (int i=0; i<M.length;i++)
        {
            for (int j=0; j<M.length; j++)
            {
                M[i][j] = (int)(Math.random()*6+1);
            }
        }
        for (int i=0; i<M.length;i++)
        {
            for (int j=0; j<M.length;j++)
            {
                if (M[i][j]%2==0)
                {
                    a++;
                    
                }
                else 
                {
                    b++;
                }
            }
        }
        A = new int [a];
        B = new int [b];
        
        for (int i=0; i<M.length;i++)
        {
            for (int j=0; j<M.length;j++)
            {
                if (M[i][j]%2==0)
                {
                    A[na]=M[i][j];
                    na++;
                }
                else 
                {
                    B[nb]=M[i][j];
                    nb++;
                }
            }
                    
        }
        //Salida M
        rtam = rtam ;
        for (int i=0;i<M.length;i++)
        {
            for (int j=0;j<M.length;j++)
            {
                rtam = rtam + M[i][j] + " ";
            }
            rtam = rtam + "\n";
        }
        
        //Salida A
        rta = rta + "A =[";
        for (int i=0;i<A.length;i++)
        {
            if (i<A.length)
            {
                rta = rta + A[i]+", ";
            }
            else 
            {
                rta = rta + A[i];
            }
        }
        rta = rta + "]";
        
        //Salida B
        rtab = rtab + "B =[";
        for (int i=0;i<B.length;i++)
        {
            if (i<B.length)
            {
                rtab = rtab + B[i]+", ";
            }
            else 
            {
                rtab = rtab + B[i];
            }
        }
         rtab = rtab + "]";
         
         JOptionPane.showMessageDialog(null,(rtam+"\n"+rta + "\n" + rtab));
         
         //Fin del programa
         System.exit(0);
}
    }
    

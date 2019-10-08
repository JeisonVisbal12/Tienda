
package tienda;

import java.io.*;

public class Tienda {

    //Ingreso_Producto ing = new Ingreso_Producto();
    String des_prod,cod_prod,cant_prod,prov_prod, prec_prod;
    public void escribir(){
            
        File f = new File("inventario.txt");
        
        try{
            FileWriter w = new FileWriter(f.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write(des_prod + " "+ cod_prod +" "+ cant_prod +" "+ prec_prod +" "+ prov_prod );
            wr.append("\t\n");
            wr.close();
            bw.close();
       }catch(IOException e){};
    
}
}
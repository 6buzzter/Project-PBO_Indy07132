package Indy07132_Controller;

import Indy07132_Entity.Indy07132_customer;
import Indy07132_Model.Indy07132_Modelcustomer;
import java.util.ArrayList;

public class Indy07132_Controller {
    public static Indy07132_Modelcustomer pesan = new Indy07132_Modelcustomer();
    public void inputdata(Indy07132_customer Customer){   
        pesan.input(Customer);
    }
    public ArrayList<Indy07132_customer> lihat(){
        return pesan.lihat();
    }
    public void ambil(String nama,String merksepatu){
        pesan.ambil(nama, merksepatu);
    }
    
}

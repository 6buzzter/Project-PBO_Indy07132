package Indy07132_Model;
import Indy07132_Entity.Indy07132_customer;
import java.util.ArrayList;
import java.util.Scanner;

public class Indy07132_Modelcustomer implements Indy07132_Modeltoko{
    private ArrayList <Indy07132_customer> datacustomer;
    Scanner input = new Scanner(System.in);
    public Indy07132_Modelcustomer(){
        datacustomer = new ArrayList<Indy07132_customer>();
    }
    public void input(Indy07132_customer customer){
        datacustomer.add(customer);
    }

    public ArrayList<Indy07132_customer> lihat(){ 
        return datacustomer;
    }

    @Override
    public void ambil(String nama,String merksepatu){
        for(int i=0;i<datacustomer.size();i++){
            if(nama.equals(datacustomer.get(i).getNama())&&
                    merksepatu.equals(datacustomer.get(i).getMerksepatu())){
                datacustomer.remove(i);
            }
        }
    }
    
}

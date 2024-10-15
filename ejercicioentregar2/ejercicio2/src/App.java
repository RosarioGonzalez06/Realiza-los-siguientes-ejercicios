import java.io.FileNotFoundException;
import java.io.IOException;

import excepciones.hacerexcepciones;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            hacerexcepciones.excepcionAleatoria();
            }
             catch (NumberFormatException e){
                System.out.println("NumberFormatException");}
                catch (FileNotFoundException e){
                    System.out.println("FileNotFoundException");}
              catch (IOException e){
                    System.out.println("IOException");}
            
                        catch (IndexOutOfBoundsException e){
                            System.out.println("IndexOutOfBoundsException");}
                            catch (ArithmeticException e){
                                System.out.println("ArithmeticException");}
        

    }
}
    


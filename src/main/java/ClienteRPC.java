import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class ClienteRPC {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl configuracion = new  XmlRpcClientConfigImpl();
        configuracion.setServerURL(new URL("http://localhost:1201"));
        XmlRpcClient cliente = new XmlRpcClient();
        cliente.setConfig(configuracion);
        //Siempre usar arreglos apra guardar los valores
        Scanner leer = new Scanner (System.in);
        Scanner leer2 = new Scanner (System.in);
        String nombre;
        Object[] numeros = new Object [2];

            System.out.println("Ingresa tu nombre");
            nombre = leer.nextLine();
            System.out.println("Ingresa tu peso");
            numeros[0] = leer.nextDouble();
             System.out.println("Ingresa tu altura");
            numeros[1] = leer.nextDouble();


        double imc = (Double)cliente.execute("Metodos.IMC", numeros);
        System.out.println("Hola "+ nombre+ " tu IMC es de :"+imc );

    }
}

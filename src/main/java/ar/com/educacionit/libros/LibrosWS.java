
package ar.com.educacionit.libros;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "LibrosWS")
public class LibrosWS {

    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    @WebMethod(operationName = "crear")
    public Resultado cargarLibro(Libro libro){
        System.out.println("Validar");
        System.out.println("Hablar con el servicio de libros");
        Resultado r = new Resultado();
        r.setCodigo(123);
        r.setMensaje("Libro salvado");
        return r;
    }
}

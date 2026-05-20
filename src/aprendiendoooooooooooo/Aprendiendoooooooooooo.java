
package aprendiendoooooooooooo;


public class Aprendiendoooooooooooo {

   
    public static void main(String[] args) {
   Libro l1 = new Libro("Gabriel Garcia marquez",
           "Cien annos de soledad");
        
           l1.setPaginas(2222);
   
        System.out.println("El libro lleva por titulo "+l1.getTitulo()+" ,su autor es"
                +" "+l1.getAutor()+", el ejemplar cuenta con "
                        + " "+l1.getPaginas()+" paginas. ");
    }
   }

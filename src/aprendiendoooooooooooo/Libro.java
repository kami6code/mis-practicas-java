
package aprendiendoooooooooooo;


public class Libro{
    
    
    private String autor;
    private String titulo;
    private int paginas;
    
    public Libro(String autor ,String titulo){
       this.autor = autor;
       this.titulo =titulo;
 
    }
 
    public int getPaginas(){
        
        return paginas;
     
    }
    public void setPaginas(int paginas){
        this.paginas= paginas;
    
    }
    public String getAutor(){
    
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String autor){
        this.titulo=titulo;
    }
}

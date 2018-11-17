package vt.poo.pkg1;
import java.util.Scanner;

public class DVD{
    private int codigo;
    private String titulo;
    private String ator1;
    private String ator2;
    private String diretor;
    private String categoria;
    private String caracteristica;
    private float valor;
    private int quantidade;

    public DVD() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("#######Cadastro de DVDs#######");
        
        System.out.println("Codigo: ");
        this.codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Titulo: ");
        this.titulo = sc.nextLine();
        
        /*
        System.out.println("Nome ator/atriz 1: ");
        this.ator1 = sc.nextLine();
        System.out.println("Nome ator/atriz 2: ");
        this.ator2 = sc.nextLine();
        System.out.println("Diretor: ");
        this.diretor = sc.nextLine();
        System.out.println("Caracteristica: ");
        this.caracteristica = sc.nextLine();*/
        System.out.println("Valor: ");
        this.valor = sc.nextFloat();
        System.out.println("Quantidade: ");
        this.quantidade = sc.nextInt();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAtor1() {
        return ator1;
    }

    public void setAtor1(String ator1) {
        this.ator1 = ator1;
    }

    public String getAtor2() {
        return ator2;
    }

    public void setAtor2(String ator2) {
        this.ator2 = ator2;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "DVD{" + "codigo=" + codigo + ", titulo=" + titulo + ", ator1=" + ator1 + ", ator2=" + ator2 + ", diretor=" + diretor + ", categoria=" + categoria + ", caracteristica=" + caracteristica + ", valor=" + valor + ", quantidade=" + quantidade + '}';
    }
    
    public boolean verificaEstoque(int n){
        if(this.quantidade >= n ){
            return true;
        }else{
            return false;
        }
    }
    
    public void darBaixa(){
        this.quantidade = this.quantidade -1;
    }

    

    

    
}

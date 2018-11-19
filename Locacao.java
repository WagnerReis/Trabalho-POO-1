package vt.poo.pkg1;
import java.util.ArrayList;

public class Locacao{
    private Cliente cliente;
    private String data_locacao;
    private int quanti;
    
    ArrayList<DVD> dvd = new ArrayList<>();
    

    public Locacao(Cliente cliente) {
        super();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(String data_locacao) {
        this.data_locacao = data_locacao;
    }

    public ArrayList<DVD> getDvd() {
        return dvd;
    }

    public void setDvd(ArrayList<DVD> dvd) {
        this.dvd = dvd;
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }

    public int getQuanti() {
        return quanti;
    }

    public void setQuanti(int quanti) {
        this.quanti = quanti;
    }
    
    void adicionarDVD(DVD dvd){
        this.dvd.add( dvd);
    }
    
    float soma = 0;
    
    float calcularValorTotal(){
        for (int i = 0; i < this.quanti; i++) {
            soma += dvd.get(i).getValor();
        }
        return soma;
    }
    
    void EmitirRecibo(){
        System.out.println("Nome do cliente: " + cliente.getNome() + " , Codigo: " + cliente.getCodigo());
        for(int i = 0; i < dvd.size(); i++){
            System.out.println("Codigo do DVD: " + dvd.get(i).getCodigo() + " , Titulo: " + dvd.get(i).getTitulo() + 
                                "\nValor de locação: " + dvd.get(i).getValor());
        }
        System.out.println("Valor total de locação: " + soma);
    }
}

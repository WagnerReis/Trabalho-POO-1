package vt.poo.pkg1;
import java.util.Scanner;

public class Cliente {
    private int codigo;
    private String nome;
    private String rua;
    private int numero;
    private String bairro;
    private String estado;
    private int cep;
    private int telefone;
    private String email;
    private String cpf;
    private String profissao;

    public Cliente() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("#######Cadastro de Cliente#######");
        System.out.println("Codigo: ");
        this.codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Nome: ");
        this.nome = sc.nextLine();
        /*
        System.out.println("Rua: ");
        this.rua = sc.nextLine();
        System.out.println("Numero: ");
        this.numero = sc.nextInt();
        System.out.println("Bairo: ");
        this.bairro = sc.nextLine();
        sc.nextLine();
        System.out.println("Estado: ");
        this.estado = sc.nextLine();
        System.out.println("CEP: ");
        this.cep = sc.nextInt();
        System.out.println("telefone: ");
        this.telefone = sc.nextInt();
        sc.nextLine();
        System.out.println("Email: ");
        this.email = sc.nextLine();
        System.out.println("CPF: ");
        this.cpf = sc.nextLine();
        System.out.println("Profissao: ");
        this.profissao = sc.nextLine();*/
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nome = " + nome + ", Codigo = " + this.codigo + '}';
    }

    
}

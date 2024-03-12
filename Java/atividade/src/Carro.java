import java.util.ArrayList;

public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private int anoDeLancamento;
    private String cor;
    private int velocidadeAtual;
    private int acelerar = 20;
    private int frear = -20;

    public Carro (
            String modelo, String marca, String placa,int anoDeLancamento,
            String cor
    ) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.anoDeLancamento = anoDeLancamento;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void exibirInfoCarro() {
        System.out.println(
                "Modelo: " + modelo +
                "\nMarca: " + marca +
                "\nPlaca: " + placa +
                "\nAno de lançamento: " + anoDeLancamento +
                "\nCor: " + cor
        );
    }

    public void acelerarCarro(int velocidade) {
        this.acelerar++;
    }
}

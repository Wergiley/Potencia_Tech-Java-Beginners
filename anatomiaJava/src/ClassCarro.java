// Aula Java POO - Classes.
class ClassCarro {
    String cor;
    String modelo;
    int capacidadeTanque;

    // método construtor aqui:
    ClassCarro() {

    }

    ClassCarro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    //fim do construtor.

    // conjutos de sets, gets...
    void setCor(String cor) {
        this.cor = cor;
    }
    
    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // método total:
    double totalValorTanque(double ValorCombustivel) {
        return capacidadeTanque * ValorCombustivel;
    }
    // fim do metodo.

    // Criando Objetos...


    // sobrecarga - são diversos parâmetros por varias alternativas diferentes.
}
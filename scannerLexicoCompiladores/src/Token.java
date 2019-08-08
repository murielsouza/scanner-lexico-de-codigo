/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msc.estagiario
 */
public class Token {
    private String token;
    private String identificacao;
    private int tamanho;
    private String posicao;

    public Token() {
    }

    public Token(String token, String identificacao, int tamanho, String posicao) {
        this.token = token;
        this.identificacao = identificacao;
        this.tamanho = tamanho;
        this.posicao = posicao;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Token{" + "token=" + token + ", identificacao=" + identificacao + ", tamanho=" + tamanho + ", posicao=" + posicao + '}';
    }
    
    
    
}

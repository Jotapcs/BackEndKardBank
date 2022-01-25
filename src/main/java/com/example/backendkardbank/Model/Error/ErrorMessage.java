package com.example.backendkardbank.Model.Error;

public class ErrorMessage {

    private String title;

    private Integer status;

    private String mensagem;

    public ErrorMessage(String titulo, Integer status, String mensagem) {
        this.title = titulo;
        this.status = status;
        this.mensagem = mensagem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}

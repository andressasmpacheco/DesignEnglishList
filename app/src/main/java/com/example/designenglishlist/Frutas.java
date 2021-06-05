package com.example.designenglishlist;

public class Frutas {
    private String name;
    private String pronunciation;
    private String description;
    private String descricao;
    private int miniatura;

    public Frutas(String name, String pronunciation, String description, String descricao, int miniatura) {
        this.name = name;
        this.pronunciation = pronunciation;
        this.description = description;
        this.descricao = descricao;
        this.miniatura = miniatura;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}

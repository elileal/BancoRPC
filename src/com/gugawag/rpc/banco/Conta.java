package com.gugawag.rpc.banco;

import java.io.Serializable;

/**
 * Conta
 */
public class Conta implements Serializable {

    private String num;
    private Double saldo;

    public Conta (String num, Double saldo) {
        this.num = num;
        this.saldo = saldo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
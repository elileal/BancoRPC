package com.gugawag.rpc.banco;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class BancoServiceServer extends UnicastRemoteObject implements BancoServiceIF {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private List<Conta> contas;

    public BancoServiceServer() throws RemoteException {
        this.contas = new ArrayList<>();
    }

//    @Override
//    public double saldo(String conta) throws RemoteException {
//        System.out.println(contas.toString());
////        System.out.println(contas.get(Integer.parseInt(conta)));
//        return 0.0;
//    }

//    @Override
//    public int quantidadeContas() throws RemoteException {
//        return contas.size();
//    }

    @Override
    public String cadastrarConta() throws RemoteException {
        Conta c = new Conta(Integer.toString(contas.size()+1), 0.0);
        return c.getNum();
    }
}

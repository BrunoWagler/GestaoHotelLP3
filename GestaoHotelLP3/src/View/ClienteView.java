package View;

import Model.ClienteModel;

import javax.swing.*;

public class ClienteView
{
    public ClienteModel leituraCliente()
    {
        ClienteModel cliente = new ClienteModel();

        cliente.setNome(JOptionPane.showInputDialog(null, "entre com o nome do cliente"));
        cliente.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "entre com o CPF do cliente")));
        cliente.setEmail(JOptionPane.showInputDialog(null, "entre com o e-mail do cliente"));
        cliente.setTelefone(Long.parseLong(JOptionPane.showInputDialog(null, "entre com o número do telefone do cliente")));
        
        return cliente;
    }



}

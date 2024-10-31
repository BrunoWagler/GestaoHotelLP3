package Controller;

import javax.swing.*;
import Model.ClienteModel;
import Repository.ClienteRepository;

public class ClienteController
{
    ClienteRepository clienterepository = new ClienteRepository();

    public String salvar(ClienteModel cliente)
    {

        if (!cliente.getNome().isEmpty() && cliente.getNome() != "")
        {
            String retornorepository = clienterepository.salvar(cliente);
            return retornorepository;
        }
        else
        {
            return "O nome é Obrigatorio";
        }



    }



}

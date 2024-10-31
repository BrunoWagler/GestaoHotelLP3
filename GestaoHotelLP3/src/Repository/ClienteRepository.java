package Repository;

import Model.ClienteModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository
{
    List<ClienteModel> listaDeClientes = new ArrayList<ClienteModel>();

    public String salvar(ClienteModel cliente)
    {
        listaDeClientes.add(cliente);
        return "Salvo com sucesso";
    }



}

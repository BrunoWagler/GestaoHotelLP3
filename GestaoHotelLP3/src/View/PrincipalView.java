package View;

import Controller.ClienteController;
import Model.ClienteModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrincipalView
{

    public static void menu()
    {
        ClienteModel cliente = new ClienteModel();
        ClienteController clientecontroller = new ClienteController();
        List<ClienteModel> listaDeClienteModels = new ArrayList<ClienteModel>();
        ClienteView clienteview = new ClienteView();

        String menu = "1 - Para Cadastrar Clientes\n2 - Para listar todos os clientes cadastrados\n0 - Para Sair";
        int opcao = 0;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,menu));
            switch (opcao)
            {
                case 1:

                   cliente = clienteview.leituraCliente();
                   String retornocontroller = clientecontroller.salvar(cliente);
                   JOptionPane.showMessageDialog(null,retornocontroller);

                    break;

                    case 2:

                    break;

                    default:

                    JOptionPane.showMessageDialog(null,"Opção incorreta");
            }
        }while(opcao !=0);


    }






}

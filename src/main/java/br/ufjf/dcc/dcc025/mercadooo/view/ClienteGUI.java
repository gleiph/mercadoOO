package br.ufjf.dcc.dcc025.mercadooo.view;

import br.ufjf.dcc.dcc025.mercadooo.controller.CadastraCliente;
import br.ufjf.dcc.dcc025.mercadooo.controller.CancelaCliente;
import br.ufjf.dcc.dcc025.mercadooo.model.Cliente;
import br.ufjf.dcc.dcc025.mercadooo.model.Dados;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class ClienteGUI {
        private JTextField tfNome;
        private JTextField tfCpfcnpj;
        private JTextField tfEndereco;
        private JTextField tfDataNascimento;
        private JTextField tfEmail;
        private JTextField tfTelefone;

        public ClienteGUI() {
            this.tfNome = new JTextField(50);
            this.tfCpfcnpj = new JTextField(50);
            this.tfEndereco = new JTextField(50);
            this.tfDataNascimento = new JTextField(50);
            this.tfEmail = new JTextField(50);
            this.tfTelefone = new JTextField(50);
        }

        public JPanel desenha() {
            JPanel painel = new JPanel();

            JLabel jlNome = new JLabel("Nome:");
            JLabel jlCpfcnpj = new JLabel("CNPJ:");
            JLabel jlEndereco = new JLabel("Endereço:");
            JLabel jlDataNascimento = new JLabel("Data de Nascimento:");
            JLabel jlEmail = new JLabel("E-mail:");
            JLabel jlTelefone = new JLabel("Telefone: ");
            

            painel.setLayout(new GridLayout(0, 2));

            painel.add(jlNome);
            painel.add(tfNome);

            painel.add(jlCpfcnpj);
            painel.add(tfCpfcnpj);

            painel.add(jlEndereco);
            painel.add(tfEndereco);

            painel.add(jlDataNascimento);
            painel.add(tfDataNascimento);

            painel.add(jlEmail);
            painel.add(tfEmail);

            painel.add(jlTelefone);
            painel.add(tfTelefone);

            return painel;
        }


        public JPanel botaoCadastro() {
            JPanel painel = new JPanel();

            JButton botaoCadastrar = new JButton("Cadastrar");
            botaoCadastrar.addActionListener(new CadastraCliente(this));

            JButton botaoCancelar = new JButton("Cancelar");
            botaoCancelar.addActionListener(new CancelaCliente());

            painel.add(botaoCadastrar);

            painel.add(botaoCancelar);

            return painel;
        }

        public static void main(String[] args) {
            JFrame tela = new JFrame("Cadastra Cliente");
            ClienteGUI clienteGUI = new ClienteGUI();

            tela.setSize(600, 300);

            tela.setLayout(new BorderLayout());

            tela.add(clienteGUI.desenha(), BorderLayout.CENTER);


            tela.add(clienteGUI.botaoCadastro(), BorderLayout.SOUTH);

            tela.setVisible(true);
            tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

        public JTextField getTfCpfcnpj() {
            return tfCpfcnpj;
        }
        public JTextField getTfDataNascimento() {
            return tfDataNascimento;
        }
        public JTextField getTfEmail() {
            return tfEmail;
        }
        public JTextField getTfEndereco() {
            return tfEndereco;
        }
        public JTextField getTfNome() {
            return tfNome;
        }
        public JTextField getTfTelefone() {
            return tfTelefone;
        }
}

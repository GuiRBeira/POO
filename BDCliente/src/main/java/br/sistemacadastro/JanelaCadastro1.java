package br.sistemacadastro;

public class JanelaCadastro1 {
    public void consultar() {

        Cliente cliente = new Cliente();

        cliente = bdcliente.consultar(tfCPF.getText());

        if (cliente != null) {

            tfNome.setText(cliente.getNome());

            tfCPF.setText(cliente.getCPF());

        } else {

            JOptionPane.showMessageDialog(null, "Não encontrado", "Janela Cadastro", JOptionPane.ERROR_MESSAGE);

            limpar();

        }

    }

public void consultar() {

        Cliente cliente = new Cliente();

        cliente = bdcliente.consultar(tfCPF.getText());

        if (cliente != null) {

            tfNome.setText(cliente.getNome());

            tfCPF.setText(cliente.getCPF());

        } else {

            JOptionPane.showMessageDialog(null, "Não encontrado", "Janela Cadastro", JOptionPane.ERROR_MESSAGE);

            limpar();

        }

    }

    public void remover() {

        if (bdcliente.remover(tfCPF.getText())) {

            JOptionPane.showMessageDialog(null, "OK", "Janela Cadastro", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Não encontrado", "Janela Cadastro", JOptionPane.ERROR_MESSAGE);
        }

        limpar();

    }

    public void limpar() {

        tfNome.setText("");

        tfCPF.setText("");

    }

    public void inserir() {

        Cliente cliente = new Cliente();

        cliente.setNome(tfNome.getText());

        cliente.setCPF(tfCPF.getText());

        bdcliente.inserir(cliente);

        if (bdcliente.consultar(tfCPF.getText()) != null) {
            JOptionPane.showMessageDialog(null, "OK", "Janela Cadastro",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void atualizar() {

        Cliente cliente = new Cliente();

        cliente.setNome(tfNome.getText());

        cliente.setCPF(tfCPF.getText());

        if (bdcliente.atualizar(cliente) != null) {
            JOptionPane.showMessageDialog(null, "OK", "Janela Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "CPF não encontrado", "Janela Cadastro", JOptionPane.ERROR_MESSAGE);
        }

    }
}
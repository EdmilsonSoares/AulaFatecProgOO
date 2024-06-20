package aula01_memoria;

import javax.swing.*;
import java.awt.*;

public class ExemploJScrollPane {

    public static void main(String[] args) {
        // Cria um novo frame (janela)
        JFrame frame = new JFrame("Lista de Nomes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Lista de nomes
        DefaultListModel<String> listaModelo = new DefaultListModel<>();
        listaModelo.addElement("Alice");
        listaModelo.addElement("bob");
        listaModelo.addElement("charlie");
        listaModelo.addElement("Dave");
        listaModelo.addElement("Eve");
        listaModelo.addElement("Frank");
        listaModelo.addElement("Grace");
        listaModelo.addElement("Hannah");
        // Cria uma JList com a lista de nomes
        JList<String> nameList = new JList<>(listaModelo);
        
        // Adiciona a JList a um JScrollPane para habilitar a barra de rolagem
        JScrollPane scrollPane = new JScrollPane(nameList);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Adiciona o JScrollPane ao frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Torna a janela visível
        frame.setVisible(true);
    }
}


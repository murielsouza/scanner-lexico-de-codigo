import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Character.isDigit;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.FileWriter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius Cavichioli
 */
public class interfacePrincipal extends javax.swing.JFrame {
    public static ArrayList<String> listaPalavrasReservadas = new ArrayList();
    public static ArrayList<String> listaOperadores = new ArrayList();
    public static ArrayList<Character> listaTerminadores = new ArrayList();
    public static ArrayList<String> listaIdentificadores = new ArrayList();
    //public static ArrayList<String> listaConstantes = new ArrayList();
    //public static ArrayList<Integer> listaNumeros = new ArrayList();
    public static ArrayList<String> listaIndices = new ArrayList();
    public static ArrayList<String> listaJSONTokens = new ArrayList();
    public static ArrayList<String> listaJSONSimbolos = new ArrayList();
    
    /**
     * Creates new form Interface
     */
    public interfacePrincipal() {
        initComponents();
        txtCaixa.setEnabled(false);
        DefaultTableModel modeloSimbolos = (DefaultTableModel)tbSimbolos.getModel();
        diretoNoCodigo();
        
        //analisar(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnalisar = new javax.swing.JButton();
        txtCaixa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSimbolos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbScannerLexico = new javax.swing.JTable();
        menuPrincipal = new javax.swing.JMenuBar();
        menuSecAnalitice = new javax.swing.JMenu();
        itemMenuAnalisar = new javax.swing.JMenuItem();
        menuSecAbout = new javax.swing.JMenu();
        menuSecSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnalisar.setBackground(new java.awt.Color(153, 255, 102));
        btnAnalisar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAnalisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/search.png"))); // NOI18N
        btnAnalisar.setText("Buscar & Analisar");
        btnAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisarActionPerformed(evt);
            }
        });

        txtCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaixaActionPerformed(evt);
            }
        });

        tbSimbolos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Indice", "Simbolo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbSimbolos);

        tbScannerLexico.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        tbScannerLexico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Token", "Identificação", "Tamanho", "Posição (0, x)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbScannerLexico);

        menuSecAnalitice.setBorder(null);
        menuSecAnalitice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/analisar.png"))); // NOI18N
        menuSecAnalitice.setText("<html> <body> <b> <font face=\"verdana\"> ANALISAR </font> </b>  </body> </html>");

        itemMenuAnalisar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        itemMenuAnalisar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        itemMenuAnalisar.setText("Analisar código descritivo");
        itemMenuAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAnalisarActionPerformed(evt);
            }
        });
        menuSecAnalitice.add(itemMenuAnalisar);

        menuPrincipal.add(menuSecAnalitice);

        menuSecAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/info.png"))); // NOI18N
        menuSecAbout.setText("<html> <body> <b> <font face=\"verdana\">SOBRE </font> </b>  </body> </html>");
        menuSecAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSecAboutMouseClicked(evt);
            }
        });
        menuPrincipal.add(menuSecAbout);

        menuSecSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/off.png"))); // NOI18N
        menuSecSair.setText("<html> <body> <b> <font face=\"verdana\"> SAIR </font> </b>  </body> </html>");
        menuSecSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSecSairMouseClicked(evt);
            }
        });
        menuPrincipal.add(menuSecSair);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(txtCaixa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnalisar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalisar)
                    .addComponent(txtCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuAnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAnalisarActionPerformed
      
    }//GEN-LAST:event_itemMenuAnalisarActionPerformed

    private void menuSecAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSecAboutMouseClicked
        JOptionPane.showMessageDialog(null, "Muriel Souza e Vinicius Cavichioli. Disciplina: Compiladores, Profº: Jack Desevolvido por: ");
    }//GEN-LAST:event_menuSecAboutMouseClicked

    private void menuSecSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSecSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSecSairMouseClicked

    private void btnAnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisarActionPerformed
        //telaBuscarArquivo frame = new telaBuscarArquivo();
        //frame.setVisible(true);
        JFileChooser chooser;
        chooser = new JFileChooser();
        String caminho = "";
        //File file = null;
        int retorno = chooser.showOpenDialog(null); // showSaveDialog retorna um inteiro , e ele ira determinar que o chooser será para salvar.
        if (retorno==JFileChooser.APPROVE_OPTION){
            caminho = chooser.getSelectedFile().getAbsolutePath();
            txtCaixa.setText(caminho);// o getSelectedFile pega o arquivo e o getAbsolutePath retorna uma string contendo o endereço.
            
            File file = new File(caminho);
                FileReader fis;
                try {
                       fis = new FileReader(file);
                       BufferedReader bis = new BufferedReader(fis);
                       while(bis.ready()) {
                        analisar(bis.readLine()+"");
                        break;
                }
                bis.close();
                fis.close();
               } catch (FileNotFoundException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
              } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
            }
        }
        
       // new EscolherArquivo().buscar();
    }//GEN-LAST:event_btnAnalisarActionPerformed

    private void txtCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaixaActionPerformed
    public void analisar(String codigofonte){
        //String codigofonte = "while i < 100 do i = i + j;";
        DefaultTableModel modelo = (DefaultTableModel)tbScannerLexico.getModel(); modelo.setNumRows(0);
        DefaultTableModel modeloSimbolos = (DefaultTableModel)tbSimbolos.getModel(); modeloSimbolos.setNumRows(0);
        Map<Integer,String> dicionarioCode = new TreeMap<>();
        String erro = "";
        String word = "";
        int inicioWord = 0;
        for (int i = 0; codigofonte.length() > i; i++){     
            if(codigofonte.substring(i, i+1).equals(" ") || listaTerminadores.contains(codigofonte.substring(i, i+1).charAt(0))){
                dicionarioCode.put(inicioWord, word);
                word = "";
                inicioWord = i + 1;
                if (listaTerminadores.contains(codigofonte.substring(i, i+1).charAt(0)))
                    dicionarioCode.put(inicioWord,codigofonte.substring(i, i+1));
            }
            else{
                word = word + codigofonte.substring(i, i+1);
            }
        }
        System.out.println(dicionarioCode);
        
        String JSON = "";
                
        String[] linha;
                
        Set<Integer> chaves = dicionarioCode.keySet();
	for (int chave : chaves){  
            if(isPalavraReservada(dicionarioCode.get(chave))){
                //JSON = JSON + dicionarioCode.get(chave) + " | palavra reservada | " + dicionarioCode.get(chave).length() + "posição(0, " + chave + ")\n";
                Token t = new Token(dicionarioCode.get(chave), "palavra reservada", dicionarioCode.get(chave).length(), "(0, " + chave + ")");
                criarJSON(t);
                linha = new String[]{dicionarioCode.get(chave)+"", "palavra reservada"+"", dicionarioCode.get(chave).length()
        +"","(0, " + chave + ")"};
                modelo.addRow(linha);
            }
            
            else if(isOperador(dicionarioCode.get(chave))){
                //JSON = JSON + dicionarioCode.get(chave) + " | operador | " + dicionarioCode.get(chave).length() + " | posição(0, " + chave + ")\n";
                Token t = new Token(dicionarioCode.get(chave), "operador", dicionarioCode.get(chave).length(), "(0, " + chave + ")");
                criarJSON(t);
                linha = new String[]{dicionarioCode.get(chave)+"", "operador"+"", dicionarioCode.get(chave).length()
        +"","(0, " + chave + ")"};
                modelo.addRow(linha);
            }
            
            else if(isIdentificador(dicionarioCode.get(chave))){                    
                //JSON = JSON + dicionarioCode.get(chave) + " | [identificador, "+ idSimbolo + "] |" + dicionarioCode.get(chave).length() + " | posição(0, " + chave + ")\n";
                Token t = new Token(dicionarioCode.get(chave), "[identificador, "+ (listaIndices.indexOf(dicionarioCode.get(chave))+1) + "]", dicionarioCode.get(chave).length(), "(0, " + chave + ")");
                criarJSON(t);
                linha = new String[]{dicionarioCode.get(chave)+"", "[identificador, "+ (listaIndices.indexOf(dicionarioCode.get(chave))+1) + "]"+"", dicionarioCode.get(chave).length()
        +"","(0, " + chave + ")"};
                modelo.addRow(linha);
            }
            
            else if(isConstante(dicionarioCode.get(chave))){
                //JSON = JSON + dicionarioCode.get(chave) + " | [identificador, "+ idSimbolo + "] |" + dicionarioCode.get(chave).length() + " | posição(0, " + chave + ")\n";
                Token t = new Token(dicionarioCode.get(chave), "[constante, "+ (listaIndices.indexOf(dicionarioCode.get(chave))+1) + "]", dicionarioCode.get(chave).length(), "(0, " + chave + ")");
                criarJSON(t); 
                linha = new String[]{dicionarioCode.get(chave)+"", "[constante, "+ (listaIndices.indexOf(dicionarioCode.get(chave))+1)+ "]"+"", dicionarioCode.get(chave).length()
        +"","(0, " + chave + ")"};
                 modelo.addRow(linha);
            }
            
            else if(isTerminador(dicionarioCode.get(chave))){
                //JSON = JSON + dicionarioCode.get(chave) + " | terminador | " + dicionarioCode.get(chave).length() + " | posição(0, " + chave + ")\n";
                Token t = new Token(dicionarioCode.get(chave), "terminador", dicionarioCode.get(chave).length(), "(0, " + chave + ")");
                criarJSON(t);
                linha = new String[]{dicionarioCode.get(chave)+"", "terminador"+"", dicionarioCode.get(chave).length()
        +"","(0, " + chave + ")"};
                modelo.addRow(linha);
            }
            
            else{
                erro = "Não foi possivel achar nenhum contexto para " + dicionarioCode.get(chave)+ ", esse elemento está na posição: " + "(0, " + chave + ")";
                JOptionPane.showMessageDialog(null, erro);
                break;
            }
            
	}
        JsonObject Jzao = new JsonObject();
        imprimirSaida(listaJSONTokens, listaJSONSimbolos, erro);
         
    }
     public boolean isPalavraReservada(String p){
         return listaPalavrasReservadas.contains(p);
     }
     
     public boolean isOperador(String p){
         return listaOperadores.contains(p);
     }
     
     public boolean isIdentificador(String p){
         if(listaIdentificadores.contains(p)){
             DefaultTableModel modeloSimbolos = (DefaultTableModel)tbSimbolos.getModel();
             if(!listaIndices.contains(p)){
                listaIndices.add(p);
                JsonObject simbolo = new JsonObject();
                simbolo.addProperty("indice",listaIndices.size());
                simbolo.addProperty("simbolo", p);
                listaJSONSimbolos.add(simbolo.toString());
                modeloSimbolos.addRow(new String[]{(listaIndices.size())+"",p});
                 //System.out.println(simbolo.toString());
             }
             return true;
         }
         return false;
     }
     
     public boolean isConstante(String p){
        for (int i = 0; p.length() > i; i++){     
            if(!isDigit((p.substring(i, i+1).charAt(0)))){
                return false;
            }
        }
        DefaultTableModel modeloSimbolos = (DefaultTableModel)tbSimbolos.getModel();
        if(!listaIndices.contains(p)){
            listaIndices.add(p);
            JsonObject simbolo = new JsonObject();
                simbolo.addProperty("indice",listaIndices.size());
                simbolo.addProperty("simbolo", p);
                listaJSONSimbolos.add(simbolo.toString());
            modeloSimbolos.addRow(new String[]{(listaIndices.indexOf(p)+1)+"",p});
        }
        return true;
     }
     
     public boolean isTerminador(String p){
         if (p.length() == 1){
            return listaTerminadores.contains(p.charAt(0));
         }
         return false;
     }
    
    public void diretoNoCodigo(){
        listaPalavrasReservadas.add("while");
        listaPalavrasReservadas.add("do");
        
        listaOperadores.add("<");
        listaOperadores.add("=");
        listaOperadores.add("+");
        
        listaTerminadores.add(';');
        
        listaIdentificadores.add("i");
        listaIdentificadores.add("j");       
    }
    public void criarJSON(Token t){
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String JSON = gson.toJson(t);
        listaJSONTokens.add(JSON);
        //System.out.println(JSON);
    }
    
    public void imprimirSaida(ArrayList<String> tokens, ArrayList<String> simbolos, String erro){
        String saida = "{";
        for (String s : tokens){
            saida = saida + "\n\t" + s + ",";
        }
        saida = saida + "\n},\n{";
        
        for (String s : simbolos){
            saida = saida + "\n\t" + s + ",";
        }
        saida = saida + "\n}";
        if(!erro.isEmpty())
            saida = saida + ",\n{\n\t" + erro + "\n}";
        System.out.println(saida);
        FileWriter arquivo;
		try {
			arquivo = new FileWriter(new File("scannerLexico.json"));
			arquivo.write(saida);
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfacePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisar;
    private javax.swing.JMenuItem itemMenuAnalisar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuSecAbout;
    private javax.swing.JMenu menuSecAnalitice;
    private javax.swing.JMenu menuSecSair;
    private javax.swing.JTable tbScannerLexico;
    private javax.swing.JTable tbSimbolos;
    private javax.swing.JTextField txtCaixa;
    // End of variables declaration//GEN-END:variables
}

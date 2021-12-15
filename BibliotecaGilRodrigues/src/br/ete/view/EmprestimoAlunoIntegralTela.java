package br.ete.view;

import br.ete.controller.AlunoIntegralController;
import br.ete.controller.EmprestimoController;
import br.ete.controller.LivroController;
import br.ete.dto.EmprestimoDto;
import br.ete.dto.LivroDto;
import br.ete.table.AlunoIntegralTableModel;
import br.ete.table.LivroTableModel;
import br.ete.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class EmprestimoAlunoIntegralTela extends javax.swing.JFrame {

    private EmprestimoDto emprestimo = new EmprestimoDto();
    private EmprestimoController emprestimoController = new EmprestimoController();
    private LivroController livroController = new LivroController();
    private MaskFormatter formatoTel;

    public EmprestimoAlunoIntegralTela() {
        super("Empréstimo");
        initComponents();
        listarTodosAlunos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPai = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pesquisacb = new javax.swing.JComboBox<>();
        pesquisatf = new javax.swing.JTextField();
        okalunobt = new javax.swing.JButton();
        cancelarbt = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        nometf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        try{
            formatoTel = new MaskFormatter ("(##) #####-####");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Campo", "Ero", 0);
        }
        telefonetf = new JFormattedTextField(formatoTel);
        jLabel13 = new javax.swing.JLabel();
        turmatf = new javax.swing.JTextField();
        idtf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        matriculatf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nomeresponsaveltf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        try{
            formatoTel = new MaskFormatter ("(##) #####-####");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Campo", "Ero", 0);
        }
        telefoneresponsaveltf = new JFormattedTextField(formatoTel);
        jScrollPane2 = new javax.swing.JScrollPane();
        alunotb = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        oklivrobt = new javax.swing.JButton();
        cancelarbt1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        autortf = new javax.swing.JTextField();
        quantidadetf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        titulotf = new javax.swing.JTextField();
        disponiveistf = new javax.swing.JTextField();
        idlivrotf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pesquisartf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        livrotb = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        matriculaemprestimotf = new javax.swing.JTextField();
        turmaemprestimotf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        nomeemprestimotf = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        autoremprestimotf = new javax.swing.JTextField();
        tituloemprestimotf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        okemprestimobt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        painelPai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("Dados do Aluno");

        pesquisacb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesquisacb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a opção de pesquisa:", "Nome", "Matrícula" }));

        pesquisatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pesquisatf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisatfActionPerformed(evt);
            }
        });

        okalunobt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okalunobt.setText("OK");
        okalunobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okalunobtActionPerformed(evt);
            }
        });

        cancelarbt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarbt.setText("Cancelar");
        cancelarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Turma:");

        nometf.setEditable(false);
        nometf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Matrícula:");

        telefonetf.setEditable(false);
        telefonetf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Código:");

        turmatf.setEditable(false);
        turmatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        idtf.setEditable(false);
        idtf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Telefone:");

        matriculatf.setEditable(false);
        matriculatf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("E-mail:");

        emailtf.setEditable(false);
        emailtf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setText("Dados do Responsável");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Nome:");

        nomeresponsaveltf.setEditable(false);
        nomeresponsaveltf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Telefone:");

        telefoneresponsaveltf.setEditable(false);
        telefoneresponsaveltf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        alunotb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "Turma", "Telefone", "E-mail", "Responsável", "Tel. Respons.", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        alunotb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunotbMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(alunotb);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel4)))
                                        .addGap(1, 1, 1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(matriculatf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(turmatf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(telefonetf, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                        .addComponent(emailtf, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nometf, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneresponsaveltf, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeresponsaveltf, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(107, 107, 107)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pesquisacb, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pesquisatf, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(okalunobt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(matriculatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel13)
                                    .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(nometf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pesquisacb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pesquisatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(okalunobt)
                                    .addComponent(cancelarbt))
                                .addGap(54, 54, 54))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(turmatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(telefonetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(nomeresponsaveltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(telefoneresponsaveltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        painelPai.addTab("Aluno", jPanel1);

        oklivrobt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oklivrobt.setText("OK");
        oklivrobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oklivrobtActionPerformed(evt);
            }
        });

        cancelarbt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarbt1.setText("Cancelar");
        cancelarbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbt1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Título:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Autores:");

        autortf.setEditable(false);
        autortf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        quantidadetf.setEditable(false);
        quantidadetf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Código:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Pesquisar: (Título)");

        titulotf.setEditable(false);
        titulotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        disponiveistf.setEditable(false);
        disponiveistf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        idlivrotf.setEditable(false);
        idlivrotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Disponíveis:");

        pesquisartf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pesquisartf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisartfMouseClicked(evt);
            }
        });
        pesquisartf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisartfActionPerformed(evt);
            }
        });

        livrotb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Autores", "Quantidade", "Disponíveis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        livrotb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                livrotbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(livrotb);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Quantidade:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Dados do Livro");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Dados do Empréstimo");

        matriculaemprestimotf.setEditable(false);
        matriculaemprestimotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        turmaemprestimotf.setEditable(false);
        turmaemprestimotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Matrícula:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Nome:");

        nomeemprestimotf.setEditable(false);
        nomeemprestimotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Turma:");

        autoremprestimotf.setEditable(false);
        autoremprestimotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        tituloemprestimotf.setEditable(false);
        tituloemprestimotf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Autores:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Título:");

        okemprestimobt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okemprestimobt.setText("OK");
        okemprestimobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okemprestimobtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel17))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantidadetf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(disponiveistf))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idlivrotf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(titulotf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(autortf, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisartf, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(oklivrobt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(117, 117, 117))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel22)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel21))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeemprestimotf)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(matriculaemprestimotf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(turmaemprestimotf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloemprestimotf)
                                    .addComponent(autoremprestimotf))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(okemprestimobt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idlivrotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(titulotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(autortf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(quantidadetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(disponiveistf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(15, 15, 15)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pesquisartf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(oklivrobt)
                                    .addComponent(cancelarbt1)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matriculaemprestimotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(turmaemprestimotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(nomeemprestimotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tituloemprestimotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(autoremprestimotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)))
                            .addComponent(jLabel24))
                        .addGap(26, 26, 26)
                        .addComponent(okemprestimobt)))
                .addContainerGap())
        );

        painelPai.addTab("Empréstimo", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPai)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelPai, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisatfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisatfActionPerformed
        if (pesquisacb.getSelectedIndex() == 1) {
            listarTodosNome(pesquisatf.getText());
        }
        if (pesquisacb.getSelectedIndex() == 2) {
            listarTodosMatricula(pesquisatf.getText());
        }
    }//GEN-LAST:event_pesquisatfActionPerformed

    private void okalunobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okalunobtActionPerformed
        if (nometf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "É preciso selecionar um aluno para prosseguir na solicitação", "Erro!", JOptionPane.WARNING_MESSAGE);
            listarTodosAlunos();
        } else {
            painelPai.setEnabledAt(1, true);
            painelPai.setEnabledAt(0, false);
            painelPai.setSelectedIndex(1);
            matriculaemprestimotf.setText(matriculatf.getText());
            nomeemprestimotf.setText(nometf.getText());
            turmaemprestimotf.setText(turmatf.getText());
            listarTodosLivros();
        }

    }//GEN-LAST:event_okalunobtActionPerformed

    private void cancelarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarbtActionPerformed

    private void oklivrobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oklivrobtActionPerformed
        if(titulotf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "É preciso selecionar um livro para prosseguir na solicitação", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
        tituloemprestimotf.setText(titulotf.getText());
        autoremprestimotf.setText(autortf.getText());
    }//GEN-LAST:event_oklivrobtActionPerformed

    private void cancelarbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbt1ActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarbt1ActionPerformed

    private void pesquisartfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisartfMouseClicked

        String titulo = pesquisartf.getText();
        livrotb.setModel(new LivroTableModel(new LivroController().buscarPorTitulo(titulo)));
    }//GEN-LAST:event_pesquisartfMouseClicked

    private void livrotbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_livrotbMouseClicked
        idlivrotf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_ID_LIVRO).toString());
        autortf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_AUTOR_LIVRO).toString());
        titulotf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_TITULO_LIVRO).toString());
        quantidadetf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_QUANTIDADE_LIVRO).toString());
        disponiveistf.setText(livrotb.getValueAt(livrotb.getSelectedRow(), LivroTableModel.COL_DISPONIVEIS_LIVRO).toString());
    }//GEN-LAST:event_livrotbMouseClicked

    private void okemprestimobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okemprestimobtActionPerformed

        if (tituloemprestimotf.getText().equals("") || autoremprestimotf.equals("")) {
            JOptionPane.showMessageDialog(null, "É preciso selecionar algum livro para realizar o empréstimo.", "Empréstimo", JOptionPane.WARNING_MESSAGE);
        } else {

            emprestimo.setIdLivro(Long.parseLong(idlivrotf.getText()));
            emprestimo.setMatricula(matriculatf.getText());
            emprestimo.setNomeAluno(nomeemprestimotf.getText());
            emprestimo.setTituloLivro(tituloemprestimotf.getText());
            confirmarEmprestimo(emprestimo);

        }
    }//GEN-LAST:event_okemprestimobtActionPerformed

    private void alunotbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunotbMouseClicked

        matriculatf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_MATRICULA_ALUNO).toString());
        nometf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_NOME_ALUNO).toString());
        turmatf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_TURMA_ALUNO).toString());
        telefonetf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_TELEFONE_ALUNO).toString());
        emailtf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_EMAIL_ALUNO).toString());
        nomeresponsaveltf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_NOMERESPONSAVEL_ALUNO).toString());
        telefoneresponsaveltf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_TELEFONERESPONSAVEL_ALUNO).toString());
        idtf.setText(alunotb.getValueAt(alunotb.getSelectedRow(), AlunoIntegralTableModel.COL_ID_ALUNO).toString());
    }//GEN-LAST:event_alunotbMouseClicked

    private void pesquisartfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisartfActionPerformed
        listarTodosPorTitulo(pesquisartf.getText());
    }//GEN-LAST:event_pesquisartfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alunotb;
    private javax.swing.JTextField autoremprestimotf;
    private javax.swing.JTextField autortf;
    private javax.swing.JButton cancelarbt;
    private javax.swing.JButton cancelarbt1;
    private javax.swing.JTextField disponiveistf;
    private javax.swing.JTextField emailtf;
    private javax.swing.JTextField idlivrotf;
    private javax.swing.JTextField idtf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable livrotb;
    private javax.swing.JTextField matriculaemprestimotf;
    private javax.swing.JTextField matriculatf;
    private javax.swing.JTextField nomeemprestimotf;
    private javax.swing.JTextField nomeresponsaveltf;
    private javax.swing.JTextField nometf;
    private javax.swing.JButton okalunobt;
    private javax.swing.JButton okemprestimobt;
    private javax.swing.JButton oklivrobt;
    private javax.swing.JTabbedPane painelPai;
    private javax.swing.JComboBox<String> pesquisacb;
    private javax.swing.JTextField pesquisartf;
    private javax.swing.JTextField pesquisatf;
    private javax.swing.JTextField quantidadetf;
    private javax.swing.JTextField telefoneresponsaveltf;
    private javax.swing.JTextField telefonetf;
    private javax.swing.JTextField tituloemprestimotf;
    private javax.swing.JTextField titulotf;
    private javax.swing.JTextField turmaemprestimotf;
    private javax.swing.JTextField turmatf;
    // End of variables declaration//GEN-END:variables

    public void listarTodosAlunos() {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "Select * from alunointegral";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) alunotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("matricula"), rs.getString("nome"), rs.getString("turma"), rs.getString("telefone"), rs.getString("email"), rs.getString("nomeResponsavel"), rs.getString("telefoneResponsavel"), rs.getString("id")});
            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public void listarTodosLivros() {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "Select * from livro";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) livrotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("id"), rs.getString("titulo"), rs.getString("autor"), rs.getInt("quantidade"), rs.getInt("disponivel")});

            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    private void confirmarEmprestimo(EmprestimoDto emprestimo) {
        ArrayList<LivroDto> livro = livroController.buscarPorTitulo(tituloemprestimotf.getText());
        int escolha = JOptionPane.showConfirmDialog(null, "Confirma o empréstimo? \n" + "Aluno: " + emprestimo.getNomeAluno() + "\n Matrícula: " + emprestimo.getMatricula() + "\n Livro: " + emprestimo.getTituloLivro(), "Empréstimo", JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
            livro.get(0).setDisponivel(livro.get(0).getDisponivel() - 1);
            if (livro.get(0).getDisponivel() <= 0) {
                JOptionPane.showMessageDialog(null, "Livro Indisponível!");
                dispose();

            } else {
                livroController.editar(livro.get(0));
                emprestimoController.salvar(emprestimo);
                dispose();
            }
        }
    }

    public void listarTodosMatricula(String matricula) {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM alunoIntegral WHERE matricula LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, matricula);
            stmt.execute();
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) alunotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("matricula"), rs.getString("nome"), rs.getString("turma"), rs.getString("telefone"), rs.getString("email"), rs.getString("nomeResponsavel"), rs.getString("telefoneResponsavel"), rs.getString("id")});

            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    public void listarTodosNome(String nome) {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT * FROM alunoIntegral WHERE nome LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.execute();
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) alunotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("matricula"), rs.getString("nome"), rs.getString("turma"), rs.getString("telefone"), rs.getString("email"), rs.getString("nomeResponsavel"), rs.getString("telefoneResponsavel"), rs.getString("id")});

            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    public void listarTodosPorTitulo(String titulo) {

        try {
            Connection conn = Conexao.getConnection();
            String sql = "Select * from livro WHERE titulo LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, titulo);
            stmt.execute();
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) livrotb.getModel();
            modeloTabela.setNumRows(0);

            while (rs.next()) {
                modeloTabela.addRow(new Object[]{rs.getString("id"), rs.getString("titulo"), rs.getString("autor"), rs.getInt("quantidade"), rs.getInt("disponivel")});

            }
            rs.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

}

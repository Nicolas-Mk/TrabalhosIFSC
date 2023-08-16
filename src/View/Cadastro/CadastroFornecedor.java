/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastro;

import View.Template.TemplateCadastro;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class CadastroFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form TemplateCadastro
     */
    public CadastroFornecedor() {
        initComponents();
    }

    public JButton getButtonCancel() {
        return buttonCancel;
    }

    public JButton getButtonExit() {
        return buttonExit;
    }

    public JButton getButtonGravar() {
        return buttonGravar;
    }

    public JButton getButtonNew() {
        return buttonNew;
    }

    public JButton getButtonSearch() {
        return buttonSearch;
    }

    public JLabel getDescricao() {
        return nome;
    }

    public JLabel getDescricao1() {
        return email;
    }


    public JTextField getDescricaoTF() {
        return nomeTF;
    }

    public JTextField getDescricaoTF1() {
        return emailTF;
    }


    public JLabel getId() {
        return id;
    }


    public JTextField getIdTF() {
        return idTF;
    }


    public JFormattedTextField getjFormattedTextField1() {
        return fone1TF;
    }

    public JFormattedTextField getjFormattedTextField2() {
        return fone2TF;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JPanel getPanelBottom() {
        return panelBottom;
    }

    public JPanel getPanelMid() {
        return panelMid;
    }

    public JPanel getPanelTop() {
        return panelTop;
    }

    public JLabel getRf() {
        return fone1;
    }

    public JLabel getRf1() {
        return fone2;
    }

    public JLabel getRf2() {
        return cnpj;
    }

    public JLabel getRf3() {
        return inscricaoEstadual;
    }

    public JLabel getRf4() {
        return razaoSocial;
    }

    public JTextField getRfTF2() {
        return cnpjTF;
    }

    public JTextField getRfTF3() {
        return inscricaoEstadualTF;
    }

    public JTextField getRfTF4() {
        return razaoSocialTF;
    }

    public void setButtonCancel(JButton buttonCancel) {
        this.buttonCancel = buttonCancel;
    }

    public void setButtonExit(JButton buttonExit) {
        this.buttonExit = buttonExit;
    }

    public void setButtonGravar(JButton buttonGravar) {
        this.buttonGravar = buttonGravar;
    }

    public void setButtonNew(JButton buttonNew) {
        this.buttonNew = buttonNew;
    }

    public void setButtonSearch(JButton buttonSearch) {
        this.buttonSearch = buttonSearch;
    }

    public void setDescricao(JLabel descricao) {
        this.nome = descricao;
    }

    public void setDescricao1(JLabel descricao1) {
        this.email = descricao1;
    }


    public void setDescricaoTF(JTextField descricaoTF) {
        this.nomeTF = descricaoTF;
    }

    public void setDescricaoTF1(JTextField descricaoTF1) {
        this.emailTF = descricaoTF1;
    }


    public void setId(JLabel id) {
        this.id = id;
    }


    public void setIdTF(JTextField idTF) {
        this.idTF = idTF;
    }

    public void setjFormattedTextField1(JFormattedTextField jFormattedTextField1) {
        this.fone1TF = jFormattedTextField1;
    }

    public void setjFormattedTextField2(JFormattedTextField jFormattedTextField2) {
        this.fone2TF = jFormattedTextField2;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setPanelBottom(JPanel panelBottom) {
        this.panelBottom = panelBottom;
    }

    public void setPanelMid(JPanel panelMid) {
        this.panelMid = panelMid;
    }

    public void setPanelTop(JPanel panelTop) {
        this.panelTop = panelTop;
    }

    public void setRf(JLabel rf) {
        this.fone1 = rf;
    }

    public void setRf1(JLabel rf1) {
        this.fone2 = rf1;
    }

    public void setRf2(JLabel rf2) {
        this.cnpj = rf2;
    }

    public void setRf3(JLabel rf3) {
        this.inscricaoEstadual = rf3;
    }

    public void setRf4(JLabel rf4) {
        this.razaoSocial = rf4;
    }

    public void setRfTF2(JTextField rfTF2) {
        this.cnpjTF = rfTF2;
    }

    public void setRfTF3(JTextField rfTF3) {
        this.inscricaoEstadualTF = rfTF3;
    }

    public void setRfTF4(JTextField rfTF4) {
        this.razaoSocialTF = rfTF4;
    }

    public JLabel getBairro() {
        return bairro;
    }

    public JTextField getBairroTF() {
        return bairroTF;
    }

    public JLabel getCep() {
        return cep;
    }

    public JTextField getCepTF() {
        return cepTF;
    }

    public JLabel getCidade() {
        return cidade;
    }

    public JTextField getCidadeTF() {
        return cidadeTF;
    }

    public JLabel getCnpj() {
        return cnpj;
    }

    public JTextField getCnpjTF() {
        return cnpjTF;
    }

    public JLabel getComplementoEndereco() {
        return complementoEndereco;
    }

    public JTextField getComplementoEnderecoTF() {
        return complementoEnderecoTF;
    }

    public JLabel getEmail() {
        return email;
    }

    public JTextField getEmailTF() {
        return emailTF;
    }

    public JLabel getFone1() {
        return fone1;
    }

    public JFormattedTextField getFone1TF() {
        return fone1TF;
    }

    public JLabel getFone2() {
        return fone2;
    }

    public JFormattedTextField getFone2TF() {
        return fone2TF;
    }

    public JLabel getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public JTextField getInscricaoEstadualTF() {
        return inscricaoEstadualTF;
    }

    public JLabel getNome() {
        return nome;
    }

    public JTextField getNomeTF() {
        return nomeTF;
    }

    public JLabel getRazaoSocial() {
        return razaoSocial;
    }

    public JTextField getRazaoSocialTF() {
        return razaoSocialTF;
    }

    public void setBairro(JLabel bairro) {
        this.bairro = bairro;
    }

    public void setBairroTF(JTextField bairroTF) {
        this.bairroTF = bairroTF;
    }

    public void setCep(JLabel cep) {
        this.cep = cep;
    }

    public void setCepTF(JTextField cepTF) {
        this.cepTF = cepTF;
    }

    public void setCidade(JLabel cidade) {
        this.cidade = cidade;
    }

    public void setCidadeTF(JTextField cidadeTF) {
        this.cidadeTF = cidadeTF;
    }

    public void setCnpj(JLabel cnpj) {
        this.cnpj = cnpj;
    }

    public void setCnpjTF(JTextField cnpjTF) {
        this.cnpjTF = cnpjTF;
    }

    public void setComplementoEndereco(JLabel complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public void setComplementoEnderecoTF(JTextField complementoEnderecoTF) {
        this.complementoEnderecoTF = complementoEnderecoTF;
    }

    public void setEmail(JLabel email) {
        this.email = email;
    }

    public void setEmailTF(JTextField emailTF) {
        this.emailTF = emailTF;
    }

    public void setFone1(JLabel fone1) {
        this.fone1 = fone1;
    }

    public void setFone1TF(JFormattedTextField fone1TF) {
        this.fone1TF = fone1TF;
    }

    public void setFone2(JLabel fone2) {
        this.fone2 = fone2;
    }

    public void setFone2TF(JFormattedTextField fone2TF) {
        this.fone2TF = fone2TF;
    }

    public void setInscricaoEstadual(JLabel inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setInscricaoEstadualTF(JTextField inscricaoEstadualTF) {
        this.inscricaoEstadualTF = inscricaoEstadualTF;
    }

    public void setNome(JLabel nome) {
        this.nome = nome;
    }

    public void setNomeTF(JTextField nomeTF) {
        this.nomeTF = nomeTF;
    }

    public void setRazaoSocial(JLabel razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setRazaoSocialTF(JTextField razaoSocialTF) {
        this.razaoSocialTF = razaoSocialTF;
    }

    public JButton getButtonCliente() {
        return buttonCliente;
    }

    public void setButtonCliente(JButton buttonCliente) {
        this.buttonCliente = buttonCliente;
    }

    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBottom = new javax.swing.JPanel();
        buttonNew = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonGravar = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        panelMid = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        fone1 = new javax.swing.JLabel();
        fone2 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        cnpj = new javax.swing.JLabel();
        inscricaoEstadual = new javax.swing.JLabel();
        razaoSocial = new javax.swing.JLabel();
        cep = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        bairro = new javax.swing.JLabel();
        complementoEndereco = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        nomeTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        cnpjTF = new javax.swing.JTextField();
        inscricaoEstadualTF = new javax.swing.JTextField();
        razaoSocialTF = new javax.swing.JTextField();
        fone1TF = new javax.swing.JFormattedTextField();
        fone2TF = new javax.swing.JFormattedTextField();
        cepTF = new javax.swing.JTextField();
        cidadeTF = new javax.swing.JTextField();
        bairroTF = new javax.swing.JTextField();
        complementoEnderecoTF = new javax.swing.JTextField();
        buttonCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTop.setBackground(new java.awt.Color(221, 221, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro Fornecedor");
        panelTop.add(jLabel1);

        getContentPane().add(panelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        panelBottom.setBackground(new java.awt.Color(221, 221, 221));

        buttonNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Create.png"))); // NOI18N
        buttonNew.setText(" Novo");
        buttonNew.setActionCommand("0");
        buttonNew.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });
        panelBottom.add(buttonNew);

        buttonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Cancel.png"))); // NOI18N
        buttonCancel.setText(" Cancelar");
        buttonCancel.setActionCommand("1");
        buttonCancel.setEnabled(false);
        buttonCancel.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        panelBottom.add(buttonCancel);

        buttonGravar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Next track.png"))); // NOI18N
        buttonGravar.setText(" Gravar");
        buttonGravar.setActionCommand("1");
        buttonGravar.setEnabled(false);
        buttonGravar.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGravarActionPerformed(evt);
            }
        });
        panelBottom.add(buttonGravar);

        buttonSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Find.png"))); // NOI18N
        buttonSearch.setText(" Buscar");
        buttonSearch.setActionCommand("0");
        buttonSearch.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        panelBottom.add(buttonSearch);

        buttonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Exit.png"))); // NOI18N
        buttonExit.setText(" Sair");
        buttonExit.setActionCommand("0");
        buttonExit.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        panelBottom.add(buttonExit);

        getContentPane().add(panelBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 800, 60));

        id.setText("ID");

        nome.setText("Nome");

        fone1.setText("Fone 1");

        fone2.setText("Fone 2");

        email.setText("Email");

        cnpj.setText("CNPJ");

        inscricaoEstadual.setText("Inscrição Estadual");

        razaoSocial.setText("Razão Social");

        cep.setText("CEP");

        cidade.setText("Cidade");

        bairro.setText("Bairro");

        complementoEndereco.setText("Complemento Endereço");

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });

        nomeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTFActionPerformed(evt);
            }
        });

        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        cnpjTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjTFActionPerformed(evt);
            }
        });

        inscricaoEstadualTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscricaoEstadualTFActionPerformed(evt);
            }
        });

        razaoSocialTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razaoSocialTFActionPerformed(evt);
            }
        });

        try {
            fone1TF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fone2TF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fone2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fone2TFActionPerformed(evt);
            }
        });

        cepTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTFActionPerformed(evt);
            }
        });

        cidadeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTFActionPerformed(evt);
            }
        });

        bairroTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTFActionPerformed(evt);
            }
        });

        complementoEnderecoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoEnderecoTFActionPerformed(evt);
            }
        });

        buttonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Bottom.png"))); // NOI18N
        buttonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMidLayout = new javax.swing.GroupLayout(panelMid);
        panelMid.setLayout(panelMidLayout);
        panelMidLayout.setHorizontalGroup(
            panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMidLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id)))
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cnpjTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnpj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inscricaoEstadual)
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inscricaoEstadualTF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidade))
                                .addGap(18, 18, 18)
                                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bairro)
                                    .addComponent(razaoSocialTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fone1)
                            .addComponent(fone1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158)
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fone2)
                            .addComponent(fone2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(razaoSocial)))
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cep)
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addComponent(cepTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cidadeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bairroTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(complementoEndereco)
                            .addComponent(email)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addComponent(complementoEnderecoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelMidLayout.setVerticalGroup(
            panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMidLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(id)
                .addGap(10, 10, 10)
                .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fone1)
                    .addComponent(fone2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fone2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fone1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addComponent(email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inscricaoEstadual)
                            .addComponent(cnpj)
                            .addComponent(razaoSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inscricaoEstadualTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnpjTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(razaoSocialTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMidLayout.createSequentialGroup()
                        .addComponent(cep)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidade)
                            .addComponent(bairro))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMidLayout.createSequentialGroup()
                        .addComponent(complementoEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(complementoEnderecoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cepTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(panelMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void nomeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed

    private void cnpjTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjTFActionPerformed

    private void inscricaoEstadualTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscricaoEstadualTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscricaoEstadualTFActionPerformed

    private void razaoSocialTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razaoSocialTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razaoSocialTFActionPerformed

    private void fone2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fone2TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fone2TFActionPerformed

    private void buttonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGravarActionPerformed
       
    }//GEN-LAST:event_buttonGravarActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
      
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
       
    }//GEN-LAST:event_buttonNewActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
    
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
       
       
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void cepTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTFActionPerformed

    private void cidadeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeTFActionPerformed

    private void bairroTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTFActionPerformed

    private void complementoEnderecoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoEnderecoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoEnderecoTFActionPerformed

    private void buttonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.JTextField bairroTF;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCliente;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonGravar;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel cep;
    private javax.swing.JTextField cepTF;
    private javax.swing.JLabel cidade;
    private javax.swing.JTextField cidadeTF;
    private javax.swing.JLabel cnpj;
    private javax.swing.JTextField cnpjTF;
    private javax.swing.JLabel complementoEndereco;
    private javax.swing.JTextField complementoEnderecoTF;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel fone1;
    private javax.swing.JFormattedTextField fone1TF;
    private javax.swing.JLabel fone2;
    private javax.swing.JFormattedTextField fone2TF;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel inscricaoEstadual;
    private javax.swing.JTextField inscricaoEstadualTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelTop;
    private javax.swing.JLabel razaoSocial;
    private javax.swing.JTextField razaoSocialTF;
    // End of variables declaration//GEN-END:variables
}

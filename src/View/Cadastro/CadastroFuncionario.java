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
public class CadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TemplateCadastro
     */
    public CadastroFuncionario() {
        initComponents();
        
    }

    public JLabel getRg() {
        return rg;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public JComboBox<String> getStatusCB() {
        return statusCB;
    }

    public void setStatusCB(JComboBox<String> statusCB) {
        this.statusCB = statusCB;
    }
    

    public JLabel getUsuario() {
        return usuario;
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

    public JLabel getComplementoEndereco() {
        return complementoEndereco;
    }

    public JTextField getComplementoEnderecoTF() {
        return complementoEnderecoTF;
    }

    public JLabel getCpf() {
        return cpf;
    }

    public JFormattedTextField getCpfTF() {
        return cpfTF;
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

    public JLabel getId() {
        return id;
    }

    public JTextField getIdTF() {
        return idTF;
    }


    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getNome() {
        return nome;
    }

    public JTextField getNomeTF() {
        return nomeTF;
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

    public JTextField getRgTF() {
        return rgTF;
    }

    public JLabel getSenha() {
        return senha;
    }

    public JTextField getSenhaTF() {
        return senhaTF;
    }

    public JTextField getUsuarioTF() {
        return usuarioTF;
    }

    public void setRg(JLabel Rg) {
        this.rg = Rg;
    }

    public void setUsuario(JLabel Usuario) {
        this.usuario = Usuario;
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

    public void setComplementoEndereco(JLabel complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public void setComplementoEnderecoTF(JTextField complementoEnderecoTF) {
        this.complementoEnderecoTF = complementoEnderecoTF;
    }

    public void setCpf(JLabel cpf) {
        this.cpf = cpf;
    }

    public void setCpfTF(JFormattedTextField cpfTF) {
        this.cpfTF = cpfTF;
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

    public void setId(JLabel id) {
        this.id = id;
    }


    public void setIdTF(JTextField idTF) {
        this.idTF = idTF;
    }



    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setNome(JLabel nome) {
        this.nome = nome;
    }

    public void setNomeTF(JTextField nomeTF) {
        this.nomeTF = nomeTF;
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

    public void setRgTF(JTextField rgTF) {
        this.rgTF = rgTF;
    }

    public void setSenha(JLabel senha) {
        this.senha = senha;
    }

    public void setSenhaTF(JTextField senhaTF) {
        this.senhaTF = senhaTF;
    }

    public void setUsuarioTF(JTextField usuarioTF) {
        this.usuarioTF = usuarioTF;
    }

    public JLabel getBairro() {
        return bairro;
    }

    public JTextField getBairroTF() {
        return bairroTF;
    }

    public JButton getButtonCliente() {
        return buttonCliente;
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

    public void setBairro(JLabel bairro) {
        this.bairro = bairro;
    }

    public void setBairroTF(JTextField bairroTF) {
        this.bairroTF = bairroTF;
    }

    public void setButtonCliente(JButton buttonCliente) {
        this.buttonCliente = buttonCliente;
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
        complementoEndereco = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        rg = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        cep = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        bairro = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        nomeTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        complementoEnderecoTF = new javax.swing.JTextField();
        rgTF = new javax.swing.JTextField();
        usuarioTF = new javax.swing.JTextField();
        senhaTF = new javax.swing.JTextField();
        fone1TF = new javax.swing.JFormattedTextField();
        fone2TF = new javax.swing.JFormattedTextField();
        cpfTF = new javax.swing.JFormattedTextField();
        cepTF = new javax.swing.JTextField();
        cidadeTF = new javax.swing.JTextField();
        bairroTF = new javax.swing.JTextField();
        buttonCliente = new javax.swing.JButton();
        statusCB = new javax.swing.JComboBox<>();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTop.setBackground(new java.awt.Color(221, 221, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro Funcionario");
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

        getContentPane().add(panelBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 800, 60));

        id.setText("ID");

        nome.setText("Nome");

        fone1.setText("Fone 1");

        fone2.setText("Fone 2");

        email.setText("Email");

        complementoEndereco.setText("Complemento Endereço");

        cpf.setText("Cpf");

        rg.setText("Rg");

        usuario.setText("Usuario");

        senha.setText("Senha");

        cep.setText("CEP");

        cidade.setText("Cidade");

        bairro.setText("Bairro");

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

        complementoEnderecoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoEnderecoTFActionPerformed(evt);
            }
        });

        rgTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgTFActionPerformed(evt);
            }
        });

        usuarioTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTFActionPerformed(evt);
            }
        });

        senhaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTFActionPerformed(evt);
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

        try {
            cpfTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        buttonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Bottom.png"))); // NOI18N
        buttonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClienteActionPerformed(evt);
            }
        });

        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        status.setText("Status");

        javax.swing.GroupLayout panelMidLayout = new javax.swing.GroupLayout(panelMid);
        panelMid.setLayout(panelMidLayout);
        panelMidLayout.setHorizontalGroup(
            panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMidLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(id)
                            .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelMidLayout.createSequentialGroup()
                                        .addComponent(cpf)
                                        .addGap(145, 145, 145))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMidLayout.createSequentialGroup()
                                        .addComponent(cpfTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rg)
                                    .addGroup(panelMidLayout.createSequentialGroup()
                                        .addComponent(rgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(usuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(fone1)
                                .addGap(267, 267, 267))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMidLayout.createSequentialGroup()
                                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMidLayout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(cidade))
                                    .addComponent(fone1TF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fone2)
                            .addComponent(usuario)
                            .addComponent(bairro)
                            .addComponent(fone2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addComponent(cep)
                                .addGap(285, 285, 285))
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addComponent(cepTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cidadeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(bairroTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelMidLayout.createSequentialGroup()
                                    .addComponent(complementoEnderecoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(buttonCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addComponent(complementoEndereco)
                                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email)
                                    .addComponent(emailTF)
                                    .addComponent(senha)
                                    .addComponent(senhaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addComponent(status)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelMidLayout.setVerticalGroup(
            panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMidLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fone1)
                        .addComponent(fone2))
                    .addComponent(email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fone2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fone1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelMidLayout.createSequentialGroup()
                                        .addComponent(cpf)
                                        .addGap(26, 26, 26))
                                    .addGroup(panelMidLayout.createSequentialGroup()
                                        .addComponent(rg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rgTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cpfTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(usuario))
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addComponent(senha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(senhaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelMidLayout.createSequentialGroup()
                                        .addComponent(cep)
                                        .addGap(26, 26, 26))
                                    .addGroup(panelMidLayout.createSequentialGroup()
                                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(bairro)
                                            .addComponent(cidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cidadeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bairroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cepTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panelMidLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(buttonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelMidLayout.createSequentialGroup()
                        .addComponent(complementoEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(complementoEnderecoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(panelMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
      
    }//GEN-LAST:event_buttonNewActionPerformed

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void nomeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed

    private void complementoEnderecoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoEnderecoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoEnderecoTFActionPerformed

    private void rgTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgTFActionPerformed

    private void usuarioTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTFActionPerformed

    private void fone2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fone2TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fone2TFActionPerformed

    private void senhaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTFActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
       
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGravarActionPerformed
        
    }//GEN-LAST:event_buttonGravarActionPerformed

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
                new CadastroFuncionario().setVisible(true);
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
    private javax.swing.JLabel complementoEndereco;
    private javax.swing.JTextField complementoEnderecoTF;
    private javax.swing.JLabel cpf;
    private javax.swing.JFormattedTextField cpfTF;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel fone1;
    private javax.swing.JFormattedTextField fone1TF;
    private javax.swing.JLabel fone2;
    private javax.swing.JFormattedTextField fone2TF;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelTop;
    private javax.swing.JLabel rg;
    private javax.swing.JTextField rgTF;
    private javax.swing.JLabel senha;
    private javax.swing.JTextField senhaTF;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField usuarioTF;
    // End of variables declaration//GEN-END:variables
}

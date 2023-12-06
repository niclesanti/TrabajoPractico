package views;

import controllers.GestorCliente;
import controllers.GestorPoliza;
import dto.ClienteDTO;
import dto.DatosPolizaDTO;
import dto.HijoDTO;
import dto.VehiculoDTO;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import messages.Util;
import models.entities.AnioFabricacion;
import models.entities.Cliente;
import models.entities.Domicilio;
import models.entities.EstadoCivil;
import models.entities.Localidad;
import models.entities.Marca;
import models.entities.Modelo;
import models.entities.NumeroSiniestrosEnum;
import models.entities.Provincia;
import models.entities.SexoEnum;
import models.entities.TipoDocumento;
import models.entities.Vehiculo;

public class MenuAltaPoliza1 extends javax.swing.JFrame {
    
    // Variables - JPA & Persistencia
    private EntityManager entityManager;
    GestorPoliza gestorPoliza;
    GestorCliente gestorCliente;
    Cliente cliente; //deberia guardar el cliente que devuelve buscar cliente
    
    
    public MenuAltaPoliza1() {
        initComponents();
    }
    
    public MenuAltaPoliza1(EntityManager entityManager) {
        initComponents();
        gestorPoliza = new GestorPoliza();
        gestorCliente = new GestorCliente();
        this.mostrarProvincia();
        this.mostrarMarca();
        this.mostrarNumeroSiniestro();
        this.mostrarSexo();
        this.mostrarEstadoCivil();
    }
    
    public MenuAltaPoliza1(EntityManager entityManager, Cliente c) {
        initComponents();
        gestorPoliza = new GestorPoliza();
        gestorCliente = new GestorCliente();
        this.mostrarProvincia();
        this.mostrarMarca();
        this.mostrarNumeroSiniestro();
        this.mostrarSexo();
        this.mostrarEstadoCivil();
        this.cliente = c;
    }
    
    // Mostrar los valores de los Drop-Down List
    public void mostrarProvincia () {
        List<Provincia> provincias = gestorPoliza.mostrarProvincia();
        if (provincias != null) {
            for (Provincia provincia : provincias) {
                txtProvincia.addItem(provincia.getNombre());
            }
        } else {
            System.out.println("txtProvincia es null. Asegúrate de que se haya inicializado correctamente.");
        }
    }
    
    public void mostrarMarca() {
        List<Marca> marcas = gestorPoliza.mostrarMarca();
        if (marcas != null) {
            for (int i=0; i<marcas.size(); i++){
            txtMarca.addItem(marcas.get(i).getNombre());
        }
        } else {
            System.out.println("txtProvincia es null. Asegúrate de que se haya inicializado correctamente.");
        }
    }
    
    public void mostrarEstadoCivil(){
        List<EstadoCivil> estadoCivil = gestorPoliza.mostrarEstadoCivil();
        for (int i=0; i<estadoCivil.size(); i++){
            txtEstadoCivil.addItem(estadoCivil.get(i).getEspecificacion());
        }
    }
    
    public void mostrarNumeroSiniestro(){
        for (NumeroSiniestrosEnum estado : NumeroSiniestrosEnum.values()) {
            txtNumeroSiniestros.addItem(estado.name());
        }
    }
    
    public void mostrarSexo(){
        for (SexoEnum estado : SexoEnum.values()) {
            txtSexo.addItem(estado.name());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoNombre = new javax.swing.JTextField();
        txtNumeroCliente = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JComboBox<>();
        txtMarca = new javax.swing.JComboBox<>();
        txtAnioFabricacion = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtGarage = new javax.swing.JCheckBox();
        txtAlarma = new javax.swing.JCheckBox();
        txtDispositivoRastreo = new javax.swing.JCheckBox();
        txtTuercasAntirrobo = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        txtNumeroSiniestros = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JComboBox<>();
        txtEstadoCivil = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInformacion = new javax.swing.JTable();
        btnAgregar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JToggleButton();
        btnAceptar = new javax.swing.JToggleButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        txtChasis = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        txtSumaAsegurada = new javax.swing.JTextField();
        txtKmAnio = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Datos del Cliente");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Número:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Apellido, Nombre:");

        txtApellidoNombre.setEditable(false);

        txtNumeroCliente.setEditable(false);

        txtDocumento.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Documento:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Domicilio:");

        txtDomicilio.setEditable(false);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Datos de la Póliza");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Domicilio de riesgo (*)");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Provincia:");

        txtProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        txtProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtProvinciaItemStateChanged(evt);
            }
        });
        txtProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinciaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Localidad:");

        txtLocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Marca del vehículo (*)");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Modelo del vehículo (*)");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Año de fabricación (*)");

        txtModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        txtModelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtModeloItemStateChanged(evt);
            }
        });

        txtMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        txtMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtMarcaItemStateChanged(evt);
            }
        });
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        txtAnioFabricacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Medidas de seguridad:");

        txtGarage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtGarage.setText("¿Se guarda en garage?");

        txtAlarma.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAlarma.setText("¿Tiene alarma?");

        txtDispositivoRastreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDispositivoRastreo.setText("¿Posee dispositivo de rastreo celular?");

        txtTuercasAntirrobo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTuercasAntirrobo.setText("¿Posee tuercas antirrobo en las cuatro ruedas?");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Números de Siniestros en el último año (*)");

        txtNumeroSiniestros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Declaración de Hijos:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Fecha de Nacimiento:");

        txtFechaNacimiento.setDateFormatString("dd/MM/yyyy");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Sexo:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Estado Civil:");

        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        txtSexo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtSexoItemStateChanged(evt);
            }
        });
        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });

        txtEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        txtEstadoCivil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtEstadoCivilItemStateChanged(evt);
            }
        });
        txtEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoCivilActionPerformed(evt);
            }
        });

        TablaInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha de Nacimiento", "Sexo", "Estado Civil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaInformacion);
        if (TablaInformacion.getColumnModel().getColumnCount() > 0) {
            TablaInformacion.getColumnModel().getColumn(0).setMinWidth(100);
        }

        btnAgregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAceptar.setText("Confirmar Datos");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Motor (*)");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Chasis (*)");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Patente:");

        txtMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotorActionPerformed(evt);
            }
        });

        txtSumaAsegurada.setEditable(false);
        txtSumaAsegurada.setText("100000");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Km/Año (*)");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Suma Asegurada:");

        txtBuscarCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBuscarCliente.setText("Buscar Cliente");
        txtBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel21))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtProvincia, 0, 97, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGap(90, 90, 90)
                                                    .addComponent(jLabel19))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(88, 88, 88)
                                                    .addComponent(jLabel20)))))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMotor, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        .addComponent(txtChasis)
                                        .addComponent(txtPatente)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtAnioFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel23))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSumaAsegurada, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addComponent(txtKmAnio))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtBuscarCliente)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumeroCliente)
                                    .addComponent(txtApellidoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDocumento)
                                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 36, Short.MAX_VALUE))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDispositivoRastreo)
                                    .addComponent(txtTuercasAntirrobo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtGarage, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtAlarma))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel14)
                                .addGap(38, 38, 38)
                                .addComponent(txtNumeroSiniestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidoNombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocumento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDomicilio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20)
                    .addComponent(txtChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAnioFabricacion)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtKmAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtSumaAsegurada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroSiniestros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGarage)
                    .addComponent(txtAlarma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDispositivoRastreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTuercasAntirrobo)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnLimpiar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Mostrar las Localidades por cada cambio de Provincia
    private void txtProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtProvinciaItemStateChanged
        txtLocalidad.removeAllItems();
        if (!("Seleccionar").equals(txtProvincia.getSelectedItem()+"")) {
            txtLocalidad.addItem("Selecionar");
            List<Localidad> localidad = gestorPoliza.mostrarLocalidad(txtProvincia.getSelectedItem()+"");
            for (int i=0; i<localidad.size(); i++){
                txtLocalidad.addItem(localidad.get(i).getNombre());
            }
        } else {
            txtLocalidad.addItem("Seleccionar");
        }
    }//GEN-LAST:event_txtProvinciaItemStateChanged

    private void txtProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinciaActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    // Mostrar los Modelos por cada cambio de Marca
    private void txtMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtMarcaItemStateChanged
        txtModelo.removeAllItems();
        if (!("Seleccionar").equals(txtMarca.getSelectedItem()+"")) {
            txtModelo.addItem("Seleccionar");
            List<Modelo> modelo = gestorPoliza.mostrarModelo(txtMarca.getSelectedItem()+"");
            for (int i=0; i<modelo.size(); i++){
                txtModelo.addItem(modelo.get(i).getNombre());
            }
        } else {
            txtModelo.addItem("Seleccionar");
        }
    }//GEN-LAST:event_txtMarcaItemStateChanged

    private void txtSexoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtSexoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoItemStateChanged

    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoActionPerformed

    private void txtEstadoCivilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtEstadoCivilItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoCivilItemStateChanged

    private void txtEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoCivilActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            if ( Util.mensajeConfirmacion("Confirmación", "¿Está seguro que desea salir?") ){
                this.setVisible(false);
                this.dispose();
            }
        } catch (Exception e){
            Util.mensajeError("Error", e.getMessage());
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        // Obtenemos los valores
        Date FechaNacimiento1 =  txtFechaNacimiento.getDate();
        String FechaNacimiento2 = null;
        String Sexo = (String) txtSexo.getSelectedItem();
        String EstadoCivil = (String) txtEstadoCivil.getSelectedItem();
        int edad = calcularEdad(FechaNacimiento1);
        // Validamos que los campos no esten vacíos
        if ((FechaNacimiento1 == null) || ("Seleccionar".equals(Sexo)) || ("Seleccionar".equals(EstadoCivil))) {
            Util.mensajeAdvertencia("Atención", "No se permiten campo/s nulo/s");
        } else {
                if (edad >= 18 && edad <= 30) {
                    // Convertir la fecha a dd/MM/yyyy
                    DefaultTableModel TablaHijos = (DefaultTableModel) TablaInformacion.getModel();
                    FechaNacimiento2 = formato.format(FechaNacimiento1);
                    //ALmacenar los datos en la tabla
                    Object[] Fila = {FechaNacimiento2, Sexo, EstadoCivil};
                    TablaHijos.addRow(Fila);
                    // Limpias los campos
                    txtFechaNacimiento.setDate(null);
                    txtSexo.setSelectedItem("Seleccionar");
                    txtEstadoCivil.setSelectedItem("Seleccionar");
                }      
                else {
                    Util.mensajeAdvertencia("Atención", "La persona debe tener entre 18 y 30 años.");
                }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private int calcularEdad(Date fechaNacimiento) {
        // Setear fecha de nacimiento
        Calendar calendarioNacimiento = Calendar.getInstance();
        calendarioNacimiento.setTime(fechaNacimiento);
        // Obtener fecha actual
        Calendar calendarioHoy = Calendar.getInstance();
        // Calcular la edad
        int edad = calendarioHoy.get(Calendar.YEAR) - calendarioNacimiento.get(Calendar.YEAR);
        if (calendarioHoy.get(Calendar.DAY_OF_YEAR) < calendarioNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }
    
    // Validar si ya existe un casis y/o motor
    private boolean validarVehiculo(String motor,String chasis, String patente){
      List<Vehiculo> vehiculo1 = gestorPoliza.mostrarChasis(chasis);
      List<Vehiculo> vehiculo2 = gestorPoliza.mostrarMotor(motor);
      List<Vehiculo> vehiculo3 = gestorPoliza.mostrarPatente(patente);
      return !(vehiculo1.isEmpty() && vehiculo2.isEmpty() && vehiculo3.isEmpty());
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        int FilaSeleccionada = TablaInformacion.getSelectedRow();
        if (FilaSeleccionada != -1) {
            DefaultTableModel TablaHijos = (DefaultTableModel) TablaInformacion.getModel();
            TablaHijos.removeRow(FilaSeleccionada);
            TablaHijos.fireTableDataChanged();
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClienteActionPerformed
        /*try {
            List<Cliente> cliente = gestorCliente.mostrarCliente("1231");
            TipoDocumento documento = cliente.get(0).getTipoDocumento();
            Domicilio domicilio = cliente.get(0).getDomicilio();
            txtNumeroCliente.setText(cliente.get(0).getNumeroCliente() + "");
            txtDocumento.setText(documento.getEspecificacion() + " / " + cliente.get(0).getNumeroDocumento());
            txtApellidoNombre.setText(cliente.get(0).getApellido() + ", " + cliente.get(0).getNombre());
            txtDomicilio.setText(domicilio.getCalle() + " " + domicilio.getNumero());
        }  catch (Exception e) {
            Util.mensajeError("Error", e.getMessage());
        }*/
        try{
            //Probar si funciona esto :)
            //Cliente c;
            JFrame buscarClienteJframe = new BuscarCliente(entityManager);
            buscarClienteJframe.setVisible(true);
            buscarClienteJframe.setLocationRelativeTo(null);
            /**Cliente c = buscarClienteJframe.getCliente();**/
            

            //Aca deberiamos hacer las asignaciones que estan comentadas arriba pero con el cliente que obtuvimos
            TipoDocumento documento = this.cliente.getTipoDocumento();
            Domicilio domicilio = this.cliente.getDomicilio();
            txtNumeroCliente.setText(this.cliente.getNumeroCliente() + "");
            txtDocumento.setText(documento.getEspecificacion() + " / " + this.cliente.getNumeroDocumento());
            txtApellidoNombre.setText(this.cliente.getApellido() + ", " + this.cliente.getNombre());
            txtDomicilio.setText(domicilio.getCalle() + " " + domicilio.getNumero());
            
        }catch (Exception e) {
            Util.mensajeError("Error", e.getMessage());
    }//GEN-LAST:event_txtBuscarClienteActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // Validaciones
        DatosPolizaDTO datosPolizaDTO;
        VehiculoDTO vehiculoDTO;
        HijoDTO hijoDTO;
        try {
            String numeroCliente = txtNumeroCliente.getText();
            String motor = txtMotor.getText();
            String chasis = txtChasis.getText();
            String patente = txtPatente.getText();
            String kmAnio = txtKmAnio.getText();
            String localidad = (String) txtLocalidad.getSelectedItem();
            String anioFabricacion = (String) txtAnioFabricacion.getSelectedItem();
            String modelo = (String) txtModelo.getSelectedItem();
            String marca = (String) txtMarca.getSelectedItem();
            String numeroSiniestro = (String) txtNumeroSiniestros.getSelectedItem();
            // Validar que no haya campos vacíos
            if (numeroCliente.isEmpty() || motor.isEmpty() || chasis.isEmpty() || kmAnio.isEmpty() || localidad.equals("Seleccionar") || anioFabricacion.equals("Seleccionar") || numeroSiniestro.equals("Seleccionar")) {
                Util.mensajeAdvertencia("Advertencia", "No se permiten campo/s vacío/s");
            } else if (validarVehiculo(motor,chasis,patente)) { // Validar que no exista otra vehículo con es información
                Util.mensajeAdvertencia("Advertencia", "Ya existe un vehículo con esa información: motor, chasis y/o patente");
            } else {
                datosPolizaDTO = new DatosPolizaDTO();
                vehiculoDTO = new VehiculoDTO();
                // Setear los valores en el Datos Poliza DTO
                datosPolizaDTO.setNombreCliente(txtApellidoNombre.getText());
                datosPolizaDTO.setNumeroCliente(numeroCliente);
                datosPolizaDTO.setKmAnio(kmAnio);
                datosPolizaDTO.setNumeroSiniestro(numeroSiniestro);
                datosPolizaDTO.setSumaAsegurada(txtSumaAsegurada.getText());
                datosPolizaDTO.setGuardaGarage(txtGarage.isSelected());
                datosPolizaDTO.setAlarma(txtAlarma.isSelected());
                datosPolizaDTO.setDispositivoRastreo(txtDispositivoRastreo.isSelected());
                datosPolizaDTO.setTuercaAntirrobo(txtTuercasAntirrobo.isSelected());
                // Setear los valores en el Vehiculo DTO
                vehiculoDTO.setMarca(marca);
                vehiculoDTO.setMotor(motor);
                vehiculoDTO.setLocalidad(localidad);
                vehiculoDTO.setChasis(chasis);
                vehiculoDTO.setPatente(patente);
                vehiculoDTO.setModelo(modelo);
                vehiculoDTO.setAnioFabricacion(anioFabricacion);
                // Hijos de Tabla Información
                List<HijoDTO> hijos = new ArrayList<>();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                for (int i = 0; i < TablaInformacion.getRowCount(); i++) {
                    hijoDTO = new HijoDTO();
                    Object fechaNacimientoValue = TablaInformacion.getValueAt(i, 0);
                    String fechaNacimientoStr = fechaNacimientoValue.toString();
                    Date fechaNacimiento = formato.parse(fechaNacimientoStr);
                    hijoDTO.setFechaNacimiento(fechaNacimiento);
                    hijoDTO.setSexo(TablaInformacion.getValueAt(i,1)+"");
                    hijoDTO.setEstadoCivil(TablaInformacion.getValueAt(i, 2)+"");
                    // Agregar el hijo a la lista
                    hijos.add(hijoDTO);
                    }
                datosPolizaDTO.setHijos(hijos);
                // MenuAltaPoliza2
                JFrame pantalla = new MenuAltaPoliza2(datosPolizaDTO, vehiculoDTO);
                this.setVisible(false);
                pantalla.setVisible(true);
                pantalla.setLocationRelativeTo(null);
                this.dispose();
            }
        } catch (Exception e) {
            Util.mensajeError("Error", e.getMessage());
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Mostrar los Años de Fabricacion por cada cambio de Modelo
    private void txtModeloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtModeloItemStateChanged
         txtAnioFabricacion.removeAllItems();
        if ( !("Seleccionar").equals(txtMarca.getSelectedItem()+"") && !("Seleccionar").equals(txtModelo.getSelectedItem()+"")) {
            txtAnioFabricacion.addItem("Seleccionar");
            List<AnioFabricacion> anio = gestorPoliza.mostrarAnioFabricacion(txtMarca.getSelectedItem()+"", txtModelo.getSelectedItem()+"");
            for (int i=0; i<anio.size(); i++){
                txtAnioFabricacion.addItem(anio.get(i).getAnioFabricacion()+"");
            }
        } else {
            txtAnioFabricacion.addItem("Seleccionar");
        }
    }//GEN-LAST:event_txtModeloItemStateChanged

    private void txtMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotorActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MenuAltaPoliza1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAltaPoliza1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAltaPoliza1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAltaPoliza1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAltaPoliza1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInformacion;
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnLimpiar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox txtAlarma;
    private javax.swing.JComboBox<String> txtAnioFabricacion;
    private javax.swing.JTextField txtApellidoNombre;
    private javax.swing.JButton txtBuscarCliente;
    private javax.swing.JTextField txtChasis;
    private javax.swing.JCheckBox txtDispositivoRastreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JComboBox<String> txtEstadoCivil;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JCheckBox txtGarage;
    private javax.swing.JTextField txtKmAnio;
    private javax.swing.JComboBox<String> txtLocalidad;
    private javax.swing.JComboBox<String> txtMarca;
    private javax.swing.JComboBox<String> txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JComboBox<String> txtNumeroSiniestros;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JComboBox<String> txtProvincia;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JTextField txtSumaAsegurada;
    private javax.swing.JCheckBox txtTuercasAntirrobo;
    // End of variables declaration//GEN-END:variables
}

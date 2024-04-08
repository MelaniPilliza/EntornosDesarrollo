package FORMULARIO;

import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import java.awt.*;
import java.io.File;
import javax.swing.SpinnerNumberModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class FormularioLaboral extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ButtonGroup bg=new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioLaboral frame = new FormularioLaboral();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormularioLaboral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1056, 857);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel JLabelNombre = new JLabel("Nombre: ");
		JLabelNombre.setBounds(37, 111, 58, 24);
		JLabelNombre.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelNombre);
		
		JTextArea textAreaNombre = new JTextArea();
		textAreaNombre.setBounds(37, 134, 546, 24);
		contentPane.add(textAreaNombre);
		
		JLabel JLabelDatosPersonales = new JLabel("DATOS PERSONALES");
		JLabelDatosPersonales.setBounds(37, 77, 181, 24);
		JLabelDatosPersonales.setFont(new Font("Verdana", Font.BOLD, 14));
		contentPane.add(JLabelDatosPersonales);
		
		JLabel JLabelPrimerApellido = new JLabel("Primer Apellido: ");
		JLabelPrimerApellido.setBounds(37, 168, 102, 24);
		JLabelPrimerApellido.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelPrimerApellido);
		
		JTextArea textAreaSegundoApellido = new JTextArea();
		textAreaSegundoApellido.setBounds(37, 244, 546, 24);
		contentPane.add(textAreaSegundoApellido);
		
		JLabel lblLugarDeResidencia = new JLabel("LUGAR DE RESIDENCIA");
		lblLugarDeResidencia.setBounds(37, 457, 243, 24);
		lblLugarDeResidencia.setFont(new Font("Verdana", Font.BOLD, 14));
		contentPane.add(lblLugarDeResidencia);
		
		JLabel JLabelSegundoApellido = new JLabel("Segundo Apellido: ");
		JLabelSegundoApellido.setBounds(37, 223, 116, 24);
		JLabelSegundoApellido.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelSegundoApellido);
		
		JTextArea textAreaPrimerApellido = new JTextArea();
		textAreaPrimerApellido.setBounds(37, 189, 546, 24);
		contentPane.add(textAreaPrimerApellido);
		
		JLabel JLabelTipoDocumentoIdentidad = new JLabel("Tipo de documento de identidad: ");
		JLabelTipoDocumentoIdentidad.setBounds(37, 278, 213, 24);
		JLabelTipoDocumentoIdentidad.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelTipoDocumentoIdentidad);
		
		JComboBox<String> comboBox = new JComboBox<>(new String[] {"DNI", "PASAPORTE", "NIE"});
		comboBox.setBounds(37, 299, 546, 29);
		comboBox.setEditable(false); // El combo box no es editable
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox.setSelectedIndex(-1);
		contentPane.add(comboBox);


		
		
		JLabel JLabelNumIdentificacion = new JLabel("Nº de identificación: ");
		JLabelNumIdentificacion.setBounds(37, 337, 129, 24);
		JLabelNumIdentificacion.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelNumIdentificacion);
		
		JTextArea textAreaNumIdentificacion = new JTextArea();
		textAreaNumIdentificacion.setBounds(37, 358, 546, 24);
		contentPane.add(textAreaNumIdentificacion);
		
		JLabel lblPrimerApellido_1_1_1 = new JLabel("Provincia");
		lblPrimerApellido_1_1_1.setBounds(37, 481, 213, 24);
		lblPrimerApellido_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(lblPrimerApellido_1_1_1);
		
		
		JComboBox<String> comboBox_1 = new JComboBox<>(new String[] {"A CORUÑA", "ÁLAVA", "ALBACETE", "ALICANTE", "ALMERÍA", "ASTURIAS", "ÁVILA", "BADAJOZ", "BALEARES", "BARCELONA", "BURGOS", "CÁCERES", "CÁDIZ", "CANTABRIA", "CASTELLÓN", "CIUDAD REAL", "CÓRDOBA", "CUENCA", "GIRONA", "GRANADA", "GUADALAJARA", "GIPUZCOA", "HUELVA", "HUESCA", "JAÉN", "LA RIOJA", "LAS PALMAS", "LEÓN", "LÉRIDA", "LUGO", "MADRID", "MÁLAGA", "MURCIA", "NAVARRA", "OURENSE", "PALENCIA", "PONTEVEDRA", "SALAMANCA", "SEGOVIA", "SEVILLA", "SORIA", "TARRAGONA", "SANTA CRUZ DE TENERIFE", "TERUEL", "TOLEDO", "VALENCIA", "VALLADOLID", "VIZCAYA", "ZAMORA", "ZARAGOZA"});
		comboBox_1.setBounds(37, 502, 546, 29);
		comboBox_1.setEditable(false); // El combo box no es editable
		comboBox_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox_1.setSelectedIndex(-1);
		contentPane.add(comboBox_1);
		
		JLabel lblPrimerApellido_1_3 = new JLabel("Código Postal: ");
		lblPrimerApellido_1_3.setBounds(37, 541, 116, 24);
		lblPrimerApellido_1_3.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(lblPrimerApellido_1_3);
		
		JTextArea textArea_1_3 = new JTextArea();
		textArea_1_3.setBounds(37, 562, 546, 24);
		contentPane.add(textArea_1_3);
		
		JLabel JLabelEdad = new JLabel("Edad: ");
		JLabelEdad.setBounds(37, 391, 168, 24);
		JLabelEdad.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelEdad);
		
		
		JLabel lblDatosPersonales_1 = new JLabel("OTROS DATOS");
		lblDatosPersonales_1.setBounds(36, 612, 181, 24);
		lblDatosPersonales_1.setFont(new Font("Verdana", Font.BOLD, 14));
		contentPane.add(lblDatosPersonales_1);
		
		JLabel lblNewLabel_1 = new JLabel("Jornada Laboral:");
		lblNewLabel_1.setBounds(36, 646, 116, 24);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Completa");
		rdbtnNewRadioButton.setBackground(SystemColor.inactiveCaption);
		rdbtnNewRadioButton.setBounds(158, 648, 116, 21);
		rdbtnNewRadioButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnParcialManana = new JRadioButton("Parcial mañana");
		rdbtnParcialManana.setBackground(SystemColor.inactiveCaption);
		rdbtnParcialManana.setBounds(276, 648, 116, 21);
		rdbtnParcialManana.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(rdbtnParcialManana);
		
		JRadioButton rdbtnParcialTarde = new JRadioButton("Parcial tarde");
		rdbtnParcialTarde.setBackground(SystemColor.inactiveCaption);
		rdbtnParcialTarde.setBounds(423, 648, 116, 21);
		rdbtnParcialTarde.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(rdbtnParcialTarde);
		
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnParcialManana);
		bg.add(rdbtnParcialTarde);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("CV:");
		lblNewLabel_1_1.setBounds(36, 680, 37, 24);
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\melan\\Downloads\\52991ad4d95008b377445982422fe7c6.jpg"));
		lblNewLabel_2.setBounds(630, -150, 452, 960);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("●●");
		lblNewLabel_3.setForeground(new Color(0, 0, 102));
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 50));
		lblNewLabel_3.setBounds(37, 10, 61, 43);
		contentPane.add(lblNewLabel_3);
		
		JLabel JLabelTitulo = new JLabel("TRABAJA CON NOSOTROS");
		JLabelTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		JLabelTitulo.setBounds(125, 20, 400, 43);
		contentPane.add(JLabelTitulo);
		
		JLabel lblNewLabel_3_1 = new JLabel("●●");
		lblNewLabel_3_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_3_1.setFont(new Font("Verdana", Font.PLAIN, 50));
		lblNewLabel_3_1.setBounds(522, 10, 61, 43);
		contentPane.add(lblNewLabel_3_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Verdana", Font.PLAIN, 12));
		spinner.setModel(new SpinnerNumberModel(16, 16, 67, 1));
		spinner.setBounds(37, 415, 49, 20);
		contentPane.add(spinner);
		
		// (JLabel) inicializada 
		JLabel label = new JLabel("No se ha seleccionado ningún archivo");
		label.setFont(new Font("Verdana", Font.PLAIN, 9));
		label.setBounds(181, 683, 402, 20); 
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Adjuntar CV");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JFileChooser fileChooser = new JFileChooser();
		        fileChooser.setDialogTitle("Selecciona un archivo"); // Título del diálogo
		        int result = fileChooser.showOpenDialog(contentPane);
		        if (result == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = fileChooser.getSelectedFile();
		            // Actualiza una etiqueta con la ruta del archivo
		            label.setText("Archivo seleccionado: " + selectedFile.getAbsolutePath());
		        }
		    }
		});
		btnNewButton.setBounds(68, 682, 103, 21);
		contentPane.add(btnNewButton);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cerrar la ventana actual
		        Frame.getFrames()[0].dispose();
		        // Crear la instancia de Enviar
		        Enviar ventanaEnviar = new Enviar();
		        // Hacer visible la instancia de Enviar
		        ventanaEnviar.setVisible(true);
			}
		});
		btnEnviar.setBackground(new Color(192, 192, 192));
		btnEnviar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnEnviar.setBounds(262, 723, 116, 29);
		contentPane.add(btnEnviar);

		

		
		

		
		
		

		
	}
}

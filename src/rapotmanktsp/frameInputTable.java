package rapotmanktsp;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


@SuppressWarnings("serial")
public class frameInputTable extends JFrame 
{

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	String header[] = {"Nama","Alamat","Email"};
	DefaultTableModel tabelModel;
	private JButton btnSimpan;
	private JButton btnBatal;
	private JLabel lblWall;

	/**
	 * Create the frame.
	 */
	public frameInputTable() 
	{
		super("Insert Data JTable");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 21, 458, 167);
		contentPane.add(scrollPane);
		
		tabelModel = new DefaultTableModel(null,header);
		table = new JTable();
		table.setModel(tabelModel);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] 
			{
				"Nama", "Alamat", "Email"
			}
		));
		scrollPane.setViewportView(table);
		
		btnSimpan = new JButton("Simpan");
		btnSimpan.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/Gambar/insertTable Img/OP1.png"));
		btnSimpan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent act)
			{
				try
				{
					Connection konek = Koneksi.getKoneksi();
					Statement state = konek.createStatement();
					int baris = table.getRowCount();
					for (int a=0; a<baris; a++)
						{
						String query = "INSERT INTO Data (Nama, Alamat, Email) VALUES( '"+table.getValueAt(a,0)+"','"+table.getValueAt(a,1)+"','"+table.getValueAt(a,2)+"')";
						state.executeUpdate(query);
						}
					state.close();
					JOptionPane.showMessageDialog(null,"Data berhasil disimpan","Pesan",JOptionPane.INFORMATION_MESSAGE);
				}
				catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null,"Data gagal disimpan","Pesan",JOptionPane.ERROR_MESSAGE);
				System.out.println(ex);
				}
			}
		});
		btnSimpan.setBounds(31, 251, 167, 50);
		contentPane.add(btnSimpan);
		
		btnBatal = new JButton("Batal");
		btnBatal.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/Gambar/insertTable Img/Batal.png"));
		btnBatal.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent act) 
			{
				System.exit(0);
			}
		});
		btnBatal.setBounds(257, 251, 157, 50);
		contentPane.add(btnBatal);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/Gambar/insertTable Img/Pengiriman.png"));
		lblIcon.setBounds(455, 222, 157, 120);
		contentPane.add(lblIcon);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/Gambar/insertTable Img/kdeHijau.png"));
		lblWall.setBounds(0, -13, 618, 377);
		contentPane.add(lblWall);
		setLocationRelativeTo(null);
		
	
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try
				{
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					frameInputTable frame = new frameInputTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

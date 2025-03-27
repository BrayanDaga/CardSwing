package brayan.app;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseEvent;

import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.MouseInputAdapter;

public class Main {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
        frame = new JFrame("COORDENADAS MONTY");
        frame.setResizable(false);
        frame.setSize(340, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setRowSelectionAllowed(false);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"A", "68", "06", "09", "25", "46", "29", "79", "09", "71", "48"},
				{"B", "37", "95", "38", "79", "72", "44", "19", "65", "09", "66"},
				{"C", "03", "03", "38", "22", "77", "71", "60", "48", "89", "28"},
				{"D", "27", "62", "33", "78", "25", "75", "69", "53", "78", "51"},
				{"E", "25", "72", "04", "27", "60", "22", "27", "96", "13", "21"},
				{"F", "80", "18", "61", "82", "42", "57", "73", "75", "14", "18"},
				{"G", "70", "97", "60", "49", "74", "18", "18", "79", "53", "92"},
				{"H", "25", "62", "98", "72", "50", "42", "54", "31", "64", "41"},
				{"I", "02", "40", "63", "53", "13", "15", "43", "82", "94", "75"},
				{"J", "55", "51", "53", "09", "98", "96", "22", "79", "65", "53"},
			},
			new String[] {
				"#", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(0).setMinWidth(20);
		table.getColumnModel().getColumn(0).setMaxWidth(20);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setMinWidth(30);
		table.getColumnModel().getColumn(1).setMaxWidth(30);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(30);
		table.getColumnModel().getColumn(2).setMinWidth(30);
		table.getColumnModel().getColumn(2).setMaxWidth(30);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(30);
		table.getColumnModel().getColumn(3).setMinWidth(30);
		table.getColumnModel().getColumn(3).setMaxWidth(30);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(30);
		table.getColumnModel().getColumn(4).setMinWidth(30);
		table.getColumnModel().getColumn(4).setMaxWidth(30);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(30);
		table.getColumnModel().getColumn(5).setMinWidth(30);
		table.getColumnModel().getColumn(5).setMaxWidth(30);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setPreferredWidth(30);
		table.getColumnModel().getColumn(6).setMinWidth(30);
		table.getColumnModel().getColumn(6).setMaxWidth(30);
		table.getColumnModel().getColumn(7).setResizable(false);
		table.getColumnModel().getColumn(7).setPreferredWidth(30);
		table.getColumnModel().getColumn(7).setMinWidth(30);
		table.getColumnModel().getColumn(7).setMaxWidth(30);
		table.getColumnModel().getColumn(8).setResizable(false);
		table.getColumnModel().getColumn(8).setPreferredWidth(30);
		table.getColumnModel().getColumn(8).setMinWidth(30);
		table.getColumnModel().getColumn(8).setMaxWidth(30);
		table.getColumnModel().getColumn(9).setResizable(false);
		table.getColumnModel().getColumn(9).setPreferredWidth(30);
		table.getColumnModel().getColumn(9).setMinWidth(30);
		table.getColumnModel().getColumn(9).setMaxWidth(30);
		table.getColumnModel().getColumn(10).setResizable(false);
		table.getColumnModel().getColumn(10).setPreferredWidth(30);
		table.getColumnModel().getColumn(10).setMinWidth(30);
		table.getColumnModel().getColumn(10).setMaxWidth(30);
		table.setRowHeight(18); 
		table.getTableHeader().setReorderingAllowed(false) ;
	
	        
		setupCellRenderer();
        setupMouseMotionListener(); // Agregar el listener para el movimiento del mouse
		setupSelectionListener();

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(new JScrollPane(table));
		frame.setVisible(true);
	}
	

  
	private void setupCellRenderer() {
        @SuppressWarnings("serial")
		DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                           boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                if (!isSelected) {
                    cell.setBackground(row % 2 == 0 ? new Color(220, 230, 241) : Color.WHITE);
                } else {
                    cell.setBackground(new Color(173, 216, 230)); // Azul claro para selección
                }
                return cell;
            }
        };

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(customRenderer);
        }
    }
	
    private void setupSelectionListener() {
        table.getSelectionModel().addListSelectionListener(event -> {
            int row = table.getSelectedRow();
            int col = table.getSelectedColumn();
            if (row != -1 && col != -1) { // Verifica que hay una celda seleccionada
                Object value = table.getValueAt(row, col);
                System.out.println("Celda seleccionada: [" + row + ", " + col + "] = " + value);
                // Copiar al portapapeles
                StringSelection selection = new StringSelection(value.toString());
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
                System.out.println("Copiado al portapapeles: " + value.toString());
            }
        });
    }
    
    private void setupMouseMotionListener() {
    	  table.addMouseMotionListener(new MouseInputAdapter() {
              @Override
              public void mouseMoved(MouseEvent e) {
                  int row = table.rowAtPoint(e.getPoint());
                  int col = table.columnAtPoint(e.getPoint());

                  // Omitir la primera columna (índice 0) que tiene las letras de las filas
                  if (row != -1 && col != -1 && col > 0) {
                      // Obtenemos la letra de la fila (columna 0)
                      String rowLetter = (String) table.getValueAt(row, 0); // La primera columna tiene las letras A, B, C...
                      // El número de la columna es col, pero es 1-based (empezamos desde la columna 1)
                      String columnNumber = String.valueOf(col); // La columna es 1-based

                      // Establecer el tooltip en el formato de "A1", "B2", etc.
                      table.setToolTipText(rowLetter + columnNumber); // Muestra como "A1", "B2", etc.
                  }
              }
          });
    }
	 

}

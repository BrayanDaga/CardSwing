package org.brayan;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.MouseInputAdapter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class CardKey {
    private JFrame frame;
    private JTable table;

    public CardKey() {
        this.initialize();
    }

    private void initialize() {
        this.frame = new JFrame("COORDENADAS MONTY");
        this.frame.setResizable(false);
        this.frame.setSize(340, 250);
        this.frame.setDefaultCloseOperation(3);
        this.table = new JTable();
        this.table.setSelectionMode(0);
        this.table.setRowSelectionAllowed(false);
        this.table.setCellSelectionEnabled(true);
        this.table.setFont(new Font("Tahoma", 0, 14));
        this.table.setModel(new DefaultTableModel(new Object[][]{{"A", "68", "06", "09", "25", "46", "29", "79", "09", "71", "48"}, {"B", "37", "95", "38", "79", "72", "44", "19", "65", "09", "66"}, {"C", "03", "03", "38", "22", "77", "71", "60", "48", "89", "28"}, {"D", "27", "62", "33", "78", "25", "75", "69", "53", "78", "51"}, {"E", "25", "72", "04", "27", "60", "22", "27", "96", "13", "21"}, {"F", "80", "18", "61", "82", "42", "57", "73", "75", "14", "18"}, {"G", "70", "97", "60", "49", "74", "18", "18", "79", "53", "92"}, {"H", "25", "62", "98", "72", "50", "42", "54", "31", "64", "41"}, {"I", "02", "40", "63", "53", "13", "15", "43", "82", "94", "75"}, {"J", "55", "51", "53", "09", "98", "96", "22", "79", "65", "53"}}, new String[]{"#", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}) {
            boolean[] columnEditables = new boolean[]{false, false, false, false, false, false, false, false, false, false, false};

            public boolean isCellEditable(int row, int column) {
                return this.columnEditables[column];
            }
        });
        this.table.getColumnModel().getColumn(0).setResizable(false);
        this.table.getColumnModel().getColumn(0).setPreferredWidth(20);
        this.table.getColumnModel().getColumn(0).setMinWidth(20);
        this.table.getColumnModel().getColumn(0).setMaxWidth(20);
        this.table.getColumnModel().getColumn(1).setResizable(false);
        this.table.getColumnModel().getColumn(1).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(1).setMinWidth(30);
        this.table.getColumnModel().getColumn(1).setMaxWidth(30);
        this.table.getColumnModel().getColumn(2).setResizable(false);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(2).setMinWidth(30);
        this.table.getColumnModel().getColumn(2).setMaxWidth(30);
        this.table.getColumnModel().getColumn(3).setResizable(false);
        this.table.getColumnModel().getColumn(3).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(3).setMinWidth(30);
        this.table.getColumnModel().getColumn(3).setMaxWidth(30);
        this.table.getColumnModel().getColumn(4).setResizable(false);
        this.table.getColumnModel().getColumn(4).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(4).setMinWidth(30);
        this.table.getColumnModel().getColumn(4).setMaxWidth(30);
        this.table.getColumnModel().getColumn(5).setResizable(false);
        this.table.getColumnModel().getColumn(5).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(5).setMinWidth(30);
        this.table.getColumnModel().getColumn(5).setMaxWidth(30);
        this.table.getColumnModel().getColumn(6).setResizable(false);
        this.table.getColumnModel().getColumn(6).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(6).setMinWidth(30);
        this.table.getColumnModel().getColumn(6).setMaxWidth(30);
        this.table.getColumnModel().getColumn(7).setResizable(false);
        this.table.getColumnModel().getColumn(7).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(7).setMinWidth(30);
        this.table.getColumnModel().getColumn(7).setMaxWidth(30);
        this.table.getColumnModel().getColumn(8).setResizable(false);
        this.table.getColumnModel().getColumn(8).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(8).setMinWidth(30);
        this.table.getColumnModel().getColumn(8).setMaxWidth(30);
        this.table.getColumnModel().getColumn(9).setResizable(false);
        this.table.getColumnModel().getColumn(9).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(9).setMinWidth(30);
        this.table.getColumnModel().getColumn(9).setMaxWidth(30);
        this.table.getColumnModel().getColumn(10).setResizable(false);
        this.table.getColumnModel().getColumn(10).setPreferredWidth(30);
        this.table.getColumnModel().getColumn(10).setMinWidth(30);
        this.table.getColumnModel().getColumn(10).setMaxWidth(30);
        this.table.setRowHeight(18);
        this.table.getTableHeader().setReorderingAllowed(false);
        this.setupCellRenderer();
        this.setupMouseMotionListener();
        this.setupSelectionListener();
        this.frame.getContentPane().setLayout(new BorderLayout());
        this.frame.getContentPane().add(new JScrollPane(this.table));
        this.frame.setVisible(true);
    }

    private void setupCellRenderer() {
        DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                this.setHorizontalAlignment(0);
                if (!isSelected) {
                    cell.setBackground(row % 2 == 0 ? new Color(220, 230, 241) : Color.WHITE);
                } else {
                    cell.setBackground(new Color(173, 216, 230));
                }

                return cell;
            }
        };

        for(int i = 0; i < this.table.getColumnCount(); ++i) {
            this.table.getColumnModel().getColumn(i).setCellRenderer(customRenderer);
        }

    }

    private void setupSelectionListener() {
        this.table.getSelectionModel().addListSelectionListener((event) -> {
            int row = this.table.getSelectedRow();
            int col = this.table.getSelectedColumn();
            if (col == 0) {
                this.table.clearSelection();
            } else {
                if (row != -1 && col != -1) {
                    Object value = this.table.getValueAt(row, col);
                    String text = value.toString();
                    StringSelection selection = new StringSelection(text);
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, (ClipboardOwner)null);
                }

            }
        });
    }

    private void setupMouseMotionListener() {
        this.table.addMouseMotionListener(new MouseInputAdapter() {
            public void mouseMoved(MouseEvent e) {
                int row = CardKey.this.table.rowAtPoint(e.getPoint());
                int col = CardKey.this.table.columnAtPoint(e.getPoint());
                if (row != -1 && col != -1 && col > 0) {
                    String rowLetter = (String)CardKey.this.table.getValueAt(row, 0);
                    String columnNumber = String.valueOf(col);
                    CardKey.this.table.setToolTipText(rowLetter + columnNumber);
                }

            }
        });
    }
}

package Tutoring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public final class DoublClickJTableRowTest extends JFrame {
   private JTable table;
   private JScrollPane scrollPane;
   public DoublClickJTableRowTest() {
      setTitle("DoublClickJTableRow Test");
      String[] columnNames = {"First Name", "Last Name"};
      Object[][] data = {{"Raja", "Ramesh"}, {"Adithya", "Sai"}, {"Vineet", "Kumar"}, {"Krishna", "Kasyap"}};
      table = new JTable(data, columnNames) {
         public boolean editCellAt(int row, int column, java.util.EventObject e) {
            return false;
       }
      };
      table.setFocusable(false);
      table.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent me) {
            if (me.getClickCount() == 2) {     // to detect doble click events
               JTable target = (JTable)me.getSource();
               int row = target.getSelectedRow(); // select a row
               int column = target.getSelectedColumn(); // select a column
              JOptionPane.showMessageDialog(null, table.getValueAt(row, column)); // get the value of a row and column.
            }
         }
      });
      scrollPane= new JScrollPane(table);
      add(scrollPane);
      setSize(375, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static void main(String[] args) {
      new DoublClickJTableRowTest();
   }
}
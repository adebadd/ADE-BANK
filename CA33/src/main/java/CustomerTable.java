
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Speed
 */
public class CustomerTable extends AbstractTableModel {

    private ArrayList<ArrayList<String>> data;
    private String[] columnNames = {"Customer First", "Customer Last", "Customer ID", "Customer PPSN", "Customer DOB", "Customer Account Number"};

    @Override
    public int getRowCount() {
        return this.data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex).get(columnIndex);
    }

    public void addCustomer(Customer customer) {
        ArrayList<String> row = new ArrayList<String>();
        row.add(customer.getCustomerFirst());
        row.add(customer.getCustomerLast());
        row.add(customer.getCustomerID());
        row.add(customer.getCustomerPPSN());
        row.add(customer.getCustomerDOB());
        row.add(customer.getAccountNum());
        data.add(row);

    }

}

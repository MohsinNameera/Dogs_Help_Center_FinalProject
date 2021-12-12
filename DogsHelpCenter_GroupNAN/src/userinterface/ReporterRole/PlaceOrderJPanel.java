/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReporterRole;

import Business.Reporter.Reporter;
import Business.EcoSystem;
import Business.HelpCenter.Services;
import Business.HelpCenter.ServicesList;
import Business.HelpCenter.HelpCenter;
import Business.HelpCenter.HelpCenterDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ItemWithQuantity;
import Business.WorkQueue.OrderWorkRequest;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class PlaceOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Reporter customer;
    private DefaultTableModel menuTable;
    private DefaultTableModel cartTable;
    private int index = -1;
    private int row = 0;
    private int column = 0;
    private int quantity = 0;
    private EcoSystem ecosystem;
    private HelpCenterDirectory resturantDirectory;
    private List<ItemWithQuantity> itemsWithQuantityList = new ArrayList<ItemWithQuantity>();

    /**
     * Creates new form RequestLabTestJPanel
     */
    public PlaceOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        customer = (Reporter) account;
        resturantDirectory = ecosystem.getRestaurantDirectory();
        menuTable = (DefaultTableModel) tblOrder.getModel();
        cartTable = (DefaultTableModel) tblCart.getModel();
        populateRestaurantsList(resturantDirectory.getRestaurantList());
        if (resturantDirectory.getRestaurantList().size() > 0) {
            index = 0;
            populateMenu();
        }
      //  totalPrice.setEditable(false);

    }

    public boolean isItemSelected(Services item) {
        int nRow = tblOrder.getRowCount();
        int count1 = 0;
        boolean s = true;

        for (int i = 0; i < nRow; i++) {
            if (null != tblOrder.getValueAt(i, 2)) {
                if ((Boolean) tblOrder.getValueAt(i, 2) == false) {
                    count1++;
                }
            }
        }
        if (count1 == nRow) {
            s = false;
            JOptionPane.showMessageDialog(null, "Please select an item");
        }
        return s;
    }

    public void populateRestaurantsList(ArrayList<HelpCenter> restaurantList) {
        for (HelpCenter restaurant : restaurantList) {
            restaurantComboBox.addItem(restaurant.getName());
        }
    }

    private void populateMenu() {
        menuTable.setRowCount(0);
        //createAddToCartButton();
        HelpCenter restaurant = resturantDirectory.getRestaurantList().get(index);
        ServicesList menu = restaurant.getServicesList();
        List<Services> items = menu.getItemList();
        for (Services item : items) {
            Object[] row = new Object[menuTable.getColumnCount()];
            row[0] = item;
         //   row[1] = item.getPrice();
            menuTable.addRow(row);
        }
    }

    private void initListners() {
        tblOrder.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblOrder.getSelectedRow();
                if (selectedRow >= 0) {
                    Services item = (Services) tblOrder.getValueAt(selectedRow, 0);
                    if (item != null) {
                        String response = JOptionPane.showInputDialog("Please provide Quantity");
                        try {
                            quantity = Integer.parseInt(response);
                        } catch (NumberFormatException e) {

                        }
                        if (quantity != 0) {
                            ItemWithQuantity itemWithQuantity = new ItemWithQuantity(item, quantity);
                            itemsWithQuantityList.add(itemWithQuantity);
                            System.out.println("QUANTITY : " + quantity);
                            populateItemsWithQuantityTable();
                        }

                    }
                }
            }
        });
    }

    private void populateItemsWithQuantityTable() {
        double total = 0.0;
        cartTable.setRowCount(0);
        for (ItemWithQuantity itemWithQuantity : itemsWithQuantityList) {
            Object[] row = new Object[cartTable.getColumnCount()];
            row[0] = itemWithQuantity;
            row[1] = itemWithQuantity.getQuantity();
           // row[2] = itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
           // total += itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
            cartTable.addRow(row);
        }
        //totalPrice.setText(total + "");
    }

    private boolean createOrder() {

        if (itemsWithQuantityList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add items to cart, it cannot be empty");
            return false;
        } else {
            OrderWorkRequest orderWorkRequest = new OrderWorkRequest();
            orderWorkRequest.setItemsWithQuatityList(itemsWithQuantityList);
            orderWorkRequest.setMessage(message.getText());
            if (customer != null) {
                orderWorkRequest.setCustomer(customer);
            } else {
                System.out.println("Customer is null");
                return false;
            }
            HelpCenter restaurant = resturantDirectory.getRestaurantList().get(index);
            if (restaurant != null) {
                orderWorkRequest.setRestaurant(restaurant);
            } else {
                System.out.println("Restaurant is null");
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Ordered");
            ecosystem.getWorkQueue().addWorkRequest(orderWorkRequest);
            return true;

        }
    }

//    private void createAddToCartButton(){
//        ButtonColumn addToCartButton = new ButtonColumn("Add to Cart");
//        addToCartButton.addTableButtonListener(new TableButtonListener(){
//            @Override
//            public void tableButtonClicked(int row, int col) {
//                String response = JOptionPane.showInputDialog("Please provide Quantity");
//                quantity = Integer.parseInt(response);
//                System.out.println("QUANTITY : " + quantity);
//            }
//        });
//        TableColumn col = tblOrder.getColumn("Services Selection");
//        col.setCellRenderer(addToCartButton);
//        col.setCellEditor(addToCartButton);
//        
//        
////        row = tblOrder.getSelectedRow();
////        column = tblOrder.getSelectedColumn();
////        TableButtonListener buttonClicked = new ButtonColumn("Add to Cart");
////        buttonClicked.tableButtonClicked(row, column); // need to get column n row index
////        String response = JOptionPane.showInputDialog("Please provide Quantity");
////        
////        System.out.println("QUANTITY : " + quantity);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        message = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        restaurantComboBox = new javax.swing.JComboBox<>();
        enterpriseLabel1 = new javax.swing.JLabel();
        cartScrollPane = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 178, 62));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, -1));
        add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 89, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 790, -1));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Item Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 660, 130));

        restaurantComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantComboBoxActionPerformed(evt);
            }
        });
        add(restaurantComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 190, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        enterpriseLabel1.setText("Select Restaurant");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, 20));

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScrollPane.setViewportView(tblCart);

        add(cartScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 660, 190));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CART");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 650, -1));

        jLabel4.setText("Total");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PLACE ORDER");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 740, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if (createOrder()) {
            JOptionPane.showMessageDialog(null, "Ordered Placed Successfully");
            OrderStatusJPanel orderStatusJPanel = new OrderStatusJPanel(userProcessContainer, ecosystem, customer);
            userProcessContainer.add("OrderStatusJPanel", orderStatusJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }


    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void restaurantComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantComboBoxActionPerformed
        index = restaurantComboBox.getSelectedIndex();
        //clear of the selected items
        itemsWithQuantityList.clear();
        populateMenu();
        populateItemsWithQuantityTable();
    }//GEN-LAST:event_restaurantComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane cartScrollPane;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField message;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> restaurantComboBox;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
}

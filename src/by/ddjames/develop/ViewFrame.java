
package by.ddjames.develop;

import by.ddjames.misc.Constant;
import java.awt.BorderLayout;
import static java.lang.Math.pow;
import java.net.URL;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author MSI
 */
public class ViewFrame extends javax.swing.JFrame {

    public ViewFrame() {

        ImageIcon icon = createIcon(Constant.ICON_IMG);

        setIconImage(icon.getImage());
        
        ImageIcon bgImage = createIcon(Constant.IMG_BG);

        JLabel backgroundImage = new JLabel(bgImage);

        this.add(backgroundImage);
        
        pack();
        //System.out.println(System.getProperty("user.dir")+File.separator +"images" +File.separator + "image1.jpg");
        //System.out.println(NewJFrame.class.getResource("image1.jpg"));
         
        initComponents();
        

    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultVolumeFrame = new javax.swing.JFrame();
        resultPanel = new javax.swing.JPanel();
        caliberChiselField = new javax.swing.JTextField();
        depthField = new javax.swing.JTextField();
        factorField = new javax.swing.JTextField();
        addVolumeButton = new javax.swing.JButton();
        resultHolder = new javax.swing.JScrollPane();
        resultList = new javax.swing.JList();
        caliberInfo = new javax.swing.JLabel();
        depthInfo = new javax.swing.JLabel();
        factorInfo = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        volumeButton = new javax.swing.JButton();
        FileMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        NewSchemeItem = new javax.swing.JMenuItem();
        LoadItem = new javax.swing.JMenuItem();
        ExitMenuItem = new javax.swing.JMenuItem();
        AboutMenu = new javax.swing.JMenu();
        FAQMenuItem = new javax.swing.JMenuItem();
        AboutMenuItem = new javax.swing.JMenuItem();

        resultVolumeFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        resultVolumeFrame.setTitle("Рассчитать объём");
        resultVolumeFrame.setMinimumSize(new java.awt.Dimension(512, 302));
        resultVolumeFrame.setPreferredSize(new java.awt.Dimension(589, 400));

        resultPanel.setMinimumSize(new java.awt.Dimension(512, 302));

        addVolumeButton.setText("Добавить");
        addVolumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVolumeButtonActionPerformed(evt);
            }
        });

        resultHolder.setViewportView(resultList);

        caliberInfo.setText("Диаметр долота, м");

        depthInfo.setText("Глубина забоя, м");

        factorInfo.setText("Коэф. поверхности");

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caliberInfo)
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(resultPanelLayout.createSequentialGroup()
                                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(caliberChiselField, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(factorField)
                                    .addComponent(depthField))
                                .addGap(61, 61, 61))
                            .addGroup(resultPanelLayout.createSequentialGroup()
                                .addComponent(depthInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addGap(51, 51, 51)))
                        .addComponent(addVolumeButton))
                    .addComponent(factorInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(resultHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(addVolumeButton))
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(resultPanelLayout.createSequentialGroup()
                                .addComponent(caliberInfo)
                                .addGap(2, 2, 2)
                                .addComponent(caliberChiselField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(depthInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(depthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(factorInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(factorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout resultVolumeFrameLayout = new javax.swing.GroupLayout(resultVolumeFrame.getContentPane());
        resultVolumeFrame.getContentPane().setLayout(resultVolumeFrameLayout);
        resultVolumeFrameLayout.setHorizontalGroup(
            resultVolumeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultVolumeFrameLayout.createSequentialGroup()
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultVolumeFrameLayout.setVerticalGroup(
            resultVolumeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        resultVolumeFrame.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MechEdge v0.1");
        setResizable(false);

        volumeButton.setText("Объём");
        volumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(volumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(volumeButton)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        FileMenu.setText("File");

        NewSchemeItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        NewSchemeItem.setText("New Scheme");
        NewSchemeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSchemeItemActionPerformed(evt);
            }
        });
        FileMenu.add(NewSchemeItem);

        LoadItem.setText("LoadXML");
        FileMenu.add(LoadItem);

        ExitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(ExitMenuItem);

        FileMenuBar.add(FileMenu);

        AboutMenu.setText("Help");

        FAQMenuItem.setText("FAQ");
        AboutMenu.add(FAQMenuItem);

        AboutMenuItem.setText("About");
        AboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutMenuItemActionPerformed(evt);
            }
        });
        AboutMenu.add(AboutMenuItem);

        FileMenuBar.add(AboutMenu);

        setJMenuBar(FileMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed

        System.exit(0);

    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void NewSchemeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSchemeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewSchemeItemActionPerformed

    private void AboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutMenuItemActionPerformed
       
    }//GEN-LAST:event_AboutMenuItemActionPerformed

    private void volumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeButtonActionPerformed
        resultVolumeFrame.setVisible(true);
    }//GEN-LAST:event_volumeButtonActionPerformed

    private void addVolumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVolumeButtonActionPerformed
        int first = Integer.parseInt(caliberChiselField.getText());
        int second = Integer.parseInt(depthField.getText());
        int third = Integer.parseInt(factorField.getText());

        double v =  ((Math.PI * pow(first,2)) / 4) * (second * third );
        String result;
        result = String.valueOf(v);

        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement(result);
        resultList.setModel(listModel);

    }//GEN-LAST:event_addVolumeButtonActionPerformed

    protected static ImageIcon createIcon(String path) {
        URL imgURL = ViewFrame.class.getResource(path);
        //NewJFrame.class.getResourceAsStream(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutMenu;
    private javax.swing.JMenuItem AboutMenuItem;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenuItem FAQMenuItem;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuBar FileMenuBar;
    private javax.swing.JMenuItem LoadItem;
    private javax.swing.JMenuItem NewSchemeItem;
    private javax.swing.JButton addVolumeButton;
    private javax.swing.JTextField caliberChiselField;
    private javax.swing.JLabel caliberInfo;
    private javax.swing.JTextField depthField;
    private javax.swing.JLabel depthInfo;
    private javax.swing.JTextField factorField;
    private javax.swing.JLabel factorInfo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane resultHolder;
    private javax.swing.JList resultList;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JFrame resultVolumeFrame;
    private javax.swing.JButton volumeButton;
    // End of variables declaration//GEN-END:variables
    
}

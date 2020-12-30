/**
*
* @author lAKAD MATATAG
* Member : Muhammad Nurifai || Reza Angga Putra || Alif Alghifari || Muhammad Fahrezi || Raihan Amal Ramadhan || Muhammad Ridha Maulana
*/

package labalgor;
import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Locale;

public class KasirToko extends javax.swing.JFrame {

public StringTokenizer token;
public String gantiformat="";
public String namabrg= "";
public int jmlbeli;
public long jmlharga;
public long hargabrg;
public long totalbiaya;
public long kembalian;
public long jmlbayar;

/**
* Creates new form KasirToko
*/
public KasirToko() {
    initComponents();
    CB_namabrg.setSelectedIndex(-1);
}

@SuppressWarnings("unchecked")

private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    CB_namabrg = new javax.swing.JComboBox<>();
    jLabel2 = new javax.swing.JLabel();
    Txthargabrg = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    Txtjmlbrg = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    Txtjmlharga = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    Txtdiskon = new javax.swing.JTextField();
    Txthasildiskon = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    TxtTotalbiaya = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();
    TxtTotalbayar = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    TxtKembalian = new javax.swing.JTextField();
    jButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("NAMA BARANG");

    CB_namabrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KULKAS", "SPEAKER", "TELEVISI", "DVD PLAYER" }));
    CB_namabrg.setSelectedIndex(-1);
    CB_namabrg.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        CB_namabrgActionPerformed(evt);
        }
    });

    jLabel2.setText("HARGA BARANG");

    jLabel3.setText("JUMLAH BELI");

    jLabel4.setText("JUMLAH HARGA");

    jLabel5.setText("DISCOUNT");

    jLabel6.setText("TOTAL BIAYA");

    jButton1.setText("HITUNG TOTAL BIAYA");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jLabel7.setText("TOTAL BAYAR");

    TxtTotalbayar.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            TxtTotalbayarFocusLost(evt);
        }
    });

    jLabel8.setText("UANG KEMBALIAN");

    jButton2.setText("CLEAR");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(49, 49, 49)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(CB_namabrg, 0, 150, Short.MAX_VALUE)
        .addComponent(Txthargabrg)
        .addComponent(Txtjmlbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(Txtjmlharga)
        .addGroup(layout.createSequentialGroup()
        .addComponent(Txtdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(Txthasildiskon))
        .addComponent(TxtTotalbiaya)
        .addComponent(TxtTotalbayar)
        .addComponent(TxtKembalian))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(34, 34, 34)
        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
        .addGroup(layout.createSequentialGroup()
        .addGap(74, 74, 74)
        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(46, Short.MAX_VALUE))))
    );

    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(41, 41, 41)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(CB_namabrg, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(Txthargabrg, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(Txtjmlbrg, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(Txtjmlharga))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(Txthasildiskon, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(Txtdiskon))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(TxtTotalbiaya, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        .addGap(33, 33, 33)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(TxtTotalbayar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(TxtKembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        .addContainerGap(24, Short.MAX_VALUE))
    );
    pack();
}


private void CB_namabrgActionPerformed(java.awt.event.ActionEvent evt) {

    namabrg=(String)CB_namabrg.getSelectedItem();
    if (namabrg == "KULKAS"){
        hargabrg = 2400000;
    } else if(namabrg == "SPEAKER"){
        hargabrg = 1500000;
    } else if(namabrg == "TELEVISI"){
        hargabrg = 2350000;
    } else if(namabrg == "DVD PLAYER"){
        hargabrg = 1750000;
    }

    gantiformat=NumberFormat.getNumberInstance(Locale.ENGLISH).format(hargabrg);
    token=new StringTokenizer(gantiformat,".");
    gantiformat=token.nextToken();
    gantiformat=gantiformat.replace(',','.');
    Txthargabrg.setText(gantiformat);
}

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    jmlbeli=Integer.parseInt(Txtjmlbrg.getText());
    jmlharga=jmlbeli*hargabrg;

    gantiformat=NumberFormat.getNumberInstance(Locale.ENGLISH).format(jmlharga);
    token=new StringTokenizer(gantiformat,".");
    gantiformat=token.nextToken();
    gantiformat=gantiformat.replace(',','.');
    Txtjmlharga.setText(gantiformat);

    long hasildiskon;
    if (jmlharga >= 7000000) {
        Txtdiskon.setText("10%");
        hasildiskon=(jmlharga*10)/100;
    } else if(jmlharga > 3500000) {
        Txtdiskon.setText("5%");
        hasildiskon=(jmlharga*5)/100;
    } else {
        Txtdiskon.setText("0%");
        hasildiskon=0;
    }
    gantiformat=NumberFormat.getNumberInstance(Locale.ENGLISH).format(hasildiskon);
    token=new StringTokenizer(gantiformat,".");
    gantiformat=token.nextToken();
    gantiformat=gantiformat.replace(',','.');
    Txthasildiskon.setText(gantiformat);

    totalbiaya=jmlharga-hasildiskon;

    gantiformat=NumberFormat.getNumberInstance(Locale.ENGLISH).format(totalbiaya);
    token=new StringTokenizer(gantiformat,".");
    gantiformat=token.nextToken();
    gantiformat=gantiformat.replace(',','.');
    TxtTotalbiaya.setText(gantiformat);
}

private void TxtTotalbayarFocusLost(java.awt.event.FocusEvent evt) {

    jmlbayar=Long.parseLong(TxtTotalbayar.getText());
    kembalian=jmlbayar-totalbiaya;

    gantiformat=NumberFormat.getNumberInstance(Locale.ENGLISH).format(jmlbayar);
    token=new StringTokenizer(gantiformat,".");
    gantiformat=token.nextToken();
    gantiformat=gantiformat.replace(',','.');
    TxtTotalbayar.setText(gantiformat);

    gantiformat=NumberFormat.getNumberInstance(Locale.ENGLISH).format(kembalian);
    token=new StringTokenizer(gantiformat,".");
    gantiformat=token.nextToken();
    gantiformat=gantiformat.replace(',','.');
    TxtKembalian.setText(gantiformat);
}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

    CB_namabrg.setSelectedIndex(-1);
    Txthargabrg.setText("");
    Txtjmlbrg.setText("");
    Txtjmlharga.setText("");
    TxtTotalbayar.setText("");
    TxtKembalian.setText("");
    Txtdiskon.setText("");
    Txthasildiskon.setText("");
    TxtTotalbiaya.setText("");

}

// Method Main untuk menjalankan Program 
public static void main(String args[]) {

    try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
        break;
        }   
    }
    } catch (ClassNotFoundException ex) {
    java.util.logging.Logger.getLogger(KasirToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
    java.util.logging.Logger.getLogger(KasirToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
    java.util.logging.Logger.getLogger(KasirToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(KasirToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }


    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new KasirToko().setVisible(true);
        }
    });
    }

// mendlekarasikan variable
private javax.swing.JComboBox<String> CB_namabrg;
private javax.swing.JTextField TxtKembalian;
private javax.swing.JTextField TxtTotalbayar;
private javax.swing.JTextField TxtTotalbiaya;
private javax.swing.JTextField Txtdiskon;
private javax.swing.JTextField Txthargabrg;
private javax.swing.JTextField Txthasildiskon;
private javax.swing.JTextField Txtjmlbrg;
private javax.swing.JTextField Txtjmlharga;
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
private javax.swing.JLabel jLabel8;

}
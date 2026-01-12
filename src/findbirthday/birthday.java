
package findbirthday;

import java.time.MonthDay;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;
import java.time.LocalDate;



public class birthday extends javax.swing.JPanel {
    
    String Year;
    String mounth[]={"Januwary","Febuary","March","April","May","June","July","August","September","October","November","December"};
    int monthday[]={31,59,90,120,151,181,212,243,273,304,334,365};
    String month;
    String day;
    String Gender;
    int age;
    int pyear;
    Date d=new Date();
    LocalDate today = LocalDate.now();
    
    

    
    public birthday() {
        
        
        initComponents();
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
        Timer timer = new Timer(1000, e -> {
            LocalDateTime now = LocalDateTime.now();
            lbldate.setText(now.format(formatter));
        });
        timer.start();


        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtyear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblerrors = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 255));
        setForeground(new java.awt.Color(255, 51, 255));

        jLabel1.setFont(new java.awt.Font("Serifa BT", 0, 18)); // NOI18N
        jLabel1.setText("Enter Your National ID Card Number: ");

        txtid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        BtnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setText("Year");

        txtyear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setText("Months");

        txtMonth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel4.setText("Day");

        txtDay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel5.setText("Gender");

        txtGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel6.setText("Age");

        txtAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblerrors.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbldate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel7.setText("IDD TO Birthday Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsearch)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnClear)
                            .addComponent(txtyear)
                            .addComponent(txtMonth)
                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblerrors, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblerrors, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsearch)
                            .addComponent(BtnClear))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
            txtDay.setText(null);
            txtGender.setText(null);
            txtMonth.setText(null);
            txtid.setText(null);
            txtyear.setText(null);
            txtAge.setText(null);
            lblerrors.setText(null);
    }//GEN-LAST:event_BtnClearActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
              
    }//GEN-LAST:event_txtidActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
               String id=txtid.getText();
               int size=id.length();
               if(size==10){
                   int setYear=Integer.parseInt(id.substring(0,2));
                   Year="19"+setYear;
                   if(Integer.parseInt(Year)%4==0){
                       int sday=Integer.parseInt(id.substring(2,5));
                       if(sday>500){
                           sday=Integer.parseInt(id.substring(2,5))-500;
                           Gender="Female";
                       }
                       else{
                           sday=Integer.parseInt(id.substring(2,5));
                           Gender="Male";
                       }
                       
                       for(int i = 0; i < 12; i++){
                            if(sday <= monthday[i]){
                                month = Integer.toString(i + 1); 
                                 if(i==0){
                                    day=Integer.toString(sday);
                                }
                                else if(i==1){
                                   int pday = (sday - monthday[i - 1]);
                                    day=Integer.toString(pday);
                               }
                                else{
                                    if(sday-1==monthday[i-1]){
                                       month = Integer.toString(i);
                                       int pday = (sday - monthday[i - 2]);
                                       day=Integer.toString(pday-1); 
                                        
                                    }
                                    else{
                                        int pday = (sday - monthday[i - 1]);
                                        day=Integer.toString(pday-1);
                                    }
                                }
                                break;
                            }
                       }

                   }
                   else{
                       setYear=Integer.parseInt(id.substring(0,2));
                       Year="19"+setYear;
                       int sday=Integer.parseInt(id.substring(2,5));
                       if(sday>500){
                           sday=Integer.parseInt(id.substring(2,5))-500;
                           Gender="Female";
                       }
                       else{
                           sday=Integer.parseInt(id.substring(2,5));
                           Gender="Male";
                       }
                       for(int i = 0; i < 12; i++){
                            if(sday <= monthday[i]){
                                month = Integer.toString(i + 1); 
                                if(i == 0){
                                    day = Integer.toString(sday);
                                } else {
                                    int pday = (sday - monthday[i - 1]);
                                    day=Integer.toString(pday-1);
                                }
                                break;
                            }
                       }
                   }
                  
                   
                   
               }
               else if(size==12){
                   Year=id.substring(0,4);
                   if(Integer.parseInt(Year)%4==0){
                        int sday=Integer.parseInt(id.substring(4,7));
                        if(sday>500){
                           sday=Integer.parseInt(id.substring(4,7))-500;
                           Gender="Female";
                        }
                        else{
                            sday=Integer.parseInt(id.substring(4,7));
                            Gender="Male";
                        }
                        for(int i=0;i<12;i++){
                            if(sday<=monthday[i]){
                               month = Integer.toString(i + 1);
                               if(i==0){
                                day=Integer.toString(sday);
                               }
                               else if(i==1){
                                   int pday = (sday - monthday[i - 1]);
                                    day=Integer.toString(pday);
                               }
                                else{
                                    if(sday-1==monthday[i-1]){
                                       month = Integer.toString(i);
                                       int pday = (sday - monthday[i - 2]);
                                       day=Integer.toString(pday-1); 
                                        
                                    }
                                    else{
                                        int pday = (sday - monthday[i - 1]);
                                        day=Integer.toString(pday-1);
                                    }
                                    
                                }
                                break; 
                            }
                            
                        }
                   }
                   else{
                        int sday=Integer.parseInt(id.substring(4,7));
                        if(sday>500){
                           sday=Integer.parseInt(id.substring(4,7))-500;
                           Gender="Female";
                        }
                        else{
                            sday=Integer.parseInt(id.substring(4,7));
                            Gender="Male";
                        }
                        for(int i=0;i<12;i++){
                            if(sday<=monthday[i]){
                               month = Integer.toString(i + 1);
                               if(i==0){
                                day=Integer.toString(sday);
                                }
                                else{
                                    int pday = (sday - monthday[i - 1]);
                                    day=Integer.toString(pday-1);
                                }
                                break; 
                            }
                            
                        }
                   }
                   
                   
               }
               else{
                   lblerrors.setText("Enter Valid idd Number");
                   return;
               }
                int cyear = today.getYear();
                int cmonth = today.getMonthValue(); // 1 - 12
                int cday = today.getDayOfMonth();
                if(Integer.parseInt(month)<=cmonth+1){
                   if(Integer.parseInt(month)==cmonth+1){
                       if(Integer.parseInt(day)<cday){
                           pyear=Integer.parseInt(Year);
                           age=(cyear-1)- pyear;
                       }
                       else{
                           pyear=Integer.parseInt(Year);
                           age=(cyear)- pyear;
                       }
                   }
                   else{
                       pyear=Integer.parseInt(Year);
                       age=(cyear)- pyear;
                   }
                }
                else{
                    pyear=Integer.parseInt(Year);
                    age=(cyear-1)- pyear;
                    
                }
                lblerrors.setText("Your Details is");
                int tmonth=Integer.parseInt(month);
                month=mounth[tmonth-1];
                txtGender.setText(Gender);
                txtyear.setText(Year);
                txtMonth.setText(month);
                txtDay.setText(day);
                txtAge.setText(Integer.toString(age));
                
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblerrors;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}

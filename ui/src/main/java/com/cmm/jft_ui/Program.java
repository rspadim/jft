/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmm.jft_ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.cmm.jft_ui.forms.AbstractForm;
import com.cmm.jft_ui.forms.FormsFactory;

/**
 *
 * @author Cristiano M Martins
 */
public class Program extends AbstractForm {

    /**
     * Creates new form Program
     */
    public Program() {
	initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jProgressBar2 = new javax.swing.JProgressBar();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jSeparatorFile = new javax.swing.JPopupMenu.Separator();
        jMIFileExit = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuModules = new javax.swing.JMenu();
        jMenuAnalysis = new javax.swing.JMenu();
        jMIAnalysisChart = new javax.swing.JMenuItem();
        jMIAnalysisStatistics = new javax.swing.JMenuItem();
        jMIAnalysisNeuralNetwork = new javax.swing.JMenuItem();
        jMenuMasterData = new javax.swing.JMenu();
        jMenuMasterDataLocation = new javax.swing.JMenu();
        jMIMasterDataCountries = new javax.swing.JMenuItem();
        jMIMasterDataBrokers = new javax.swing.JMenuItem();
        jMenuMasterDataCompany = new javax.swing.JMenu();
        jMIMasterDataCompanies = new javax.swing.JMenuItem();
        jMIMasterDataSectors = new javax.swing.JMenuItem();
        jMIMasterDataSubsectors = new javax.swing.JMenuItem();
        jMIMasterDataSegments = new javax.swing.JMenuItem();
        jMenuMasterDataCurrency = new javax.swing.JMenu();
        jMIMasterDataCurrency = new javax.swing.JMenuItem();
        jMIMasterDataCurrencyQuotes = new javax.swing.JMenuItem();
        jMIMasterDataStockExchange = new javax.swing.JMenuItem();
        jMenuFinancial = new javax.swing.JMenu();
        jMIFinancialAccounts = new javax.swing.JMenuItem();
        jMIFinancialDeposits = new javax.swing.JMenuItem();
        jMIFinancialJournalEntry = new javax.swing.JMenuItem();
        jMIFinancialDistributionRule = new javax.swing.JMenuItem();
        jMIFinancialTax = new javax.swing.JMenuItem();
        jMenuTrading = new javax.swing.JMenu();
        jMITradingOrdersManager = new javax.swing.JMenuItem();
        jMITradingTradeManager = new javax.swing.JMenuItem();
        jMITradingOrderBook = new javax.swing.JMenuItem();
        jMenuSimulation = new javax.swing.JMenu();
        jMISimulation = new javax.swing.JMenuItem();
        jMIBacktest = new javax.swing.JMenuItem();
        jMenuStrategy = new javax.swing.JMenu();
        jMIStrategy = new javax.swing.JMenuItem();
        jMIStrategyBuilder = new javax.swing.JMenuItem();
        jMenuConfiguration = new javax.swing.JMenu();
        jMIConfiguration = new javax.swing.JMenuItem();
        jMIDBInitialization = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMIHelpHelp = new javax.swing.JMenuItem();
        jSeparatorHelp = new javax.swing.JPopupMenu.Separator();
        jMIHelpAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuFile.setText("File");
        jMenuFile.add(jSeparatorFile);

        jMIFileExit.setText("Exit");
        jMenuFile.add(jMIFileExit);

        jMenuBar.add(jMenuFile);

        jMenuEdit.setText("Edit");
        jMenuBar.add(jMenuEdit);

        jMenuModules.setText("Modules");

        jMenuAnalysis.setText("Analysis");

        jMIAnalysisChart.setText("Chart");
        jMenuAnalysis.add(jMIAnalysisChart);

        jMIAnalysisStatistics.setText("Statistics");
        jMenuAnalysis.add(jMIAnalysisStatistics);

        jMIAnalysisNeuralNetwork.setText("Neural Network");
        jMenuAnalysis.add(jMIAnalysisNeuralNetwork);

        jMenuModules.add(jMenuAnalysis);

        jMenuMasterData.setText("MasterData");

        jMenuMasterDataLocation.setText("Location");

        jMIMasterDataCountries.setText("Countries");
        jMenuMasterDataLocation.add(jMIMasterDataCountries);

        jMenuMasterData.add(jMenuMasterDataLocation);

        jMIMasterDataBrokers.setText("Brokers");
        jMenuMasterData.add(jMIMasterDataBrokers);

        jMenuMasterDataCompany.setText("Company");

        jMIMasterDataCompanies.setText("Companies");
        jMenuMasterDataCompany.add(jMIMasterDataCompanies);

        jMIMasterDataSectors.setText("Sectors");
        jMenuMasterDataCompany.add(jMIMasterDataSectors);

        jMIMasterDataSubsectors.setText("SubSectors");
        jMenuMasterDataCompany.add(jMIMasterDataSubsectors);

        jMIMasterDataSegments.setText("Segments");
        jMenuMasterDataCompany.add(jMIMasterDataSegments);

        jMenuMasterData.add(jMenuMasterDataCompany);

        jMenuMasterDataCurrency.setText("Currency");

        jMIMasterDataCurrency.setText("Currencies");
        jMenuMasterDataCurrency.add(jMIMasterDataCurrency);

        jMIMasterDataCurrencyQuotes.setText("Currency Quotes");
        jMenuMasterDataCurrency.add(jMIMasterDataCurrencyQuotes);

        jMenuMasterData.add(jMenuMasterDataCurrency);

        jMIMasterDataStockExchange.setText("StockExchanges");
        jMenuMasterData.add(jMIMasterDataStockExchange);

        jMenuModules.add(jMenuMasterData);

        jMenuFinancial.setText("Financial");

        jMIFinancialAccounts.setText("Accounts");
        jMIFinancialAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFinancialAccountsActionPerformed(evt);
            }
        });
        jMenuFinancial.add(jMIFinancialAccounts);

        jMIFinancialDeposits.setText("Deposit");
        jMenuFinancial.add(jMIFinancialDeposits);

        jMIFinancialJournalEntry.setText("JournalEntry");
        jMenuFinancial.add(jMIFinancialJournalEntry);

        jMIFinancialDistributionRule.setText("Distribution Rule");
        jMenuFinancial.add(jMIFinancialDistributionRule);

        jMIFinancialTax.setText("Tax");
        jMenuFinancial.add(jMIFinancialTax);

        jMenuModules.add(jMenuFinancial);

        jMenuTrading.setText("Trading");

        jMITradingOrdersManager.setText("Orders Manager");
        jMenuTrading.add(jMITradingOrdersManager);

        jMITradingTradeManager.setText("Trade Manager");
        jMenuTrading.add(jMITradingTradeManager);

        jMITradingOrderBook.setText("Order Book");
        jMenuTrading.add(jMITradingOrderBook);

        jMenuModules.add(jMenuTrading);

        jMenuSimulation.setText("Simulation");

        jMISimulation.setText("Simulation");
        jMenuSimulation.add(jMISimulation);

        jMIBacktest.setText("Backtest");
        jMenuSimulation.add(jMIBacktest);

        jMenuModules.add(jMenuSimulation);

        jMenuStrategy.setText("Strategy");

        jMIStrategy.setText("Strategies");
        jMenuStrategy.add(jMIStrategy);

        jMIStrategyBuilder.setText("Strategy Builder");
        jMenuStrategy.add(jMIStrategyBuilder);

        jMenuModules.add(jMenuStrategy);

        jMenuConfiguration.setText("Configuration");

        jMIConfiguration.setText("Configuration");
        jMenuConfiguration.add(jMIConfiguration);

        jMIDBInitialization.setText("DB Initialization");
        jMenuConfiguration.add(jMIDBInitialization);

        jMenuModules.add(jMenuConfiguration);

        jMenuBar.add(jMenuModules);

        jMenuHelp.setText("Help");

        jMIHelpHelp.setText("Help...");
        jMenuHelp.add(jMIHelpHelp);
        jMenuHelp.add(jSeparatorHelp);

        jMIHelpAbout.setText("About...");
        jMenuHelp.add(jMIHelpAbout);

        jMenuBar.add(jMenuHelp);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 378, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIFinancialAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFinancialAccountsActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jMIFinancialAccountsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	 */
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new Program().setVisible(true);
	    }
	});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenuItem jMIAnalysisChart;
    private javax.swing.JMenuItem jMIAnalysisNeuralNetwork;
    private javax.swing.JMenuItem jMIAnalysisStatistics;
    private javax.swing.JMenuItem jMIBacktest;
    private javax.swing.JMenuItem jMIConfiguration;
    private javax.swing.JMenuItem jMIDBInitialization;
    private javax.swing.JMenuItem jMIFileExit;
    private javax.swing.JMenuItem jMIFinancialAccounts;
    private javax.swing.JMenuItem jMIFinancialDeposits;
    private javax.swing.JMenuItem jMIFinancialDistributionRule;
    private javax.swing.JMenuItem jMIFinancialJournalEntry;
    private javax.swing.JMenuItem jMIFinancialTax;
    private javax.swing.JMenuItem jMIHelpAbout;
    private javax.swing.JMenuItem jMIHelpHelp;
    private javax.swing.JMenuItem jMIMasterDataBrokers;
    private javax.swing.JMenuItem jMIMasterDataCompanies;
    private javax.swing.JMenuItem jMIMasterDataCountries;
    private javax.swing.JMenuItem jMIMasterDataCurrency;
    private javax.swing.JMenuItem jMIMasterDataCurrencyQuotes;
    private javax.swing.JMenuItem jMIMasterDataSectors;
    private javax.swing.JMenuItem jMIMasterDataSegments;
    private javax.swing.JMenuItem jMIMasterDataStockExchange;
    private javax.swing.JMenuItem jMIMasterDataSubsectors;
    private javax.swing.JMenuItem jMISimulation;
    private javax.swing.JMenuItem jMIStrategy;
    private javax.swing.JMenuItem jMIStrategyBuilder;
    private javax.swing.JMenuItem jMITradingOrderBook;
    private javax.swing.JMenuItem jMITradingOrdersManager;
    private javax.swing.JMenuItem jMITradingTradeManager;
    private javax.swing.JMenu jMenuAnalysis;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuConfiguration;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuFinancial;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenu jMenuMasterData;
    private javax.swing.JMenu jMenuMasterDataCompany;
    private javax.swing.JMenu jMenuMasterDataCurrency;
    private javax.swing.JMenu jMenuMasterDataLocation;
    private javax.swing.JMenu jMenuModules;
    private javax.swing.JMenu jMenuSimulation;
    private javax.swing.JMenu jMenuStrategy;
    private javax.swing.JMenu jMenuTrading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparatorFile;
    private javax.swing.JPopupMenu.Separator jSeparatorHelp;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addListeners() {
	jMIAnalysisChart.addActionListener(new GerEvents(this));
	jMIAnalysisStatistics.addActionListener(new GerEvents(this));
	jMIAnalysisNeuralNetwork.addActionListener(new GerEvents(this));
        jMIBacktest.addActionListener(new GerEvents(this));
	jMIConfiguration.addActionListener(new GerEvents(this));
	jMIDBInitialization.addActionListener(new GerEvents(this));
	jMIFileExit.addActionListener(new GerEvents(this));
	jMIFinancialAccounts.addActionListener(new GerEvents(this));
	jMIFinancialDeposits.addActionListener(new GerEvents(this));
	jMIFinancialDistributionRule.addActionListener(new GerEvents(this));
	jMIFinancialJournalEntry.addActionListener(new GerEvents(this));
	jMIFinancialTax.addActionListener(new GerEvents(this));
	jMIHelpAbout.addActionListener(new GerEvents(this));
	jMIHelpHelp.addActionListener(new GerEvents(this));
	jMIMasterDataBrokers.addActionListener(new GerEvents(this));
	jMIMasterDataCompanies.addActionListener(new GerEvents(this));
	jMIMasterDataCountries.addActionListener(new GerEvents(this));
	jMIMasterDataCurrency.addActionListener(new GerEvents(this));
	jMIMasterDataCurrencyQuotes.addActionListener(new GerEvents(this));
	jMIMasterDataSectors.addActionListener(new GerEvents(this));
	jMIMasterDataSegments.addActionListener(new GerEvents(this));
	jMIMasterDataStockExchange.addActionListener(new GerEvents(this));
	jMIMasterDataSubsectors.addActionListener(new GerEvents(this));
	jMISimulation.addActionListener(new GerEvents(this));
	jMIStrategy.addActionListener(new GerEvents(this));
	jMIStrategyBuilder.addActionListener(new GerEvents(this));
	jMITradingOrdersManager.addActionListener(new GerEvents(this));
        jMITradingTradeManager.addActionListener(new GerEvents(this));
    }

    private class GerEvents implements ActionListener {

	private JFrame frame;

	public GerEvents(JFrame frame){
	    this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	    /*
	     * jMenuFile
	     * 
	     */
	     if (e.getSource() == jMIFileExit) {
		 frame.dispose();
	     }

	     /*
	      * jMenuEdit
	      * 
	      */


	     /*
	      * jMenuModules
	      * 
	      */
	     //Analysis
	     else if (e.getSource() == jMIAnalysisChart) {
		 FormsFactory.openForm(ObjectForms.CHART);
	     } else if (e.getSource() == jMIAnalysisStatistics) {
		 FormsFactory.openForm(ObjectForms.STATISTICS);
	     } else if (e.getSource() == jMIAnalysisNeuralNetwork) {
		 FormsFactory.openForm(ObjectForms.NEURAL_NETWORK);
	     } 

	     //MasterData
	     else if (e.getSource() == jMIMasterDataCountries) {
		 FormsFactory.openForm(ObjectForms.COUNTRY);
	     } else if (e.getSource() == jMIMasterDataBrokers) {
		 FormsFactory.openForm(ObjectForms.BROKER);
	     } else if (e.getSource() == jMIMasterDataCompanies) {
		 FormsFactory.openForm(ObjectForms.COMPANY);
	     } else if (e.getSource() == jMIMasterDataCurrency) {
		 FormsFactory.openForm(ObjectForms.CURRENCY);
	     } else if (e.getSource() == jMIMasterDataCurrencyQuotes) {
		 FormsFactory.openForm(ObjectForms.CURRENCY_QUOTES);
	     } else if (e.getSource() == jMIMasterDataSectors) {
		 FormsFactory.openForm(ObjectForms.SECTORS);
	     } else if (e.getSource() == jMIMasterDataSegments) {
		 FormsFactory.openForm(ObjectForms.SEGMENTS);
	     } else if (e.getSource() == jMIMasterDataStockExchange) {
		 FormsFactory.openForm(ObjectForms.STOCK_EXCHANGE);
	     } else if (e.getSource() == jMIMasterDataSubsectors) {
		 FormsFactory.openForm(ObjectForms.SUBSECTORS);
	     }

	     //Financial
	     else if (e.getSource() == jMIFinancialAccounts) {
		 FormsFactory.openForm(ObjectForms.ACCOUNT);
	     } else if (e.getSource() == jMIFinancialDeposits) {
		 FormsFactory.openForm(ObjectForms.DEPOSIT);
	     } else if (e.getSource() == jMIFinancialDistributionRule) {
		 FormsFactory.openForm(ObjectForms.DISTRIBUTION_RULE);
	     } else if (e.getSource() == jMIFinancialJournalEntry) {
		 FormsFactory.openForm(ObjectForms.JOURNAL_ENTRY);
	     } else if (e.getSource() == jMIFinancialTax) {
		 FormsFactory.openForm(ObjectForms.TAX);
	     }

	     //Trading
	     else if (e.getSource() == jMITradingOrdersManager) {
		 FormsFactory.openForm(ObjectForms.ORDER_MANAGEMENT);
	     } else if (e.getSource() == jMITradingTradeManager) {
		 FormsFactory.openForm(ObjectForms.TRADE_MANAGER);
	     } else if (e.getSource() == jMITradingOrderBook) {
		 FormsFactory.openForm(ObjectForms.BOOK);
	     }
             

	     //Simulation
	     else if(e.getSource() == jMISimulation) {
		 FormsFactory.openForm(ObjectForms.SIMULATION);
	     } else if(e.getSource() == jMIBacktest) {
		 FormsFactory.openForm(ObjectForms.BACKTEST);
	     }

	     //Strategy
	     else if(e.getSource() == jMIStrategy) {
		 FormsFactory.openForm(ObjectForms.STRATEGY);
	     }
	     else if(e.getSource() == jMIStrategyBuilder) {
		 FormsFactory.openForm(ObjectForms.STRATEGY_BUILDER);
	     }

	     //Configuration
	     else if (e.getSource() == jMIConfiguration) {
		 FormsFactory.openForm(ObjectForms.CONFIGURATION);
	     } 
	     else if (e.getSource() == jMIDBInitialization) {
		 FormsFactory.openForm(ObjectForms.DBINITIALIZATION);
	     } 

	     /*
	      * jMenuHelp
	      * 
	      */
	     else if (e.getSource() == jMIHelpAbout) {
		 FormsFactory.openForm(ObjectForms.ABOUT);
	     } 
	     else if (e.getSource() == jMIHelpHelp) {
		 FormsFactory.openForm(ObjectForms.HELP);
	     }
	     
	     
	}
    }
}

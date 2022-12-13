package LibraryManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibraryManagementSystem {
    private JFrame frame;
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu helpMenu;
    private JMenuItem openFileItem;
    private JMenuItem saveFileItem;
    private JMenuItem exitItem;
    private JMenuItem helpItem;

    public LibraryManagementSystem() {
        createGUI();
    }

    private void createGUI() {
        // Create Frame
        frame = new JFrame("Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        // Create Menu Bar
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        // Create Menus
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // Create Menu Items
        openFileItem = new JMenuItem("Open File");
        saveFileItem = new JMenuItem("Save File");
        exitItem = new JMenuItem("Exit");
        helpItem = new JMenuItem("Help");
        fileMenu.add(openFileItem);
        fileMenu.add(saveFileItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        helpMenu.add(helpItem);

        // Add Action Listeners
        openFileItem.addActionListener(new OpenFileListener());
        saveFileItem.addActionListener(new SaveFileListener());
        exitItem.addActionListener(new ExitListener());
        helpItem.addActionListener(new HelpListener());

        // Create Main Panel
        mainPanel = new JPanel();
        frame.add(mainPanel);

        // Create Title Label
        titleLabel = new JLabel("Library Management System");

        // Add Components to Main Panel
        mainPanel.add(titleLabel);

        // Show Frame
        frame.setVisible(true);
    }

    // Open File Listener
    class OpenFileListener extends Component implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Code for opening a file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

            int openFile = fileChooser.showOpenDialog(this);

            if(openFile == JFileChooser.APPROVE_OPTION)
            {
                File select = fileChooser.getSelectedFile();
                System.out.print("Selected file: " + select.getAbsolutePath());
            }
        }
    }

    // Save File Listener
    class SaveFileListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Code for saving a file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to save.");

            int selection = fileChooser.showSaveDialog(frame);
            if(selection != JFileChooser.CANCEL_OPTION)
            {
                File saveFile = fileChooser.getSelectedFile();
                System.out.println("Save file as: " + saveFile.getAbsolutePath());
            }
        }
    }
        }
    }

    // Exit Listener
    class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    // Help Listener
    class HelpListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Code for displaying help
        }
    }

    // Function for Reading and Writing to Files
    public static void readWriteToFile(String fileName) {
        // Code for reading and writing to a file
    }

    // Function for Recursion
    public static void recursion(String input) {
        // Code for recursion
    }

    // Function for Exception Handling
    public static void readfile() {
        try {
            // Code that may throw an exception
            Scanner read = new Scanner(new File("BookData.txt"));
            String title, author, genre, numOfCopies;
            read.useDelimiter(";");

            while(read.hasNext()){
                title = read.next();
                author = read.next();
                numOfCopies = read.next();
                genre = read.next();
                System.out.println(title + " " + author + " " + numOfCopies + " " + genre);
            }
            read.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Function for Switch Statements
    public static void switchStatement(int input) {
        switch (input) {
            case 1:
                // Code for case 1
                break;
            case 2:
                // Code for case 2
                break;
            default:
                // Code for default case
                break;
        }
    }

    public static void main(String[] args) {
        // Create the Library Management System
        LibraryManagementSystem lms = new LibraryManagementSystem();
        readfile();
    }


    // Partner's Piece of Code
    public static String processInput(String input) {
        // Code for processing the user input and returning the appropriate response

        return input;
    }
  }



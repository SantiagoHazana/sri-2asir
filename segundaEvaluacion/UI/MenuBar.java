package segundaEvaluacion.UI;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;

public class MenuBar extends JFrame {

    private JPanel panel1;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu toolsMenu;
    private JMenuItem changeBackgroundColorItem;
    private JMenuItem changeFontColorItem;
    private JMenuItem fileItemExit;
    private JMenuItem openItem;
    private JMenuItem saveItem;
    private JMenuItem saveAsItem;
    private JMenuItem fontItem;
    private JTextArea textArea;
    private JPanel bottomBarPanel;
    private JLabel sizeLabel;
    private JLabel linesLabel;
    private JLabel charCountLabel;

    private String pathToSaveFile;

    public MenuBar(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 600, 400);

        menuBar = new JMenuBar();
        menuBar.setVisible(true);

        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        toolsMenu = new JMenu("Tools");
        menuBar.add(toolsMenu);

        openItem = new JMenuItem("Open");
        openItem.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();

            FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Txt file", "txt");
            fileChooser.setFileFilter(fileFilter);

            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + System.getProperty("file.separator") + "Documents"));

            String aux = "";
            String text = "";

            try{
                fileChooser.showOpenDialog(this);


                File file = fileChooser.getSelectedFile();

                if (file != null){
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    while ((aux = bufferedReader.readLine())!=null){
                        text += aux + "\n";
                    }
                    textArea.setText(text);

                }
            } catch (IOException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        });
        fileMenu.add(openItem);

        saveItem = new JMenuItem("Save");
        saveItem.setEnabled(false);
        saveItem.addActionListener(e -> {
            try {

                File file = new File(pathToSaveFile);
                if (file != null){
                    FileWriter saveFile = new FileWriter(file);
                    saveFile.write(textArea.getText());
                    this.setTitle("Archivo guardado en: " + file);
                    saveFile.close();
                }

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        fileMenu.add(saveItem);

        saveAsItem = new JMenuItem("Save as");
        saveAsItem.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + System.getProperty("file.separator") + "Documents"));
            fileChooser.showSaveDialog(this);

            try {

                File file = fileChooser.getSelectedFile();
                if (file != null){
                    FileWriter saveFile = new FileWriter(file + ".txt");
                    saveFile.write(textArea.getText());
                    this.setTitle("Archivo creado en: " + file + ".txt");
                    pathToSaveFile = file + ".txt";
                    saveFile.close();
                    saveItem.setEnabled(true);
                }

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        });
        fileMenu.add(saveAsItem);

        fontItem = new JMenuItem("Change Font");
        fontItem.addActionListener(e -> {
//            JFontChooser jFontChooser = new JFontChooser();
//            jFontChooser.showDialog(this);
//
//            textArea.setFont(jFontChooser.getSelectedFont());

        });
        toolsMenu.add(fontItem);

        changeBackgroundColorItem = new JMenuItem("Background Color");
        changeBackgroundColorItem.addActionListener(e -> {
            Color c = JColorChooser.showDialog(this, "Choose a color for the background", Color.blue);
            textArea.setBackground(c);
        });
        toolsMenu.add(changeBackgroundColorItem);

        changeFontColorItem = new JMenuItem("Font Color");
        changeFontColorItem.addActionListener(e -> {
            Color c = JColorChooser.showDialog(this, "Choose a new color for the font", Color.black);
            textArea.setForeground(c);
        });
        toolsMenu.add(changeFontColorItem);

        fileMenu.addSeparator();
        fileItemExit = new JMenuItem("Exit");
        fileItemExit.addActionListener(e -> System.exit(0));
        fileMenu.add(fileItemExit);



        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        MenuBar frame = new MenuBar("Menu Bar");
        frame.setVisible(true);
    }

}

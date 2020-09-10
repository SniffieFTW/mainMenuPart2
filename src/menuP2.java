import GUI.TileCalculator;
import GUI.TrimCalculator;
import GUI.WallpaperCalculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuP2 implements ActionListener {


    public static JPanel panel;
    public static JFrame frame;
    public static JButton wallpaper;
    public static JButton tile;
    public static JButton trim;



    public static void main(String[] args) {

        panel = new JPanel();

        frame = new JFrame();
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(555,318);
        frame.add(panel);

        Border dash = BorderFactory.createLineBorder(Color.BLACK);

        //create the MainMenu title
        JLabel mainMenu = new JLabel("  MainMenu");
        mainMenu.setBounds(30, 10, 80, 25);
        mainMenu.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.black));
        mainMenu.setForeground(Color.black);
        panel.add(mainMenu);

        //creates the wallpaper button
        wallpaper = new JButton("Wallpaper");
        wallpaper.setBounds(20,40,100,25);
        wallpaper.addActionListener(new menuP2());
        panel.add(wallpaper);

        //creates the tile button
        tile = new JButton("Tile");
        tile.setBounds(20,70,100,25);
        tile.addActionListener(new menuP2());
        panel.add(tile);

        //creates the trim button
        trim = new JButton("Trim");
        trim.setBounds(20,100,100,25);
        trim.addActionListener(new menuP2());
        panel.add(trim);

        panel.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //makes the Trim button actually do something
        if (e.getSource() == wallpaper){
            WallpaperCalculator.Wallpaper();
        }
        if (e.getSource() == trim) {
            TrimCalculator.Trim();
        }
        if (e.getSource() == tile){
            TileCalculator.Tile();
        }
    }
}


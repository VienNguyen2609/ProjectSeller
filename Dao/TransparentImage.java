
package Dao;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TransparentImage {
    public static BufferedImage makeTransparent(BufferedImage img, float alpha) {
        int width = img.getWidth();
        int height = img.getHeight();
        BufferedImage transparentImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = transparentImage.createGraphics();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2d.drawImage(img, 0, 0, null);
        g2d.dispose();
        
        return transparentImage;
    }

    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("D:\\Image\\ProJect Product.jpeg"));
            BufferedImage transparentImage = makeTransparent(image, 0.1f); // 50% trong suốt
            
            JFrame frame = new JFrame("Transparent Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.add(new JLabel(new ImageIcon(transparentImage)));
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

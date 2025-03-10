package gigefxLogo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class gigefxLogo {
    public static void main(String[] args) {
        int width = 250;
        int height = 250;

        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Create a graphics which can be used to draw into the buffered image
        Graphics2D g2d = bufferedImage.createGraphics();
      
        // Fill all the image with white
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        // create color for oval
        // Create a circle with teal
        Color color1 = new Color (98,156,157);
        g2d.setColor(color1);
        g2d.fillOval(300, -100, 200, 100);

        // create color for oval
        // Set font and add text
        g2d.setFont(new Font("Open Sans", Font.BOLD, 20));
        Color color2 = new Color (255,255,255);
        g2d.setColor(color2);
        g2d.drawString("Rapid Forge Solutions", 40, 130);

        // Dispose graphics context
        g2d.dispose();

        // Save as PNG with a unique filename
        try {
            String fileName = "RapidForgeSolutions_" + System.currentTimeMillis() + ".png";
            File file = new File(fileName);
            ImageIO.write(bufferedImage, "png", file);
            System.out.println("Image saved as " + fileName);

            // Save as JPEG
            file = new File("RapidForgeSolutions_.jpg");
            ImageIO.write(bufferedImage, "jpg", file);
            System.out.println("Image saved as RapidForgeSolutions_.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package ProjectIntern;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class BackgroundRemovalApplication extends JFrame {
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;

    private JLabel imageLabel;
    private JButton openButton;
    private JButton removeBackgroundButton;
    private JButton saveButton;

    private File selectedFile;
    private Mat originalImage;
    private Mat processedImage;

    public BackgroundRemovalApplication() {
        super("Background Removal Application");

        // Initialize OpenCV
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Set up the GUI components
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLayout(new BorderLayout());

        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);

        openButton = new JButton("Open Image");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openImage();
            }
        });
        add(openButton, BorderLayout.NORTH);

        removeBackgroundButton = new JButton("Remove Background");
        removeBackgroundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeBackground();
            }
        });
        removeBackgroundButton.setEnabled(false);
        add(removeBackgroundButton, BorderLayout.SOUTH);

        saveButton = new JButton("Save Image");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveImage();
            }
        });
        saveButton.setEnabled(false);
        add(saveButton, BorderLayout.EAST);
    }

    private void openImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Image File");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "bmp"));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            originalImage = Imgcodecs.imread(selectedFile.getAbsolutePath());

            // Display the original image in the GUI
            displayImage(originalImage);
            removeBackgroundButton.setEnabled(true);
        }
    }

    private void removeBackground() {
        if (originalImage.empty()) {
            return;
        }

        Mat grayImage = new Mat();
        Imgproc.cvtColor(originalImage, grayImage, Imgproc.COLOR_BGR2GRAY);

        // Perform background removal using a threshold value
        double thresholdValue = 100; // Adjust this threshold value as needed
        Mat binaryImage = new Mat();
        Imgproc.threshold(grayImage, binaryImage, thresholdValue, 255, Imgproc.THRESH_BINARY_INV);

        // Create a mask by performing morphological operations
        Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_ELLIPSE, new Size(11, 11));
        Mat mask = new Mat();
        Imgproc.morphologyEx(binaryImage, mask, Imgproc.MORPH_OPEN, kernel);

        // Apply the mask to the original image to remove the background
        processedImage = new Mat();
        originalImage.copyTo(processedImage, mask);

        // Display the processed image in the GUI
        displayImage(processedImage);
        saveButton.setEnabled(true);
    }

    private void saveImage() {
        if (processedImage.empty()) {
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Processed Image");
        fileChooser.setFileFilter(new FileNameExtensionFilter("PNG Images", "png"));

        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File outputFile = fileChooser.getSelectedFile();

            // Save the processed image to the selected file
            Imgcodecs.imwrite(outputFile.getAbsolutePath(), processedImage);
            JOptionPane.showMessageDialog(this, "Image saved successfully!");
        }
    }

    private void displayImage(Mat image) {
        // Convert the OpenCV Mat object to an AWT BufferedImage for display
        MatOfByte byteMat = new MatOfByte();
        Imgcodecs.imencode(".jpg", image, byteMat);
        byte[] imageData = byteMat.toArray();
        ImageIcon imageIcon = new ImageIcon(imageData);
        Image scaledImage = imageIcon.getImage().getScaledInstance(FRAME_WIDTH, FRAME_HEIGHT, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(scaledImage));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BackgroundRemovalApplication application = new BackgroundRemovalApplication();
                application.setVisible(true);
            }
        });
    }
}

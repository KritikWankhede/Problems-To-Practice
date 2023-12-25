package ProjectGui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BrainTumorDetectionGui extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final int WINDOW_WIDTH = 1020;
    private static final int WINDOW_HEIGHT = 1080;
    private static final String MODEL_PATH = "brain_tumor_classification_model.h5";

    private JLabel lblInputImage, lblPreprocessedImage, lblSegmentedImage, lblClassificationResult;
    private JButton btnUpload, btnPreprocess, btnSegment, btnClassify, btnClearAll, btnExit;
    private JPanel inputImagePanel, preprocessedImagePanel, segmentedImagePanel;

    private BufferedImage inputImage;
    private BufferedImage preprocessedImage;
    private BufferedImage segmentedImage;

    public BrainTumorDetectionGui() {
        setTitle("Brain Tumor Detection");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblInputImage = new JLabel();
        lblInputImage.setBounds(20, 20, 240, 240);
        getContentPane().add(lblInputImage);

        lblPreprocessedImage = new JLabel();
        lblPreprocessedImage.setBounds(280, 20, 240, 240);
        getContentPane().add(lblPreprocessedImage);

        lblSegmentedImage = new JLabel();
        lblSegmentedImage.setBounds(540, 20, 240, 240);
        getContentPane().add(lblSegmentedImage);

        lblClassificationResult = new JLabel();
        lblClassificationResult.setBounds(280, 280, 500, 30);
        getContentPane().add(lblClassificationResult);

        btnUpload = new JButton("Upload");
        btnUpload.setBounds(20, 280, 100, 30);
        getContentPane().add(btnUpload);

        btnPreprocess = new JButton("Preprocess");
        btnPreprocess.setBounds(140, 280, 100, 30);
        getContentPane().add(btnPreprocess);

        btnSegment = new JButton("Segment");
        btnSegment.setBounds(20, 320, 100, 30);
        getContentPane().add(btnSegment);

        btnClassify = new JButton("Classify");
        btnClassify.setBounds(140, 320, 100, 30);
        getContentPane().add(btnClassify);

        btnClearAll = new JButton("Clear All");
        btnClearAll.setBounds(20, 360, 100, 30);
        getContentPane().add(btnClearAll);

        btnExit = new JButton("Exit");
        btnExit.setBounds(140, 360, 100, 30);
        getContentPane().add(btnExit);

        inputImagePanel = createImagePanel(20, 20, 240, 240);
        preprocessedImagePanel = createImagePanel(280, 20, 240, 240);
        segmentedImagePanel = createImagePanel(540, 20, 240, 240);

        btnUpload.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(BrainTumorDetectionGui.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    displayImage(selectedFile, lblInputImage);
                }
            }
        });

        btnPreprocess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inputImage != null) {
                    preprocessedImage = preprocessImage(inputImage);
                    displayBufferedImage(preprocessedImage, lblPreprocessedImage);
                }
            }
        });

        btnSegment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (preprocessedImage != null) {
                    segmentedImage = segmentImage(preprocessedImage);
                    displayBufferedImage(segmentedImage, lblSegmentedImage);
                }
            }
        });

        btnClassify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (segmentedImage != null) {
                    String classificationResult = classifyImage(segmentedImage);
                    lblClassificationResult.setText("Classification Result: " + classificationResult);
                }
            }
        });

        btnClearAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputImage = null;
                preprocessedImage = null;
                segmentedImage = null;
                lblInputImage.setIcon(null);
                lblPreprocessedImage.setIcon(null);
                lblSegmentedImage.setIcon(null);
                lblClassificationResult.setText("");
            }
        });

        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private JPanel createImagePanel(int x, int y, int width, int height) {
        JPanel panel = new JPanel();
        panel.setBounds(x, y, width, height);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        panel.setBorder(border);
        getContentPane().add(panel);
        return panel;
    }

    private void displayImage(File file, JLabel label) {
        try {
            inputImage = ImageIO.read(file);
            label.setIcon(new ImageIcon(inputImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayBufferedImage(BufferedImage image, JLabel label) {
        label.setIcon(new ImageIcon(image));
    }

    private BufferedImage preprocessImage(BufferedImage image) {
        // Add your preprocessing logic here
        // Example: Convert to grayscale, resize, denoise, etc.
        return image;
    }

    private BufferedImage segmentImage(BufferedImage image) {
        // Add your image segmentation logic here
        // Example: Apply thresholding, edge detection, etc.
        return image;
    }

    private String classifyImage(BufferedImage image) {
        // Add your image classification logic here
        // Example: Load the pre-trained model and make predictions
        return "Tumor Detected";
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrainTumorDetectionGui();
            }
        });
    }
}


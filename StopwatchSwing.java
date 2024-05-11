        
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopwatchSwing implements ActionListener
 {
    private JFrame frame;
    private JButton startButton;
    private JButton stopButton;
    private JButton resetButton;
    private JLabel elapsedTimeLabel;
    private long startTime;
    private long elapsedTime;
    private boolean running;
    private Timer timer;

    public StopwatchSwing() {

        // Initialize the stopwatch components
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");
        elapsedTimeLabel = new JLabel("0.000 seconds", SwingConstants.CENTER);
        elapsedTimeLabel.setFont(new Font("SansSerif", Font.BOLD, 32));

        // Set the layout and size of the stopwatch window
        frame = new JFrame("Stopwatch");
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);


        
        buttonPanel.add(resetButton);

        // Add the buttons and elapsed time label to the stopwatch window
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(elapsedTimeLabel, BorderLayout.CENTER);

        // Add action listeners to the buttons
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Initialize the stopwatch variables
        startTime = 0;
        elapsedTime = 0;
        running = false;

        // Initialize the timer
        timer = new Timer(100, this);
        timer.setInitialDelay(0);

        // Pack and display the stopwatch window
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == startButton)
         {
            startTime = System.currentTimeMillis();
            running = true;
            timer.start();
        }
         else if (e.getSource() == stopButton)
        {
            elapsedTime += System.currentTimeMillis() - startTime;
            running = false;
            timer.stop();
        } 
        else if (e.getSource() == resetButton)
         {
            elapsedTime = 0;
            elapsedTimeLabel.setText("0.000 seconds");
            timer.stop();
        }
         else if (running)
         {
            long currentTime = System.currentTimeMillis();
            long elapsed = currentTime - startTime;
            elapsedTime += elapsed;
            startTime = currentTime;
            String elapsedTimeString = String.format("%.3f seconds", elapsedTime / 1000.0);
            elapsedTimeLabel.setText(elapsedTimeString);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StopwatchSwing::new);
    }
}


        
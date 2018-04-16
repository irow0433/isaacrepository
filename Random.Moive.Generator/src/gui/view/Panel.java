package gui.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import movie.random.*;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import javax.swing.SpringLayout;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.text.DefaultCaret;
import javax.swing.SpringLayout;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;


public class Panel extends JPanel {
private static final Movie Description = null;
//	private JButton btnNewButton;
//	private SpringLayout baseLayout;
	Movies movies = new Movies();
	Games games = new Games();
	Movie selectedMovie = Description;
	

	
	public Panel() {
		
		super();
		
		SpringLayout springLayout = new SpringLayout();
		
		JButton btnNewButton = new JButton("Movie");
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -68, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, this);
		setLayout(springLayout);
		add(btnNewButton);
		
		JLabel lblTitle = new JLabel("Title:");
		springLayout.putConstraint(SpringLayout.NORTH, lblTitle, 66, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblTitle, 10, SpringLayout.WEST, this);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTitle);
		
		JLabel lblGenre = new JLabel("Genre:");
		springLayout.putConstraint(SpringLayout.NORTH, lblGenre, 6, SpringLayout.SOUTH, lblTitle);
		springLayout.putConstraint(SpringLayout.WEST, lblGenre, 0, SpringLayout.WEST, lblTitle);
		lblGenre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblGenre);
		
		JLabel lblLength = new JLabel("Length:");
		springLayout.putConstraint(SpringLayout.NORTH, lblLength, 3, SpringLayout.SOUTH, lblGenre);
		springLayout.putConstraint(SpringLayout.WEST, lblLength, 0, SpringLayout.WEST, lblTitle);
		lblLength.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblLength);
		
		JLabel lblRating = new JLabel("Rating:");
		springLayout.putConstraint(SpringLayout.NORTH, lblRating, 6, SpringLayout.SOUTH, lblLength);
		springLayout.putConstraint(SpringLayout.WEST, lblRating, 0, SpringLayout.WEST, lblTitle);
		lblRating.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblRating);
		
		JLabel lblRatingText = new JLabel("");
		lblRatingText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		springLayout.putConstraint(SpringLayout.WEST, lblRatingText, 0, SpringLayout.EAST, lblRating);
		springLayout.putConstraint(SpringLayout.SOUTH, lblRatingText, 0, SpringLayout.SOUTH, lblRating);
		add(lblRatingText);
		
		JLabel lblGenreText = new JLabel("");
		lblGenreText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		springLayout.putConstraint(SpringLayout.WEST, lblGenreText, 6, SpringLayout.EAST, lblGenre);
		springLayout.putConstraint(SpringLayout.SOUTH, lblGenreText, 0, SpringLayout.SOUTH, lblGenre);
		add(lblGenreText);
		
		JLabel lblTitleText = new JLabel("");
		lblTitleText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		springLayout.putConstraint(SpringLayout.WEST, lblTitleText, 9, SpringLayout.EAST, lblTitle);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTitleText, 0, SpringLayout.SOUTH, lblTitle);
		add(lblTitleText);
		
		
		JLabel lblLengthText = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 272, SpringLayout.EAST, lblLengthText);
		lblLengthText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		springLayout.putConstraint(SpringLayout.WEST, lblLengthText, 6, SpringLayout.EAST, lblLength);
		springLayout.putConstraint(SpringLayout.SOUTH, lblLengthText, 0, SpringLayout.SOUTH, lblLength);
		add(lblLengthText);
		
		JLabel lblLogo = new JLabel("Random Entertainment");
		lblLogo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		springLayout.putConstraint(SpringLayout.NORTH, lblLogo, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblLogo, 61, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblLogo, -50, SpringLayout.EAST, this);
		add(lblLogo);
	
		
		JLabel lblPicture = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblPicture, 187, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblPicture, -26, SpringLayout.SOUTH, this);
		lblPicture.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame frame = new JFrame("Description");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try 
                {
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                   e.printStackTrace();
                }
                JPanel panel = new JPanel();
                panel.setLayout((LayoutManager) new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.setOpaque(true);
                JTextArea textArea = new JTextArea(15, 50);
                textArea.setText(selectedMovie.getDescription());
                textArea.setWrapStyleWord(true);
                textArea.setEditable(false);
                textArea.setFont(Font.getFont(Font.SANS_SERIF));
                //textArea.setCaretPosition(textArea.getDocument().getLength());
                JScrollPane scroller = new JScrollPane(textArea);
                scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                JTextField input = new JTextField(500);
                DefaultCaret caret = (DefaultCaret) textArea.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                panel.add(scroller);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.pack();
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
                frame.setResizable(false);
                frame.setSize(500, 400);
                input.requestFocus();
                frame.getContentPane().add(lblTitleText, BorderLayout.BEFORE_FIRST_LINE);
                textArea.setBackground(Color.WHITE);

                
                
                
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, lblPicture, 10, SpringLayout.WEST, this);
		//springLayout.putConstraint(SpringLayout.EAST, lblPicture, -6, SpringLayout.WEST);
		add(lblPicture);
		
//		btnClear.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent arg0) {
//				lblTitleText.setText(" ");
//				lblGenreText.setText(" ");
//				lblLengthText.setText(" ");
//				lblRatingText.setText(" ");
//				
//			}
		
		

			
//		public void lLogo (JLabel lblLogo1, String Image) {
//			BufferedImage myPicture = null;
//			try {
//				myPicture = ImageIO.read(this.getClass().getResource(image));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			lblPicture.setIcon(new ImageIcon(myPicture));
//		}
			
		
		
		

		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Random rnd = new Random();
				int randomNumber = rnd.nextInt(14);
				//int randomNumber = 0;
				Movie randomMovie = movies.allMovies[randomNumber]; 
				lblTitleText.setText(randomMovie.getTitle());
				lblGenreText.setText(randomMovie.getCategorie());
				lblLengthText.setText(Integer.toString(randomMovie.getRunningTime()));
				lblRatingText.setText(randomMovie.getRating());
				showPicture(lblPicture, randomMovie.getImage());
				selectedMovie = randomMovie;
				//paintComponent(null);
			}
		});
		
		JButton btnNewButton2 = new JButton("Game");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton2, 278, SpringLayout.EAST, lblLength);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton2, -10, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 12, SpringLayout.SOUTH, btnNewButton2);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton2, 14, SpringLayout.SOUTH, lblLogo);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton2, -167, SpringLayout.SOUTH, this);
		add(btnNewButton2);


		

		

		

		

		

		

		
	
		
		btnNewButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Random rnd = new Random();
				int randomNumber = rnd.nextInt(13);
				
				Game randomGame = games.allGames[randomNumber];
				lblTitleText.setText(randomGame.getGame());
				lblRatingText.setText(randomGame.getRating());
				showPicture(lblPicture, randomGame.getImage());
				
			}
		});
		
		
				
	
	}
	
	public void showPicture(JLabel lblPicture, String image) {
//		JFrame frame = new JFrame();
//		ImageIcon icon = new ImageIcon(image);
//		JLabel label = new JLabel(icon);
//		frame.getContentPane().add(label);
//		frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
//		frame.pack();
//		frame.setVisible(true);
		
		
		
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(this.getClass().getResource(image));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblPicture.setIcon(new ImageIcon(myPicture));
	}
	
//	public void showLogo(JLabel lblLogo) {
//		BufferedImage myPicture = null;
//		try {
//			myPicture = ImageIO.read(this.getClass().getResource("/pubg.png"));
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		lblLogo.setIcon(new ImageIcon(myPicture));
//	}
}


//Movie movie1 = new Movie();
//movie1.setTitle("josh");
//movie1.setDescription("is great"); 
//movie1.setRunningTime(120);
//movies[0] = movie1;




//Random rnd2 = new Random();
//landingZone[] zone = new landingZone[6];
//zone[0] = new landingZone("Pachinki", "Medium/Large", "Queit a few", " Large");
//zone[1] = new landingZone("Military Base", "Medium/Large", "a lot", " large");
//zone[2] = new landingZone("School", "Medium/Large", "a lot", "Large");
//zone[3] = new landingZone("Hospital", "Medium", "not to many", "Medium");
//zone[4] = new landingZone("Georgopop", "Large", "a lot", " large");
//zone[5] = new landingZone("Prison", "large", "a lot", "small/medium");
////zone[1] = new landingZone("");
//int randomNumber2 = rnd2.nextInt(6);
//landingZone randomZone = zone[randomNumber2];
//System.out.println("Generated landing Zone is: " + randomZone.getZone() + " " + randomZone.getlootAmount()
//+ " " + randomZone.getPopularity() + " " + randomZone.getSize());
 
//Random rnd3 = new Random();
//TvShows[] show = new TvShows[12];
//show[0] = new TvShows("Lost", "Action/Mystery", 9, 243);
//show[1] = new TvShows("Dexter", "Genre", 6, 46);
//show[2] = new TvShows("Game of Thrones", "Action/Drama" , 7 , 67 );
//show[3] = new TvShows("Dexter", "Actions/Mystery", 8 , 96 );
//show[4] = new TvShows("The Wire", "Crime/Drama", 6 , 13 );
//show[5] = new TvShows("Breaking Bad", "Crime/Thriller", 5 , 62 );
//show[6] = new TvShows("The Walking Dead", "Drama/Horror/Thriller", 9 , 113 );
//show[7] = new TvShows("Boardwalk Empire", "Crime/Drama", 5 , 56);
//show[8] = new TvShows("Spartacus: War of the Damned", "Action/Adventrue", 3 , 39  );
//show[9] = new TvShows("The Simpsons", "Animation/Comedy", 30, 632 );
//show[10] = new TvShows("Family Guy", "Animation/Comedy", 16, 303 );
//show[11] = new TvShows("How I Met Your Mother", "Comedy/Romance", 9, 208 );
//int randomNumber3 = rnd3.nextInt(12);
//TvShows randomShow = show[randomNumber3];
//System.out.println("Generated T.v. Show is: " + randomShow.getName() + "." + " " + "Total episodes:" + " " + randomShow.getEpisodes() + "." + " " + randomShow.getGenre() +
//		" " + randomShow.getSeasons());









//Random rnd = new Random();
//String[]landingZone = new String[10];
//landingZone [0] = "Pachinki";
//landingZone[1] = "jack;";
//landingZone[2] = "landing zone 2";
//landingZone[3] = "landing zone 3";
//landingZone[4] = "landing zone 4";
////int randomNumber1 = rnd.nextInt(5);
////String randomZone1 = landingZone[randomNumber1];
////System.out.println("Generated Zone is: " + randomZone1) ;
//
//for (int i = 0; i < 3; i++) {
//	int randomNumber = rnd.nextInt(5);
//	String randomZone = landingZone[randomNumber];
//	System.out.println("Generated Zone is: " + randomZone);
//	
//}








//int n1 = rnd.nextInt(10);
//System.out.println("Generated area is: " + n1);
//
//int n2 = rnd.nextInt(50);
//System.out.println("Generated Movie is: " + n2);
//
//int n3 = rnd.nextInt(15);
//System.out.println("Generated T.V. show is: " + n3);

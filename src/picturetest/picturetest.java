package picturetest;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class picturetest extends JFrame{
    /**
	 * 
	 */
	String FilePath = "C:\\users\\stevencheng\\workspace\\picturetest\\src\\img\\";
	private static final long serialVersionUID = 1L;
	private String [][] imgbox = new String[][]{{ FilePath + "0.jpg", FilePath + "1.jpg", FilePath + "2.jpg"},
                    {FilePath +  "3.jpg",FilePath + "4.jpg",FilePath + "5.jpg"},
                    {FilePath +  "6.jpg",FilePath +  "7.jpg",FilePath +  "8.jpg"}};
   private ImageIcon [] imgUP = new ImageIcon[9];
    private JLabel jl[] = new JLabel[9];
    private Container c;
 
    public picturetest (){
       super("Use Button to switch");
         c = this.getContentPane();
       setSize(800,600);
    
         this.setResizable(false);//set resize button disable
         
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new GridLayout(3,3));
 
          for(int i =0 ; i < imgbox.length ; i++ ){
           imgUP[i] = new ImageIcon(getClass().getResource(imgbox[i / imgbox.length][i % imgbox.length]));
           jl[i] = new JLabel(imgUP[i]);
             c.add(jl[i]);
         } 
         setVisible(true);
    }
   
  public static void main(String[] args) {
    // TODO Auto-generated method stub
      new picturetest();
  }
}

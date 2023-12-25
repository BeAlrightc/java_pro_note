import javax.swing.JOptionPane;

public class NoneHumanException extends Exception {
	String message;
      public NoneHumanException(String messache) {
    	  super(messache);
    	  this.message =message;
      }
      		
  @Override
  public void printStackTrace() {
	  super.printStackTrace();
	  JOptionPane.showConfirmDialog(null, message,"发生异常",JOptionPane.ERROR_MESSAGE);
  }
	
}

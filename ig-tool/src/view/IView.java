package view;

import java.io.IOException;

/**
 * 
 */

/**
 * @author wxc
 *
 */
public interface IView {
	
	  /**
	   * Render a specific message to the provided data destination.
	   *
	   * @param msg the message to be transmitted
	   * @throws IOException if transmission of the board to the provided data destination fails
	   */
	  void renderMessage(String msg) throws IOException;

	  /**
	   * Sets the controller coupled to this view.
	   *
	   * @param controller the controller
	   * @throws IllegalArgumentException if the controller is null
	   */
	  void setController(controller.IController controller) throws IllegalArgumentException;
}

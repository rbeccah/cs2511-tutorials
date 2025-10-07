package unsw.training;

import java.util.List;

/**
 * An online seminar is a video that can be viewed at any time by employees. A
 * record is kept of which employees have watched the seminar.
 * @author Robert Clifton-Everest
 *
 */

 /*
  * Seminar is defined as having a certain time that it takes place 
  * A client interacting with a Seminar would expect it to behave the same as OnlineSeminar

  * This class violates LSP
  */
public class OnlineSeminar {
    private String videoURL;

    private List<String> watched;
}

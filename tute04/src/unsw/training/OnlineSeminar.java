package unsw.training;

import java.util.List;

/**
 * An online seminar is a video that can be viewed at any time by employees. A
 * record is kept of which employees have watched the seminar.
 * @author Robert Clifton-Everest
 *
 */
/*
 * Seminar has inherently the idea of taking place in time
 * A client that is interacting with Seminar would also expect OnlineSeminar to be able to be booked and take place in time
 * 
 * Invalid inheritance relationship
 * Violates LSP, because the OnlineSeminar cannot be booked like a regular Seminar class
 */
public class OnlineSeminar {
    private String videoURL;

    private List<String> watched;
}

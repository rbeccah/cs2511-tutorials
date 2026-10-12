package computer;

import java.util.ArrayList;
import java.util.List;

import computer.peripherals.Keyboard;
import computer.peripherals.Mouse;

// ? Who are the Observers?

// ? Who are the Subjects? 

class Computer {
    private List<Peripheral> peripherals;
    private List<Program> programs;

    public Computer() {
        this.peripherals = new ArrayList<Peripheral>();
        this.programs = new ArrayList<Program>();
    }

    public void startProgram(Program program) {
        this.programs.add(program);

        // TODO: implement observer!
    }

    public void plugInPeripheral(Peripheral peripheral) {
        this.peripherals.add(peripheral);

        // TODO: implement observer!
    }

    public void unplugPeripheral(Peripheral peripheral) {
        this.peripherals.remove(peripheral);

        // TODO: implement observer!
    }

    public static void main(String[] args) {
        // Create the computer
        Computer computer = new Computer();

        // Create the peripherals
        Keyboard mechanicalKeyboard = new Keyboard("Mechanical Keyboard");
        Mouse wirelessMouse = new Mouse("Wireless Mouse");
        Keyboard rgbKeyboard = new Keyboard("RGB Keyboard");

        // Start the programs
        DeviceLog deviceLog = new DeviceLog();
        computer.startProgram(deviceLog);
        WordProcessor msWord = new WordProcessor();
        computer.startProgram(msWord);

        // Start plugging in and using the peripherals!
        computer.plugInPeripheral(mechanicalKeyboard);
        computer.plugInPeripheral(wirelessMouse);

        mechanicalKeyboard.type("Hello, World!");
        wirelessMouse.leftClick();

        WordProcessor libreOffice = new WordProcessor();
        computer.startProgram(libreOffice);

        computer.unplugPeripheral(mechanicalKeyboard);
        computer.plugInPeripheral(rgbKeyboard);

        rgbKeyboard.type("COMP2511 is fun!");
        wirelessMouse.rightCLick();
    }
}
package larpofwar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class LarpOfWarCli {
    public static void main(String[] args) throws IOException{
        String colour = "";
        String defaultColour = "\u001B[39m";

        //colouring with flags
        for (String arg : args) {
            switch (arg) {
                case "-r":
                    colour = "\u001B[31m";
                    break;
                case "-b":
                    colour = "\u001B[34m";
                    break;
                case "-g":
                    colour = "\u001B[32m";
                    break;
                case "-y":
                    colour = "\u001B[33m";
                    break;
                case "-h":
                case "--help":
                    System.out.println("  -r  red");
                    System.out.println("  -b  blue");
                    System.out.println("  -g  green");
                    System.out.println("  -y  yellow");
                    return;
                default:
                    System.out.println("unknown argument: " + arg);
                    System.out.println("  -r  red");
                    System.out.println("  -b  blue");
                    System.out.println("  -g  green");
                    System.out.println("  -y  yellow");
                    return;
            }

        }

        List<String> quotes = new ArrayList<>();

        //file
        try (InputStream input = LarpOfWarCli.class.getResourceAsStream("/ArtOfWar.txt")) {
            if (input == null) {
                throw new IOException("resource \"ArtOfWar.txt\" not found");
            }

            //file reading
            try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
                String line;
                StringBuilder current = new StringBuilder();

                while ((line = br.readLine()) != null) {
                    if (line.trim().equals("%")) {
                        String quote = current.toString().trim();
                        if (!quote.isEmpty()) {
                            quotes.add(quote);
                        }
                        current.setLength(0);
                    } else {
                      if (!current.isEmpty()) {
                          current.append(System.lineSeparator());
                      }
                      current.append(line);
                    }
                }

            }
        }

        int rand = (int) (Math.random() * quotes.size());
        String quote = quotes.get(rand);

        if (colour.isEmpty()) {
            System.out.println();
            System.out.println(quote);
            System.out.println();
        } else {
            System.out.println();
            System.out.println(colour + quote + defaultColour);
            System.out.println();
        }

    }
}

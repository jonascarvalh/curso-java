package application;

import model.entities.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String inputPath = "c:\\temp\\input";
        String inputFile = inputPath + "\\summary.csv";

        String outputPath = inputPath + "\\output\\";
        String outputFile = outputPath + "\\output.csv";

        ArrayList<Product> products = new ArrayList<Product>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line = br.readLine();

            while (line != null) {
                String[] productInfo = line.split(",");
                products.add(new Product(productInfo[0], Double.parseDouble(productInfo[1]), Integer.parseInt(productInfo[2])));

                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        if (!new File(outputFile).exists()) {
            boolean success = new File(outputPath).mkdir();
            System.out.println("Directory created with success: " + success);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 0; i < products.toArray().length ; i++) {
                bw.write(products.get(i).getName()
                        + "," + products.get(i).getPrice()
                        + "," + products.get(i).calculateSummary());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
/*Uma empresa de consultoria deseja avaliar a desempenho de produtos,
funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
o maior dentre um conjunto de elementos. Fazer um programa que leia um
conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
mostre o mais caro deles.*/

import entities.Product;
import service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args)  {

        // Lista para armazenar os produtos lidos do arquivo
        List<Product> list = new ArrayList<>();

        // Caminho do arquivo que será lido
        String path = "F:\\text2.txt";

        // Tentativa de ler o arquivo usando BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Lê a primeira linha do arquivo
            String line = br.readLine();

            // Continua lendo até que todas as linhas sejam processadas
            while (line != null) {
                // Divide a linha por vírgula para separar o nome e o preço
                String[] fields = line.split(",");

                // Adiciona um novo produto à lista, convertendo o preço para Double
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));

                // Lê a próxima linha
                line = br.readLine();
            }

            // Usa o CalculationService para encontrar o produto com o maior preço
            Product x = CalculationService.max(list);

            // Exibe o produto com o maior preço
            System.out.println("Max:");
            System.out.println(x);

        } catch (IOException e) {
            // Trata erros de I/O, como problemas ao abrir ou ler o arquivo
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gdn
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String word, String translation) {
        // adds a word to the dictionary. 
        // Every word has just one translation, and if the same word is added for the second time, nothing happens.
        if (this.dictionary.keySet().contains(word)) {
            return;
        }

        this.dictionary.put(word, translation);
        this.save();
    }

    public String translate(String word) {
        //returns the translation for the given word. 
        // If the word is not in the dictionary, returns null.

        String translation = this.dictionary.getOrDefault(word, null);

        if (translation == null) {
            for (String s : this.dictionary.keySet()) {
                if (this.dictionary.get(s).equals(word)) {
                    translation = s;
                }
            }
        }

        return translation;
    }

    public void delete(String word) {
        String deleted = this.dictionary.remove(word);

        if (deleted == null) {
            for (String s : this.dictionary.keySet()) {
                if (this.dictionary.get(s).equals(word)) {
                    this.dictionary.remove(s);
                    break;
                }
            }
        }
    }

    public boolean load() {
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                System.out.println(parts[0] + " ," + parts[1]);

                this.add(parts[0], parts[1]);
            }

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);

            for (String key : this.dictionary.keySet()) {
                writer.print(key);
                writer.print(":");
                writer.println(this.dictionary.get(key));
            }

            writer.close();

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return this.dictionary.toString();
    }
}

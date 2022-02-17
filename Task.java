import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.io.FileReader;

public class Task {
    // create 8 arraylists to store the expected values for each keys (example-TIE
    // for neckline, it will be stored in listneckline)
    static ArrayList<String> listdesign = new ArrayList<String>();
    static ArrayList<String> listlength = new ArrayList<String>();
    static ArrayList<String> listmaterial = new ArrayList<String>();
    static ArrayList<String> listneckline = new ArrayList<String>();
    static ArrayList<String> listoccassion = new ArrayList<String>();
    static ArrayList<String> listshape = new ArrayList<String>();
    static ArrayList<String> listsleeve = new ArrayList<String>();
    static ArrayList<String> listweather = new ArrayList<String>();

    public static void main(String[] args) {

        String line = "";
        String splitBy = ","; // to split the array of string we get from the csv file
        try {
            BufferedReader br = new BufferedReader(new FileReader("pair.csv"));
            while ((line = br.readLine()) != null) { // read until the end of the file
                String[] employee = line.split(splitBy);

                if (employee[0].toString().equals("DESIGN")) {// if the element of the array is DESIGN, then store the
                                                              // element in the listdesign

                    listdesign.add(employee[1].toLowerCase());
                } else if (employee[0].toString().equals("LENGTH")) {// if the element of the array is LENGTH, then
                                                                     // store the element in the listlength

                    listlength.add(employee[1].toLowerCase());
                } else if (employee[0].toString().equals("MATERIAL")) {

                    listmaterial.add(employee[1].toLowerCase());
                } else if (employee[0].toString().equals("NECKLINE")) {

                    listneckline.add(employee[1].toLowerCase());
                } else if (employee[0].toString().equals("OCCASION")) {

                    listoccassion.add(employee[1].toLowerCase());
                } else if (employee[0].toString().equals("SHAPE")) {

                    listshape.add(employee[1].toLowerCase());
                } else if (employee[0].toString().equals("SLEEVE")) {

                    listsleeve.add(employee[1].toLowerCase());
                } else if (employee[0].toString().equals("WEATHER")) {

                    listweather.add(employee[1].toLowerCase());
                }
            }
        } catch (IOException e) {// catch any io exception
            e.printStackTrace();
        }
        // hashmap for mainting the count of each key
        HashMap<String, Integer> design = new HashMap<>();
        HashMap<String, Integer> length = new HashMap<>();
        HashMap<String, Integer> material = new HashMap<>();
        HashMap<String, Integer> neckline = new HashMap<>();
        HashMap<String, Integer> occasion = new HashMap<>();
        HashMap<String, Integer> shape = new HashMap<>();
        HashMap<String, Integer> sleeve = new HashMap<>();
        HashMap<String, Integer> weather = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("product2.csv"));// reading from the file product2.csv
            int key = 6;

            while ((line = br.readLine()) != null) {

                ArrayList<String> smalllistdesign = new ArrayList<String>();
                ArrayList<String> smalllistlength = new ArrayList<String>();
                ArrayList<String> smalllistmaterial = new ArrayList<String>();
                ArrayList<String> smalllistneckline = new ArrayList<String>();
                ArrayList<String> smalllistoccassion = new ArrayList<String>();
                ArrayList<String> smalllistshape = new ArrayList<String>();
                ArrayList<String> smalllistsleeve = new ArrayList<String>();
                ArrayList<String> smalllistweather = new ArrayList<String>();

                String[] employee = line.split(" ");

                for (int i = 0; i < employee.length; i++) {

                    if (listdesign.contains(employee[i])) {// checking if the element of the array is in the listdesign

                        smalllistdesign.add(employee[i]);
                        if (design.containsKey(employee[i])) { // if the key is already present in the hashmap, then
                                                               // increment the count else add the key and set the count
                                                               // as one
                            design.put(employee[i], design.get(employee[i]) + 1);
                        } else {
                            design.put(employee[i], 1);
                        }

                    }
                    if (listlength.contains(employee[i])) {

                        smalllistlength.add(employee[i]);
                        if (length.containsKey(employee[i])) {
                            length.put(employee[i], length.get(employee[i]) + 1);
                        } else {
                            length.put(employee[i], 1);
                        }

                    }
                    if (listmaterial.contains(employee[i])) {

                        smalllistmaterial.add(employee[i]);
                        if (material.containsKey(employee[i])) {
                            material.put(employee[i], material.get(employee[i]) + 1);
                        } else {
                            material.put(employee[i], 1);
                        }
                    }
                    if (listneckline.contains(employee[i])) {

                        smalllistneckline.add(employee[i]);
                        if (neckline.containsKey(employee[i])) {
                            neckline.put(employee[i], neckline.get(employee[i]) + 1);
                        } else {
                            neckline.put(employee[i], 1);
                        }
                    }
                    if (listoccassion.contains(employee[i])) {

                        smalllistoccassion.add(employee[i]);
                        if (occasion.containsKey(employee[i])) {
                            occasion.put(employee[i], occasion.get(employee[i]) + 1);
                        } else {
                            occasion.put(employee[i], 1);
                        }
                    }
                    if (listshape.contains(employee[i])) {

                        smalllistshape.add(employee[i]);
                        if (shape.containsKey(employee[i])) {
                            shape.put(employee[i], shape.get(employee[i]) + 1);
                        } else {
                            shape.put(employee[i], 1);
                        }
                    }
                    if (listsleeve.contains(employee[i])) {

                        smalllistsleeve.add(employee[i]);
                        if (sleeve.containsKey(employee[i])) {
                            sleeve.put(employee[i], sleeve.get(employee[i]) + 1);
                        } else {
                            sleeve.put(employee[i], 1);
                        }
                    }
                    if (listweather.contains(employee[i].toString())) {

                        smalllistweather.add(employee[i]);
                        if (weather.containsKey(employee[i])) {
                            weather.put(employee[i], weather.get(employee[i]) + 1);
                        } else {
                            weather.put(employee[i], 1);
                        }

                    }
                }
                // printing the tags of each product description
                for (int i = 0; i < smalllistdesign.size(); i++) {
                    System.out.println(key + " " + "DESIGN- " + smalllistdesign.get(i));
                }

                for (int i = 0; i < smalllistlength.size(); i++) {
                    System.out.println(key + " " + "LENGTH- " + smalllistlength.get(i));
                }

                for (int i = 0; i < smalllistmaterial.size(); i++) {
                    System.out.println(key + " " + "MATERIAL- " + smalllistmaterial.get(i));
                }

                for (int i = 0; i < smalllistneckline.size(); i++) {
                    System.out.println(key + " " + "NECKLINE- " + smalllistneckline.get(i));
                }

                for (int i = 0; i < smalllistoccassion.size(); i++) {
                    System.out.println(key + " " + "OCCASION- " + smalllistoccassion.get(i));
                }

                for (int i = 0; i < smalllistshape.size(); i++) {
                    System.out.println(key + " " + "SHAPE- " + smalllistshape.get(i));
                }

                for (int i = 0; i < smalllistsleeve.size(); i++) {
                    System.out.println(key + " " + "SLEEVE- " + smalllistsleeve.get(i));
                }

                for (int i = 0; i < smalllistweather.size(); i++) {
                    System.out.println(key + " " + "WEATHER- " + smalllistweather.get(i));
                }
                ;

                ++key;
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // bonus task

        // summary report of all the data that have been extracted
        // count of how many products does each tag contain
        design.forEach((k, v) -> System.out.println(k + " appeared " + v + " times"));
        length.forEach((k, v) -> System.out.println(k + " appeared " + v + " times"));
        material.forEach((k, v) -> System.out.println(k + " appeared " + v + " times"));
        neckline.forEach((k, v) -> System.out.println(k + " appeared " + v + " times"));
        occasion.forEach((k, v) -> System.out.println(k + " appeared " + v + " times"));
        shape.forEach((k, v) -> System.out.println(k + " appeared " + v + " times"));
        sleeve.forEach((k, v) -> System.out.println(k + " appeared " + v + " times"));
        weather.forEach((k, v) -> System.out.println(k + " appeared " + v + " times"));
    }
}

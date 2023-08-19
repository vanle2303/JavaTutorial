package tutorials.tutorials06_classes.classes12_nested_inner_classes;

/**
 * This class demos basic idea of a dictionary using a static inner class
 * This program works pretty much like class Stack, both of which consist of methods push and get.
 *
 * Method push is used to add a pair (a word and its translation) into the dictionary.
 * So essentially, a dictionary holds a array of pairs. For this reason, we create class Pair,
 * which is an inner class of Dictionary; inner bc it is only used inside Dictionary.
 *
 * Method get is used to get the translation of a given word out of the Dictionary.
 * We want method get to return a String; this simplifies the use of this class to the users.
 * They dont need to know abt class Pair bc we abstract all of that complexity inside method get.
 *
 */
public class Demo2DictionaryApplication {

    //An array to hold the data (words and their translations)
    Pair[] pairs;

    //This is to keep track of the end of the non-empty part of the array.
    //Note that eventho the length of the array can be 100, most of them can be empty.
    //Therefore, we need this index to bound our search, then we wont get NullPointerException
    int topOfDic;

    //a constructor for Dictionary
    Demo2DictionaryApplication(int size) {
        pairs = new Pair[size];
        topOfDic = -1;
    }

    /**
     * a method to push a pair of keyword and meaning onto the dictionary
     * @param pair
     */
    void push(Pair pair) {
        if (topOfDic == (pairs.length - 1)) {
            System.out.println("The dictionary is full.");
            return;
        }
        pairs[++topOfDic] = pair;
    }

    /**
     * this method is to get the meaning of a given keyword
     * @param key
     * @return
     */
    String get(String key) {
        if (topOfDic == -1) {
            System.out.println("The dictionary underflow.");
            return null;
        }

        //Here, if we set i < pairs.length, and if length = 10, and topOfDic is 2
        //We would get "NullPointerException"
        //That is bc beyond topOfDic, all the elemetns of array pairs are null
        for (int i = 0; i <= topOfDic; i++) {
            if (pairs[i].getKey() == key) {
                return pairs[i].getMeaning();
            }
        }
        return null;
    }

    //An inner class Pair consisting of two instance vars: key and meaning
    //Bc class Pair is only used inside class Dictionary, we make it an inner class of Dictionary
    //Should it be used anywhere else, we would make it a separate public class
    static class Pair {
        //This is a word that we want to look up for its meaning
        private String key;
        //This is the translation/meaning
        private String meaning;

        //We pass a key and its meaning to the constructor, therefore, we dont need setter for them
        Pair(String key, String meaning) {
            this.key = key;
            this.meaning = meaning;
        }

        public String getKey() {
            return key;
        }

        public String getMeaning() {
            return meaning;
        }

    }
}

class DictionaryTest {
    public static void main(String[] args) {
        Demo2DictionaryApplication demo2DictionaryApplication = new Demo2DictionaryApplication(10);

        //Create some data (pairs of words and their meanings)
        Demo2DictionaryApplication.Pair pair1 = new Demo2DictionaryApplication.Pair("hello", "xin chao");
        Demo2DictionaryApplication.Pair pair2 = new Demo2DictionaryApplication.Pair("bye", "tam biet");

        //In order to call a method, we need to use an object of the class that holds the method
        //For example, we wanna call method push, we must use an obj of the Dictionary type, dictionary, to call it
        //Add the data into the dictionary to be used later for lookup
        demo2DictionaryApplication.push(pair1);
        demo2DictionaryApplication.push(pair2);

        //Do some lookups for meanings of some words
        System.out.println(demo2DictionaryApplication.get("hello"));
        System.out.println(demo2DictionaryApplication.get("bye"));
        System.out.println(demo2DictionaryApplication.get("love"));
    }
}

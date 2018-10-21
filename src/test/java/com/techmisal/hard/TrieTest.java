package trie;

import java.util.ArrayList;

/**
 * @author Kashish Soni.
 */

public class TrieTest {
    public void setUp() {
        new TrieTest();
    }

    public void shouldReturnTrueIfStringIsFound() {
        ArrayList<String> s = new ArrayList<String>();
        s.add("Kashish");
        s.add("Pedro");
        s.add("Lorem");
        s.add("ipsum");
        s.add("dolor");
        s.add("sit");
        s.add("amet");
        Trie root = new Trie();
        for (int i = 0; i < s.size(); i++) {
            root.insertIntoTrie(root, s.get(i));
        }
        assert (root.searchInTrie(root, "Kashish"))==true;
    }
    public void shouldReturnTrueIfStringIsFound1() {
        String s = "Kashish Kashisk Lorem ipsum dolor dolo sit si amrt amet";
        String[] arr = s.split(" ");
        Trie root = new Trie();
        for (int i = 0; i < arr.length; i++) {
            root.insertIntoTrie(root, arr[i]);
        }
        // System.out.println("Code checking");
        assert (root.searchInTrie(root, "Kashish"))==true;
        assert (root.searchInTrie(root, "Kashisk"))==true;
        assert (root.searchInTrie(root, "Kashis"))==false;
        assert (root.searchInTrie(root, "dolo"))==true;
    }
}
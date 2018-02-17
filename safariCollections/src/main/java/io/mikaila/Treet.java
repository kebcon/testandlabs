package io.mikaila;
import java.util.Arrays;
import java.util.Date;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
public class Treet implements Comparable<Treet>, Serializable{
        //new instance
        //private boolean mBreakIt = true;

        private String mAuthor;
        private String mDescription;
        private Date mCreationDate;

        public Treet(String author, String description, Date creationDate) {
            mAuthor = author;
            mDescription = description;
            mCreationDate = creationDate;
        }

        @Override
        public String toString() {
            return String.format("Treet:  \"%s\" by %s on %s", mDescription, mAuthor, mCreationDate);
        }

        public String getAuthor() {
            return mAuthor;
        }

        public String getDescription() {
            return mDescription;
        }

        public Date getCreationDate() {
            return mCreationDate;
        }

        public List<String> getWords() {
            String[] words =  mDescription.toLowerCase().split("[^\\w#@']+");
            return Arrays.asList(words);
         }

    @Override
    public int compareTo(Treet other) {
        if(equals(other)){ //if obj equals other
            return 0;
        }

        //compare creation dates
        int dateComp = mCreationDate.compareTo(other.mCreationDate);
        if(dateComp == 0){
        return  mDescription.compareTo(other.mDescription);
        }
        return dateComp;
    }

    //Return the List Interface
    public List<String> getHashTags(){

        return getWordsPrefixedWith("#");

    }

    public List<String>getMentions(){

         return getWordsPrefixedWith("@");

    }

    private  List<String>getWordsPrefixedWith(String prefix){
        List<String> results = new ArrayList<>();
        for(String word: getWords()){
            if(word.startsWith(prefix)){
                results.add(word);
            }
        }
        return results;

    }




}
*/
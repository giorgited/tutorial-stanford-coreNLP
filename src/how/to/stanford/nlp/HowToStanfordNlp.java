package how.to.stanford.nlp;

/*---------------------------*/
//To have the supporting libraries of Stanford NLP, download the CoreNLP from https://stanfordnlp.github.io/CoreNLP/download.html
//Add all the .jar files to the libraries included the source, models and protobuf

import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.simple.*;
import java.util.*;

public class HowToStanfordNlp {

    public static void main(String[] args) {
        /*
        Stanford NLP supports the Following Annotators:
        Tokenization   
            usage: sent.words()   |   sent.word(int)
        Sentence Splitting
            usage:  doc.sentences()  | doc.sentence(int)
        Lemmatization
            usage:   
        Named Entity Recognition
            usage:
        Constituency Parsing
            usage:
        Dependency Parsing
            usage:
        Coreference Resolution
            usage:
        natural logic polarity
            usage:
        open information extraction
            usage:
        */
        Document doc = new Document("This is a sample text! We are going to show the usage of each stanford NLP annotator usage. I hope you find this helpful. ");
        System.out.println ("Demo of splitting text into sentences. ");
        System.out.println (doc.sentences());
        
        
        for (int i=0; i<doc.sentences().size(); i++){
            System.out.println ("------------------");
            System.out.println ("Sentence " + (i+1) + " :");
            
            System.out.println ("Demo of sentence into words. ");
            System.out.println (doc.sentence(i).words());
            // part of speech tagging
            System.out.println ("Demo of POS tagging. ");
            System.out.println (doc.sentence(i).posTags());
            // lemmatization
            System.out.println ("Demo of lemma tagging. ");
            System.out.println (doc.sentence(i).lemmas());
            System.out.println ("------------------");
            System.out.println("");
        }
//        System.out.println("------The following is annotated on single sentence------ ");
//        for (Sentence sent : doc.sentences()) {  // iterate over all sentences in doc
//            System.out.println("The tokenized words of '" + sent + "' are " + sent.words());
//            // We're only asking for words -- no need to load any models yet
//            System.out.println("The second word of the sentence '" + sent + "' is " + sent.word(1));
//            // When we ask for the lemma, it will load and run the part of speech tagger
//            System.out.println("The third lemma of the sentence '" + sent + "' is " + sent.lemma(2));
//            // When we ask for the parse, it will load and run the parser
//            System.out.println("The parse of the sentence '" + sent + "' is " + sent.parse());
//            System.out.println("--------------------------------------------------------- ");
//        }
    }
}

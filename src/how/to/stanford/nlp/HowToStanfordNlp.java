package how.to.stanford.nlp;

/*-----------IMPORTANT----------------*/
//To have the supporting libraries of Stanford NLP, download the CoreNLP from https://stanfordnlp.github.io/CoreNLP/download.html
//Add all the .jar files to the libraries
//For this specific project you will need the following libraries:
//  stanford-corenlp-3.8.0-javadoc.jar
//  stanford-corenlp-3.8.0-models.jar
//  stanford-corenlp-3.8.0-sources.jar
//  stanford-corenlp-3.8.0.jar
//  protobuf.jar

import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.simple.*;
import java.util.*;

public class HowToStanfordNlp {

    public static void main(String[] args) {
        /*
        Stanford NLP supports the Following Annotators:
        Tokenization   
            usage:  sentence.words()   |   sentence.word(int)
        Sentence Splitting
            usage:  doc.sentences()  | doc.sentence(int)
        Lemmatization
            usage:   sentence.lemmas() | sentence.lemma(int)
        Named Entity Recognition
            usage:   sentence.nerTags() | sentence.nerTag(int)
        Constituency Parsing
            usage:   sentence.parse()
        Dependency Parsing
            usage:   sentence.governor(int | sentence.incomingDependencyLabel(int)
        Coreference Resolution
            usage:  doc.coref()
        natural logic polarity
            usage:  sentence.natlogPolarities()  | sentence.natlogPolarity(int)
        open information extraction
            usage:  sentence.openie() | sentence.openieTriples()
        */
        Document doc = new Document("This is a sample text! We are going to show the usage of each stanford NLP annotator usage. I hope you find this helpful. ");
        System.out.println ("Demo of splitting text into sentences. ");
        System.out.println (doc.sentences());
        System.out.println ("Demo of coreference resolution. ");
        System.out.println (doc.coref());
        
        for (int i=0; i<doc.sentences().size(); i++){
            System.out.println ("------------------");
            System.out.println ("Sentence " + (i+1) + " :");
            
            System.out.println ("Demo of splitting sentence into words. ");
            System.out.println (doc.sentence(i).words());
            // part of speech tagging
            System.out.println ("Demo of POS tagging. ");
            System.out.println (doc.sentence(i).posTags());
            // lemmatization
            System.out.println ("Demo of lemma tagging. ");
            System.out.println (doc.sentence(i).lemmas());
            // Named Entity Recognition
            System.out.println ("Demo of named entity recognition ");
            System.out.println (doc.sentence(i).nerTags());
            // Constituency Recognition
            System.out.println ("Demo of constituency parsing ");
            System.out.println (doc.sentence(i).parse());
            // Dependancy Parsing
            System.out.println ("Demo of dependancy parsing ");
            System.out.println (doc.sentence(i).governor(3));
             // Natural Logic Polarity
            System.out.println ("Demo of natural logic polarity ");
            System.out.println (doc.sentence(i).natlogPolarities());
            // Open Information Extraction
            System.out.println ("Demo of open information extraction");
            System.out.println (doc.sentence(i).openie());
            System.out.println ("------------------");
            System.out.println("");
        }
    }
}

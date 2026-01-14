public class Main {



    public static void main(String[] args) {

        String dnaNucleotidesSequence = "cctagt";
        DNAStrand dna1 = new DNAStrand(dnaNucleotidesSequence);
        System.out.printf("%22s: %s%n", "DNA strand", dna1);
        System.out.printf("%22s: %s%n",  "Transcribed RNA strand", dna1.getRNACompliment());
    }
}

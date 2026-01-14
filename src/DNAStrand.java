public record DNAStrand(String dnaNucleotidesSequence) {

    public DNAStrand(String dnaNucleotidesSequence) {
        this.dnaNucleotidesSequence = dnaNucleotidesSequence.toUpperCase();
    }


    record RNAStrand(String rnaNucleotidesSequence) {


        @Override
        public String toString() {
            return rnaNucleotidesSequence;
        }
    }

    private String transcribeRNA() {
        StringBuilder rnaNucleotideSequence = new StringBuilder();
        for (int i = 0; i < dnaNucleotidesSequence.length(); i++) {
            char nucleotide;
            switch(dnaNucleotidesSequence.toUpperCase().charAt(i)) {
                case 'C' -> nucleotide = 'G';
                case 'T' -> nucleotide = 'A';
                case 'A' -> nucleotide = 'U';
                default -> nucleotide = 'C';
            }
            rnaNucleotideSequence.append(nucleotide);
        }
        return rnaNucleotideSequence.toString();
    }

    public RNAStrand getRNACompliment() {
        return new RNAStrand(transcribeRNA());
    }



    @Override
    public String toString() {
        return dnaNucleotidesSequence;
    }
}

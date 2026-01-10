public record DNAStrand(String nucleotidesSequence) {

    public String getRNACompliment() {
        return null;
    }

    record RNAStrand(String nucleotidesSequence) {

    }
}

class RnaTranscription {

    String transcribe(String dnaStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String rna ="";
        for (int i = 0; i < dnaStrand.length(); i++) {
             if(dnaStrand.charAt(i) == 'G')
                rna+="C";
            if(dnaStrand.charAt(i) == 'C')
                rna+="G";
            if(dnaStrand.charAt(i) == 'T')
                rna+="A";
            if(dnaStrand.charAt(i) == 'A')
                rna+="U";
        }
        return rna;
    }

}

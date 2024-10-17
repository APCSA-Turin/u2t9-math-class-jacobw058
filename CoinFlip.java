public class CoinFlip {
    private CoinFlip() {
    }

    public String flip() {
        int num1 = (int) (Math.random() * 2);
        if (num1 == 0) {
            return "tails";
        } else {
            return "heads";
        }
    }

    public double simulate(int numFlips) {
        int numHeads = 0;
        int numTails = 0;
        for (int i =0; i < numFlips; i++) {
            String flip = flip();
            if (flip.equals("tails")) {
                numTails++;
            } else {
                numHeads++;
            }
        }
        double percentHeads = (double) numHeads / numTails;
        return percentHeads;
    }
}

public class Printer {
    private int tonnerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonnerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonnerLevel = tonnerLevel >= 0 && tonnerLevel <= 100 ? tonnerLevel : -1;
        this.duplex = duplex;
    }

    public int addTonner(int tonerAmount){
        int tempAmount = tonerAmount + tonnerLevel;
        if(tempAmount > 100 || tempAmount < 0) return  -1;
        tonnerLevel += tonerAmount;
        return  tonnerLevel;
    }
    public int printPage(int pages){
        int jobPages = duplex ? pages/2 + pages % 2 : pages;
        pagesPrinted += jobPages;
        return  jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

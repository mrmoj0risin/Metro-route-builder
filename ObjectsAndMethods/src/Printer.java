public class Printer {

    private String queue = "";
    private int pagesCount = 100;
    private int pagesPrinted = 0;


    public void append(String text){
        this.queue += "\n" + text + " ";
    }

    public void append(String text, int pages){
        append(text);

        this.pagesCount -= pages;
        this.pagesPrinted += pages;
    }

    public void append(String text, int pages, String name) {
        append(text, pages);
        System.out.println(name + " is added");
    }

    public void clearQueue(){
        this.queue = "";
    }

    public void print(){
        System.out.println(this.queue);
        clearQueue();
    }

    public int getPendingPagesCount(){
        return this.pagesCount;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

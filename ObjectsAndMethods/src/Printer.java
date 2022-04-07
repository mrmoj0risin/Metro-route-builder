 class Printer {

    private String queue = "";
    private int pagesCount = 100;
    private int pagesPrinted = 0;


     void append(String text){
        this.queue += "\n" + text + " ";
    }

     void append(String text, int pages){
        append(text);

        this.pagesCount -= pages;
        this.pagesPrinted += pages;
    }

     void append(String text, int pages, String name) {
        append(text, pages);
        System.out.println(name + " is added");
    }

     void clearQueue(){
        this.queue = "";
    }

     void print(){
        System.out.println(this.queue);
        clearQueue();
    }

     int getPendingPagesCount(){
        return this.pagesCount;
    }

     int getPagesPrinted() {
        return pagesPrinted;
    }
}

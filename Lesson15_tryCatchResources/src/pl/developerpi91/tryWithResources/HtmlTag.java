package pl.developerpi91.tryWithResources;

public class HtmlTag implements AutoCloseable{
    private String tagName;

    public HtmlTag(String tag) {
        this.tagName=tag;
        System.out.printf("<%s>",this.tagName);
        System.out.println();
    }

    public void body(String bodyText){
        System.out.println(bodyText);

    }
    @Override
    public void close() throws Exception {

        System.out.printf("</%s>",this.tagName);
        System.out.println();

    }
}

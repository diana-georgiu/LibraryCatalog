public class Album extends Book {

    private String paperQuality;

    public Album(String name,int pages, String paperQuality)
    {
        super(name,pages);
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString()
    {
        return "ALBUM: " + super.toString() + "paper quality = '" + paperQuality + "'";
    }

}

public class Novel extends Book{

    private String type;

    public Novel(String name,int pages, String type)
    {
        super(name,pages);
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "NOVEL: " + super.toString() + "type = '" + type + "'";
    }
}

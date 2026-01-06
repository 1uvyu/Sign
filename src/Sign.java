public class Sign
{
    private String message;
    private int width;

    public Sign(String message, int width)
    {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines()
    {
        String str = message;
        int count = 0;
        while (str.length() > width)
        {
            str = str.substring(width);
            count++;
        }
        if (str.length() > 0) count ++;
        return count;
    }

    public String getLines()
    {
        if (message.length() > 0)
        {
            String str = message.substring(0, width);
            for (int i = 0; i < message/width; i++)
            {
                str += ";";
                return str;
            }
        }
        return null;
    }
}
// message.substring(0, width);

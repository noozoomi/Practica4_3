package reviews.data;

public class Reviews
{
    private User user;
    private String comment;
    private int rating;
    private Business business;

    public Reviews(User user, String comment, int rating)
    {
        this.user = user;
        this.comment = comment;
        this.rating = rating;
    }

    public User getUser()
    {
        return user;
    }

    public String getComment()
    {
        return comment;
    }

    public int getRating()
    {
        return rating;
    }

    public void setUser(User u)
    {
        user = u;
    }

    public void setComment(String c)
    {
        comment = c;
    }

    public void setRating(int r)
    {
        rating = r;
    }
}

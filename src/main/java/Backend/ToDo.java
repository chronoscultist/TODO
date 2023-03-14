package Backend;
import java.time.LocalDate;


public class ToDo{

    private static String title;
    private String description;
    private String userCreator;
    private String dateStart,dateEnd;
    private LocalDate createdAt;
    private Boolean status;

    public ToDo(String title, String description, String userCreator,String dateStart,
                String dateEnd, Boolean status){
        this.title = title;
        this.description = description;
        this.userCreator = userCreator;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.status = status;
    }

    public ToDo() {

    }


    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;

    }

    public String getUserCreator() {
        return userCreator;
    }

    public void setUserCreator(String userCreator) {
        this.userCreator = userCreator;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public String getDateStart() {
        return dateStart;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt() {
        this.createdAt = createdAt;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = String.valueOf(dateEnd);
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = String.valueOf(dateStart);
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

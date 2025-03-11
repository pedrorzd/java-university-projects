package Actions;

public class Delivery {
    private int order;
    private String collaborator;

    public int getOrder(){
        return order;
    }

    public String getCollaborator(){
        return collaborator;
    }

    public String setCollaborator(String collaborator){
        return this.collaborator = collaborator;
    }

}

package errorssextentions;

public class ResourceMain {
    public static void main(String[] args) {
        Resource resource = new Resource();
        try {
            ResourceAction.load(resource);
        } catch (ResourceExceptions e) {
            //
        }
    }

}

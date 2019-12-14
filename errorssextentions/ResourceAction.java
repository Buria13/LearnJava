package errorssextentions;

public class ResourceAction extends Resource{
    public static void load(Resource resource) throws ResourceExceptions {
        if(resource == null || !resource.exists() || !resource.isCreate()) {
            throw new ResourceExceptions("!!!ERR!!!");
        }

    }
}

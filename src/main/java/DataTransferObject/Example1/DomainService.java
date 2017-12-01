package DataTransferObject.Example1;

public class DomainService {

    public DomainObjectDTO getData(){
        DomainObject domainObject = getObject();

        DomainObjectDTO domainObjectDTO = new DomainObjectDTO();
        domainObjectDTO.setProperty(domainObject.getProperty());


        return domainObjectDTO;
    }

    private DomainObject getObject(){
        return new DomainObject();
    }
}

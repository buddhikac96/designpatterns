package proxy;

public class DBHandlerProxy implements IDBHandler {

    private SQLDbHandler sqlDbHandler;
    private String role;

    public DBHandlerProxy(String role) {
        this.role = role;
    }

    @Override
    public boolean add() {
        System.out.println("Item added successfully");
        return true;
    }

    @Override
    public Object get() {
        System.out.println("Item return successfully");
        return new String("Result");
    }

    @Override
    public boolean edit() {
        if(this.role.equals("admin")){
            System.out.println("Edited successfully");
            return true;
        }else{
            System.out.println("Can't edit due to auth");
            return false;
        }
    }

    @Override
    public boolean delete() {
        if(this.role.equals("admin")){
            System.out.println("Item deleted successfully");
            return true;
        }else{
            System.out.println("Can't delete item due to auth");
            return false;
        }
    }
}

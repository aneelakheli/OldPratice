import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

pubic class Server extends ServerImpl
{
    public static void main(String[] args)
    {

        try{
            ServerImpl obj = new ServerImpl();
             ServerInterface  stub = UnicastRemoteObject.exportObject(obj,0);
             Registry registry = LocateRegistry.getRegistry();
             registry.bind("ServerInterface", stub);
             System.out.println("Server Ready");
        
        
        }catch(Exception e){
            System.out.println("ServerException: " +e.toString());


        }
    }
}